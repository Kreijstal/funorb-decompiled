/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends ka {
    static int field_v;
    private short field_w;
    private boolean field_z;
    private float[][] field_a;
    private short field_j;
    private short field_r;
    private boolean field_n;
    private cs[] field_p;
    private int[] field_y;
    private short field_d;
    private short[] field_l;
    private byte[] field_h;
    private short[] field_m;
    private byte[] field_k;
    private float[][] field_q;
    private sob field_f;
    private int field_A;
    private int[] field_o;
    private short[] field_g;
    private short[] field_b;
    private int field_t;
    private short[] field_s;
    private int field_x;
    private ffa[] field_i;
    private int field_u;
    private int field_c;
    private int[] field_e;

    final void H(int param0, int param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            if ((this.field_x & 1) == 1) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L1: {
          if (param1 == 0) {
            break L1;
          } else {
            if ((this.field_x & 2) == 2) {
              break L1;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L2: {
          if (param2 == 0) {
            break L2;
          } else {
            if ((this.field_x & 4) == 4) {
              break L2;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        var4 = this;
        synchronized (var4) {
          L3: {
            var5 = 0;
            L4: while (true) {
              if (var5 >= this.field_u) {
                break L3;
              } else {
                this.field_e[var5] = this.field_e[var5] + param0;
                this.field_o[var5] = this.field_o[var5] + param1;
                this.field_y[var5] = this.field_y[var5] + param2;
                var5++;
                continue L4;
              }
            }
          }
        }
    }

    final void O(int param0, int param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 128) {
            break L0;
          } else {
            if ((this.field_x & 1) == 1) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L1: {
          if (param1 == 128) {
            break L1;
          } else {
            if ((this.field_x & 2) == 2) {
              break L1;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L2: {
          if (param2 == 128) {
            break L2;
          } else {
            if ((this.field_x & 4) == 4) {
              break L2;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        var4 = this;
        synchronized (var4) {
          L3: {
            var5 = 0;
            L4: while (true) {
              if (var5 >= this.field_u) {
                this.field_n = false;
                break L3;
              } else {
                this.field_e[var5] = this.field_e[var5] * param0 >> 7;
                this.field_o[var5] = this.field_o[var5] * param1 >> 7;
                this.field_y[var5] = this.field_y[var5] * param2 >> 7;
                var5++;
                continue L4;
              }
            }
          }
        }
    }

    final int G() {
        if (!this.field_n) {
            this.a();
        }
        return this.field_r;
    }

    final int V() {
        if (!this.field_n) {
            this.a();
        }
        return this.field_j;
    }

    final int HA() {
        if (!this.field_n) {
            this.a();
        }
        return this.field_w;
    }

    private final void a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
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
        if (!this.field_n) {
          var1 = 0;
          var2 = 0;
          var3 = 32767;
          var4 = 32767;
          var5 = 32767;
          var6 = -32768;
          var7 = -32768;
          var8 = -32768;
          var9 = 0;
          L0: while (true) {
            if (var9 >= this.field_A) {
              this.field_j = (short)var3;
              this.field_d = (short)var6;
              this.field_w = (short)var5;
              this.field_r = (short)var8;
              this.field_n = true;
              return;
            } else {
              L1: {
                var10 = this.field_e[var9];
                var11 = this.field_o[var9];
                var12 = this.field_y[var9];
                if (var10 >= var3) {
                  break L1;
                } else {
                  var3 = var10;
                  break L1;
                }
              }
              L2: {
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var11 >= var4) {
                  break L3;
                } else {
                  var4 = var11;
                  break L3;
                }
              }
              L4: {
                if (var11 <= var7) {
                  break L4;
                } else {
                  var7 = var11;
                  break L4;
                }
              }
              L5: {
                if (var12 >= var5) {
                  break L5;
                } else {
                  var5 = var12;
                  break L5;
                }
              }
              L6: {
                if (var12 <= var8) {
                  break L6;
                } else {
                  var8 = var12;
                  break L6;
                }
              }
              L7: {
                var13 = var10 * var10 + var12 * var12;
                if (var13 <= var1) {
                  break L7;
                } else {
                  var1 = var13;
                  break L7;
                }
              }
              var13 = var13 + var11 * var11;
              if (var13 > var2) {
                var2 = var13;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final int RA() {
        if (!this.field_n) {
            this.a();
        }
        return this.field_d;
    }

    b(sob param0) {
        this.field_n = false;
        this.field_A = 0;
        this.field_z = false;
        this.field_u = 0;
        this.field_c = 0;
        this.field_f = param0;
    }

    b(sob param0, cbb param1, int param2, int param3, int param4, int param5) {
        int[][] discarded$3 = null;
        int[][] discarded$4 = null;
        int[][] discarded$5 = null;
        d var7 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        int var11_int = 0;
        kua var11 = null;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        opa var18 = null;
        int var19_int = 0;
        float[] var19 = null;
        float[] var20 = null;
        sr var21_ref_sr = null;
        int var21 = 0;
        opa var22_ref_opa = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        float var29 = 0.0f;
        int var30 = 0;
        float var30_float = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34_float = 0.0f;
        int var34 = 0;
        float var35_float = 0.0f;
        int var35 = 0;
        float var36_float = 0.0f;
        int var36 = 0;
        float var37_float = 0.0f;
        int var37 = 0;
        float var38_float = 0.0f;
        int var38 = 0;
        float var39_float = 0.0f;
        int var39 = 0;
        float var40_float = 0.0f;
        int var40 = 0;
        float var41_float = 0.0f;
        int var41 = 0;
        float var42_float = 0.0f;
        int var42 = 0;
        float var43 = 0.0f;
        float var44 = 0.0f;
        float var45 = 0.0f;
        float var46 = 0.0f;
        float var47 = 0.0f;
        float var48 = 0.0f;
        float var49 = 0.0f;
        float var50 = 0.0f;
        float var51 = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        int var54 = 0;
        bqa var56 = null;
        opa var57 = null;
        long[] var58 = null;
        bqa var59 = null;
        sr var60 = null;
        co var61 = null;
        opa var62 = null;
        float[] var65 = null;
        float[] var66 = null;
        long[] var68 = null;
        int[] var74 = null;
        float[] var75 = null;
        float[] var76 = null;
        int stackIn_6_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_61_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        short stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        this.field_n = false;
        this.field_A = 0;
        this.field_z = false;
        this.field_u = 0;
        this.field_c = 0;
        this.field_f = param0;
        this.field_x = param2;
        var7 = this.field_f.field_a;
        this.field_u = param1.field_s;
        this.field_A = param1.field_D;
        this.field_e = param1.field_v;
        this.field_o = param1.field_G;
        this.field_y = param1.field_x;
        this.field_c = param1.field_j;
        this.field_l = param1.field_k;
        this.field_m = param1.field_o;
        this.field_s = param1.field_K;
        this.field_k = param1.field_m;
        this.field_h = param1.field_r;
        var74 = new int[this.field_c];
        var9_int = 0;
        L0: while (true) {
          if (var9_int >= this.field_c) {
            L1: {
              var68 = new long[this.field_c];
              var58 = var68;
              var9 = var58;
              if ((this.field_x & 256) == 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var10 = stackIn_6_0;
            var11_int = 0;
            L2: while (true) {
              if (var11_int >= this.field_c) {
                L3: {
                  kn.a((byte) -24, var74, var68);
                  if (param1.field_g == null) {
                    break L3;
                  } else {
                    this.field_t = param1.field_g.length;
                    this.field_i = new ffa[this.field_t];
                    this.field_p = new cs[this.field_t];
                    var54 = 0;
                    var11_int = var54;
                    L4: while (true) {
                      if (var54 >= param1.field_g.length) {
                        break L3;
                      } else {
                        L5: {
                          var59 = param1.field_g[var54];
                          var60 = jm.a(var59.field_e, 0);
                          var14 = mpb.field_h[param1.field_b[var59.field_b] & 65535] & 16777215;
                          stackOut_49_0 = var14;
                          stackOut_49_1 = 255;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          if (param1.field_r == null) {
                            stackOut_51_0 = stackIn_51_0;
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L5;
                          } else {
                            stackOut_50_0 = stackIn_50_0;
                            stackOut_50_1 = stackIn_50_1;
                            stackOut_50_2 = param1.field_r[var59.field_b] & 255;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            stackIn_52_2 = stackOut_50_2;
                            break L5;
                          }
                        }
                        var14 = stackIn_52_0 | stackIn_52_1 - stackIn_52_2 << 24;
                        this.field_i[var54] = new ffa(var59.field_b, (int) param1.field_k[var59.field_b], (int) param1.field_o[var59.field_b], (int) param1.field_K[var59.field_b], var60.field_g, var60.field_b, var60.field_e, var60.field_d, var60.field_f, var60.field_a, var59.field_c);
                        this.field_p[var54] = new cs(var14);
                        var54++;
                        continue L4;
                      }
                    }
                  }
                }
                this.field_q = new float[this.field_c][];
                this.field_a = new float[this.field_c][];
                var11 = ao.a(param1, var74, this.field_c, -3);
                var61 = this.field_f.a((Runnable) ((Object) Thread.currentThread()));
                var76 = var61.field_a;
                var14 = 0;
                var15 = 0;
                L6: while (true) {
                  if (var15 >= this.field_c) {
                    L7: {
                      if (var14 != 0) {
                        break L7;
                      } else {
                        this.field_a = (float[][]) null;
                        this.field_q = (float[][]) null;
                        break L7;
                      }
                    }
                    L8: {
                      if (param1.field_p == null) {
                        break L8;
                      } else {
                        if ((this.field_x & 32) == 0) {
                          break L8;
                        } else {
                          discarded$3 = param1.a((byte) -37, true);
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param1.field_y == null) {
                        break L9;
                      } else {
                        if ((this.field_x & 384) == 0) {
                          break L9;
                        } else {
                          discarded$4 = param1.b(0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param1.field_g == null) {
                        break L10;
                      } else {
                        if ((this.field_x & 1024) == 0) {
                          break L10;
                        } else {
                          discarded$5 = param1.a(-125);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param1.field_u == null) {
                        this.field_b = null;
                        break L11;
                      } else {
                        this.field_b = new short[this.field_c];
                        var15 = 0;
                        var16 = 0;
                        L12: while (true) {
                          if (var16 >= this.field_c) {
                            if (var15 != 0) {
                              break L11;
                            } else {
                              this.field_b = null;
                              break L11;
                            }
                          } else {
                            var17 = param1.field_u[var16];
                            if (var17 == -1) {
                              this.field_b[var16] = (short)-1;
                              var16++;
                              continue L12;
                            } else {
                              L13: {
                                var18 = this.field_f.field_a.a(-20292, var17);
                                if ((param5 & 64) == 0) {
                                  break L13;
                                } else {
                                  if (var18.field_r) {
                                    this.field_b[var16] = (short)-1;
                                    var16++;
                                    continue L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                this.field_b[var16] = (short)var17;
                                var15 = 1;
                                if (var18.field_q != 2) {
                                  break L14;
                                } else {
                                  this.field_z = true;
                                  break L14;
                                }
                              }
                              if (var18.field_p == 0) {
                                if (var18.field_d != 0) {
                                  var16++;
                                  continue L12;
                                } else {
                                  var16++;
                                  continue L12;
                                }
                              } else {
                                var16++;
                                continue L12;
                              }
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (this.field_z) {
                        this.field_g = new short[this.field_c];
                        var15 = 0;
                        L16: while (true) {
                          if (var15 >= this.field_c) {
                            break L15;
                          } else {
                            this.field_g[var15] = (short)var74[var15];
                            var15++;
                            continue L16;
                          }
                        }
                      } else {
                        if (this.field_i == null) {
                          break L15;
                        } else {
                          this.field_g = new short[this.field_c];
                          var15 = 0;
                          L17: while (true) {
                            if (var15 >= this.field_c) {
                              break L15;
                            } else {
                              this.field_g[var15] = (short)var74[var15];
                              var15++;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L18: {
                      var16 = var74[var15];
                      if (param1.field_M != null) {
                        var17 = param1.field_M[var16];
                        break L18;
                      } else {
                        var17 = -1;
                        break L18;
                      }
                    }
                    L19: {
                      if (param1.field_u != null) {
                        stackOut_60_0 = param1.field_u[var16];
                        stackIn_61_0 = stackOut_60_0;
                        break L19;
                      } else {
                        stackOut_59_0 = -1;
                        stackIn_61_0 = stackOut_59_0;
                        break L19;
                      }
                    }
                    L20: {
                      var18_int = stackIn_61_0;
                      if (var18_int == -1) {
                        break L20;
                      } else {
                        if ((param5 & 64) == 0) {
                          break L20;
                        } else {
                          var62 = var7.a(-20292, var18_int & 65535);
                          if (!var62.field_r) {
                            break L20;
                          } else {
                            var18_int = -1;
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      if (var18_int == -1) {
                        break L21;
                      } else {
                        var14 = 1;
                        this.field_q[var16] = new float[3];
                        var65 = new float[3];
                        var19 = var65;
                        this.field_a[var16] = new float[3];
                        var66 = new float[3];
                        var20 = var66;
                        var21 = 0;
                        if (var17 != -1) {
                          var17 = var17 & 255;
                          var22 = param1.field_e[var17];
                          if (var22 != 0) {
                            var23 = this.field_l[var16];
                            var24 = this.field_m[var16];
                            var25 = this.field_s[var16];
                            var26 = var11.field_d[var17];
                            var27 = var11.field_b[var17];
                            var28 = var11.field_f[var17];
                            var75 = var11.field_c[var17];
                            var30 = param1.field_n[var17];
                            var31 = (float)param1.field_L[var17] / 256.0f;
                            if (var22 != 1) {
                              if (var22 != 2) {
                                if (var22 != 3) {
                                  break L21;
                                } else {
                                  oma.a(var75, this.field_y[var23], var31, var76, var28, this.field_e[var23], (byte) -82, var27, this.field_o[var23], var30, var26);
                                  var19[0] = var76[0];
                                  var20[0] = var76[1];
                                  oma.a(var75, this.field_y[var24], var31, var76, var28, this.field_e[var24], (byte) -82, var27, this.field_o[var24], var30, var26);
                                  var19[1] = var76[0];
                                  var20[1] = var76[1];
                                  oma.a(var75, this.field_y[var25], var31, var76, var28, this.field_e[var25], (byte) -82, var27, this.field_o[var25], var30, var26);
                                  var19[2] = var76[0];
                                  var20[2] = var76[1];
                                  if ((var30 & 1) != 0) {
                                    L22: {
                                      if (var66[1] - var66[0] <= 0.5f) {
                                        if (var66[0] - var66[1] <= 0.5f) {
                                          break L22;
                                        } else {
                                          var20[1] = var20[1] + 1.0f;
                                          break L22;
                                        }
                                      } else {
                                        var20[1] = var20[1] - 1.0f;
                                        break L22;
                                      }
                                    }
                                    if (var66[2] - var66[0] <= 0.5f) {
                                      if (var66[0] - var66[2] <= 0.5f) {
                                        break L21;
                                      } else {
                                        var20[2] = var20[2] + 1.0f;
                                        break L21;
                                      }
                                    } else {
                                      var20[2] = var20[2] - 1.0f;
                                      break L21;
                                    }
                                  } else {
                                    L23: {
                                      if (var65[1] - var65[0] <= 0.5f) {
                                        if (var65[0] - var65[1] <= 0.5f) {
                                          break L23;
                                        } else {
                                          var19[1] = var19[1] + 1.0f;
                                          break L23;
                                        }
                                      } else {
                                        var19[1] = var19[1] - 1.0f;
                                        break L23;
                                      }
                                    }
                                    if (var65[2] - var65[0] <= 0.5f) {
                                      if (var65[0] - var65[2] <= 0.5f) {
                                        break L21;
                                      } else {
                                        var19[2] = var19[2] + 1.0f;
                                        break L21;
                                      }
                                    } else {
                                      var19[2] = var19[2] - 1.0f;
                                      break L21;
                                    }
                                  }
                                }
                              } else {
                                var32 = (float)param1.field_f[var17] / 256.0f;
                                var33 = (float)param1.field_I[var17] / 256.0f;
                                var34 = this.field_e[var24] - this.field_e[var23];
                                var35 = this.field_o[var24] - this.field_o[var23];
                                var36 = this.field_y[var24] - this.field_y[var23];
                                var37 = this.field_e[var25] - this.field_e[var23];
                                var38 = this.field_o[var25] - this.field_o[var23];
                                var39 = this.field_y[var25] - this.field_y[var23];
                                var40 = var35 * var39 - var38 * var36;
                                var41 = var36 * var37 - var39 * var34;
                                var42 = var34 * var38 - var37 * var35;
                                var43 = 64.0f / (float)param1.field_F[var17];
                                var44 = 64.0f / (float)param1.field_a[var17];
                                var45 = 64.0f / (float)param1.field_C[var17];
                                var46 = ((float)var40 * var75[0] + (float)var41 * var75[1] + (float)var42 * var75[2]) / var43;
                                var47 = ((float)var40 * var75[3] + (float)var41 * var75[4] + (float)var42 * var75[5]) / var44;
                                var48 = ((float)var40 * var75[6] + (float)var41 * var75[7] + (float)var42 * var75[8]) / var45;
                                var21 = mpa.a(-44, var47, var46, var48);
                                dhb.a(var33, this.field_y[var23], var32, (byte) 109, this.field_e[var23], var28, this.field_o[var23], var21, var76, var26, var30, var75, var27, var31);
                                var19[0] = var76[0];
                                var20[0] = var76[1];
                                dhb.a(var33, this.field_y[var24], var32, (byte) 40, this.field_e[var24], var28, this.field_o[var24], var21, var76, var26, var30, var75, var27, var31);
                                var19[1] = var76[0];
                                var20[1] = var76[1];
                                dhb.a(var33, this.field_y[var25], var32, (byte) 19, this.field_e[var25], var28, this.field_o[var25], var21, var76, var26, var30, var75, var27, var31);
                                var19[2] = var76[0];
                                var20[2] = var76[1];
                                break L21;
                              }
                            } else {
                              var32 = (float)param1.field_C[var17] / 1024.0f;
                              ac.a(var75, var27, var30, var31, this.field_e[var23], this.field_o[var23], (byte) -52, var32, var28, var76, var26, this.field_y[var23]);
                              var19[0] = var76[0];
                              var20[0] = var76[1];
                              ac.a(var75, var27, var30, var31, this.field_e[var24], this.field_o[var24], (byte) -52, var32, var28, var76, var26, this.field_y[var24]);
                              var19[1] = var76[0];
                              var20[1] = var76[1];
                              ac.a(var75, var27, var30, var31, this.field_e[var25], this.field_o[var25], (byte) -52, var32, var28, var76, var26, this.field_y[var25]);
                              var19[2] = var76[0];
                              var20[2] = var76[1];
                              var33 = var32 / 2.0f;
                              if ((var30 & 1) != 0) {
                                L24: {
                                  if (var66[1] - var66[0] <= var33) {
                                    if (var66[0] - var66[1] <= var33) {
                                      break L24;
                                    } else {
                                      var20[1] = var20[1] + var32;
                                      break L24;
                                    }
                                  } else {
                                    var20[1] = var20[1] - var32;
                                    break L24;
                                  }
                                }
                                if (var66[2] - var66[0] <= var33) {
                                  if (var66[0] - var66[2] <= var33) {
                                    break L21;
                                  } else {
                                    var20[2] = var20[2] + var32;
                                    break L21;
                                  }
                                } else {
                                  var20[2] = var20[2] - var32;
                                  break L21;
                                }
                              } else {
                                L25: {
                                  if (var65[1] - var65[0] <= var33) {
                                    if (var65[0] - var65[1] <= var33) {
                                      break L25;
                                    } else {
                                      var19[1] = var19[1] + var32;
                                      break L25;
                                    }
                                  } else {
                                    var19[1] = var19[1] - var32;
                                    break L25;
                                  }
                                }
                                if (var65[2] - var65[0] <= var33) {
                                  if (var65[0] - var65[2] <= var33) {
                                    break L21;
                                  } else {
                                    var19[2] = var19[2] + var32;
                                    break L21;
                                  }
                                } else {
                                  var19[2] = var19[2] - var32;
                                  break L21;
                                }
                              }
                            }
                          } else {
                            var23 = this.field_l[var16];
                            var24 = this.field_m[var16];
                            var25 = this.field_s[var16];
                            var26 = param1.field_t[var17];
                            var27 = param1.field_i[var17];
                            var28 = param1.field_H[var17];
                            var29 = (float)this.field_e[var26];
                            var30_float = (float)this.field_o[var26];
                            var31 = (float)this.field_y[var26];
                            var32 = (float)this.field_e[var27] - var29;
                            var33 = (float)this.field_o[var27] - var30_float;
                            var34_float = (float)this.field_y[var27] - var31;
                            var35_float = (float)this.field_e[var28] - var29;
                            var36_float = (float)this.field_o[var28] - var30_float;
                            var37_float = (float)this.field_y[var28] - var31;
                            var38_float = (float)this.field_e[var23] - var29;
                            var39_float = (float)this.field_o[var23] - var30_float;
                            var40_float = (float)this.field_y[var23] - var31;
                            var41_float = (float)this.field_e[var24] - var29;
                            var42_float = (float)this.field_o[var24] - var30_float;
                            var43 = (float)this.field_y[var24] - var31;
                            var44 = (float)this.field_e[var25] - var29;
                            var45 = (float)this.field_o[var25] - var30_float;
                            var46 = (float)this.field_y[var25] - var31;
                            var47 = var33 * var37_float - var34_float * var36_float;
                            var48 = var34_float * var35_float - var32 * var37_float;
                            var49 = var32 * var36_float - var33 * var35_float;
                            var50 = var36_float * var49 - var37_float * var48;
                            var51 = var37_float * var47 - var35_float * var49;
                            var52 = var35_float * var48 - var36_float * var47;
                            var53 = 1.0f / (var50 * var32 + var51 * var33 + var52 * var34_float);
                            var19[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                            var19[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                            var19[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                            var50 = var33 * var49 - var34_float * var48;
                            var51 = var34_float * var47 - var32 * var49;
                            var52 = var32 * var48 - var33 * var47;
                            var53 = 1.0f / (var50 * var35_float + var51 * var36_float + var52 * var37_float);
                            var20[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                            var20[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                            var20[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                            break L21;
                          }
                        } else {
                          var19[0] = 0.0f;
                          var20[0] = 1.0f;
                          var19[1] = 1.0f;
                          var20[1] = 1.0f;
                          var19[2] = 0.0f;
                          var20[2] = 0.0f;
                          break L21;
                        }
                      }
                    }
                    var15++;
                    continue L6;
                  }
                }
              } else {
                L26: {
                  var12 = var74[var11_int];
                  var13 = null;
                  var14 = 0;
                  var15 = 0;
                  var16 = 0;
                  var17 = 0;
                  if (param1.field_g == null) {
                    break L26;
                  } else {
                    var18_int = 0;
                    var19_int = 0;
                    L27: while (true) {
                      if (var19_int >= param1.field_g.length) {
                        if (var18_int == 0) {
                          break L26;
                        } else {
                          var9[var11_int] = 9223372036854775807L;
                          break L26;
                        }
                      } else {
                        var56 = param1.field_g[var19_int];
                        if (var12 == var56.field_b) {
                          L28: {
                            var21_ref_sr = jm.a(var56.field_e, 0);
                            if (!var21_ref_sr.field_a) {
                              break L28;
                            } else {
                              var18_int = 1;
                              break L28;
                            }
                          }
                          if (var21_ref_sr.field_e != -1) {
                            var22_ref_opa = var7.a(-20292, var21_ref_sr.field_e);
                            if (var22_ref_opa.field_q == 2) {
                              this.field_z = true;
                              var19_int++;
                              continue L27;
                            } else {
                              var19_int++;
                              continue L27;
                            }
                          } else {
                            var19_int++;
                            continue L27;
                          }
                        } else {
                          var19_int++;
                          continue L27;
                        }
                      }
                    }
                  }
                }
                L29: {
                  var18_int = -1;
                  if (param1.field_u == null) {
                    break L29;
                  } else {
                    var18_int = param1.field_u[var12];
                    if (var18_int == -1) {
                      break L29;
                    } else {
                      L30: {
                        var57 = var7.a(-20292, var18_int & 65535);
                        var13 = var57;
                        if ((param5 & 64) == 0) {
                          break L30;
                        } else {
                          if (var57.field_r) {
                            var18_int = -1;
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      var16 = var57.field_c;
                      var17 = var57.field_n;
                      break L29;
                    }
                  }
                }
                L31: {
                  L32: {
                    if (this.field_h == null) {
                      break L32;
                    } else {
                      if (this.field_h[var12] == 0) {
                        break L32;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_37_0 = stackOut_30_0;
                        break L31;
                      }
                    }
                  }
                  if (var13 != null) {
                    if (((opa) (var13)).field_q == 2) {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L31;
                    } else {
                      stackOut_34_0 = 0;
                      stackIn_37_0 = stackOut_34_0;
                      break L31;
                    }
                  } else {
                    stackOut_32_0 = 0;
                    stackIn_37_0 = stackOut_32_0;
                    break L31;
                  }
                }
                L33: {
                  L34: {
                    var19_int = stackIn_37_0;
                    if (var10 != 0) {
                      break L34;
                    } else {
                      if (var19_int == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (this.field_k == null) {
                    break L33;
                  } else {
                    var14 = var14 + (this.field_k[var12] << 17);
                    break L33;
                  }
                }
                L35: {
                  if (var19_int == 0) {
                    break L35;
                  } else {
                    var14 = var14 + 65536;
                    break L35;
                  }
                }
                var14 = var14 + ((var16 & 255) << 8);
                var14 = var14 + (var17 & 255);
                var15 = var15 + ((var18_int & 65535) << 16);
                var15 = var15 + (var11_int & 65535);
                var9[var11_int] = ((long)var14 << 32) + (long)var15;
                if (var19_int != 0) {
                  this.field_z = true;
                  var11_int++;
                  continue L2;
                } else {
                  var11_int++;
                  continue L2;
                }
              }
            }
          } else {
            var74[var9_int] = var9_int;
            var9_int++;
            continue L0;
          }
        }
    }

    static {
        field_v = 4096;
    }
}
