/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ha {
    private boolean field_y;
    private ph field_g;
    private int field_q;
    private int field_B;
    private int field_n;
    private oe field_p;
    private java.awt.Canvas field_l;
    private boolean field_h;
    private int field_t;
    private gq field_u;
    private int field_m;
    private gq field_F;
    private int field_d;
    int field_w;
    int field_z;
    private int field_j;
    private it[] field_e;
    int field_f;
    private int field_v;
    int field_k;
    int field_D;
    private int field_i;
    private int field_A;
    private int field_G;
    private int field_o;
    int[] field_E;
    private int field_r;
    private lb field_C;
    private int field_x;
    private int field_s;
    private static String field_H;

    private final it a(Runnable param0) {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 < this.field_A) {
            if (this.field_e[var2].field_a != param0) {
              var2++;
              continue L0;
            } else {
              return this.field_e[var2];
            }
          } else {
            return null;
          }
        }
    }

    final int i() {
        return this.field_d;
    }

    final void e() {
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        oe var4 = null;
        L0: {
          var4 = (oe) ((Object) this.field_g.a((byte) 106, (long)param0.hashCode()));
          if (var4 != null) {
            L1: {
              if (var4.field_g != param1) {
                break L1;
              } else {
                if (var4.field_h == param2) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            this.a(param0, param1, param2);
            break L0;
          } else {
            var4 = oi.a(param0, -30, param1, param2);
            this.field_g.a(123, (long)param0.hashCode(), var4);
            break L0;
          }
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * this.field_f + param0;
            for (var10 = 0; var10 < param2; var10++) {
                incrementValue$0 = param5;
                param5++;
                this.field_E[var9 + var10] = param4[incrementValue$0];
            }
            param5 = param5 + param6;
        }
    }

    final int[] Y() {
        return new int[]{this.field_G, this.field_i, this.field_r, this.field_j};
    }

    private final void f() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        for (var1 = 0; var1 < this.field_A; var1++) {
        }
        var1 = this.field_w * this.field_f + this.field_z;
        for (var2 = this.field_w; var2 < this.field_D; var2++) {
            for (var3 = 0; var3 < this.field_A; var3++) {
                this.field_e[var3].field_d.field_a[var2 - this.field_w] = var1;
            }
            var1 = var1 + this.field_f;
        }
    }

    final void b(int param0) {
        ui var4 = null;
        int var5 = 0;
        uh var6 = null;
        int var2 = param0 - this.field_B;
        Object var3 = this.field_F.a((byte) -16);
        while (var3 != null) {
            var4 = (ui) (var3);
            if (var4.field_e) {
                var4.field_i = var4.field_i + var2;
                var5 = var4.field_i / 20;
                if (var5 > 0) {
                    var6 = this.field_a.a(false, var4.field_h);
                    var4.a(var6.field_n * var2 * 50 / 1000, var6.field_j * var2 * 50 / 1000);
                    var4.field_i = var4.field_i - var5 * 20;
                }
                var4.field_e = false;
            }
            var3 = this.field_F.b(6408);
        }
        this.field_B = param0;
        this.field_u.a((byte) -46, 5);
        this.field_F.a((byte) -35, 5);
    }

    final void a(sm param0) {
        lb var2 = (lb) ((Object) param0);
        this.field_f = var2.field_c;
        this.field_v = var2.field_b;
        this.field_E = var2.field_d;
        this.field_C = var2;
        this.field_x = var2.field_c;
        this.field_m = var2.field_b;
        this.g();
    }

    final pa a(vd param0, boolean param1) {
        int[] var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        byte[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          L1: {
            var20 = param0.field_f;
            var16 = var20;
            var3 = var16;
            var4 = param0.field_d;
            var5 = param0.field_h;
            var6 = param0.field_c;
            if (!param1) {
              break L1;
            } else {
              if (param0.field_e != null) {
                break L1;
              } else {
                var22 = new int[var20.length];
                var18 = var22;
                var8 = var18;
                var21 = new byte[var5 * var6];
                var17 = var21;
                var14 = var17;
                var9 = var14;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var6) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var20.length) {
                        var7 = new mt((kj) (this), var21, var22, var5, var6);
                        break L0;
                      } else {
                        var8[var10] = var20[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var11 = var10 * var5;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var5) {
                        var10++;
                        continue L2;
                      } else {
                        var14[var11 + var12] = var4[var11 + var12];
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = param0.field_e;
          if (var9 == null) {
            var10 = 0;
            L5: while (true) {
              if (var10 >= var6) {
                var7 = new vh((kj) (this), var23, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L5;
                  } else {
                    L7: {
                      var13 = var3[var4[var11 + var12] & 255];
                      stackOut_24_0 = (int[]) (var15);
                      stackOut_24_1 = var11 + var12;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (var13 == 0) {
                        stackOut_26_0 = (int[]) ((Object) stackIn_26_0);
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        break L7;
                      } else {
                        stackOut_25_0 = (int[]) ((Object) stackIn_25_0);
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -16777216 | var13;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        break L7;
                      }
                    }
                    stackIn_27_0[stackIn_27_1] = stackIn_27_2;
                    var12++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var10 = 0;
            L8: while (true) {
              if (var10 >= var6) {
                var7 = new jg((kj) (this), var23, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L8;
                  } else {
                    var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
        ((pa) (var7)).a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
        return (pa) (var7);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          if (param0 >= this.field_z) {
            break L0;
          } else {
            param2 = param2 - (this.field_z - param0);
            param0 = this.field_z;
            break L0;
          }
        }
        L1: {
          if (param1 >= this.field_w) {
            break L1;
          } else {
            param3 = param3 - (this.field_w - param1);
            param1 = this.field_w;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= this.field_k) {
            break L2;
          } else {
            param2 = this.field_k - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= this.field_D) {
            break L3;
          } else {
            param3 = this.field_D - param1;
            break L3;
          }
        }
        L4: {
          if (param2 <= 0) {
            break L4;
          } else {
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param0 > this.field_k) {
                  break L5;
                } else {
                  if (param1 <= this.field_D) {
                    L6: {
                      var7 = this.field_f - param2;
                      var8 = param0 + param1 * this.field_f;
                      var9 = param4 >>> 24;
                      if (param5 == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (param5 != 1) {
                            break L7;
                          } else {
                            if (var9 != 255) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (param5 != 1) {
                            if (param5 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var10 = 0;
                              L9: while (true) {
                                if (var10 >= param3) {
                                  break L8;
                                } else {
                                  var11 = -param2;
                                  L10: while (true) {
                                    if (var11 >= 0) {
                                      var8 = var8 + var7;
                                      var10++;
                                      continue L9;
                                    } else {
                                      var12 = this.field_E[var8];
                                      var13 = param4 + var12;
                                      var14 = (param4 & 16711935) + (var12 & 16711935);
                                      var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                      incrementValue$2 = var8;
                                      var8++;
                                      this.field_E[incrementValue$2] = var13 - var12 | var12 - (var12 >>> 8);
                                      var11++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                            var10 = 256 - var9;
                            var11 = 0;
                            L11: while (true) {
                              if (var11 >= param3) {
                                break L8;
                              } else {
                                var12 = -param2;
                                L12: while (true) {
                                  if (var12 >= 0) {
                                    var8 = var8 + var7;
                                    var11++;
                                    continue L11;
                                  } else {
                                    var13 = this.field_E[var8];
                                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                                    incrementValue$3 = var8;
                                    var8++;
                                    this.field_E[incrementValue$3] = param4 + var13;
                                    var12++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                    var10 = param2 >> 3;
                    var11 = param2 & 7;
                    param2 = var8 - 1;
                    var12 = -param3;
                    L13: while (true) {
                      if (var12 >= 0) {
                        break L4;
                      } else {
                        L14: {
                          if (var10 <= 0) {
                            break L14;
                          } else {
                            param0 = var10;
                            L15: while (true) {
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param2++;
                              this.field_E[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          if (var11 <= 0) {
                            break L16;
                          } else {
                            param0 = var11;
                            L17: while (true) {
                              param2++;
                              this.field_E[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        param2 = param2 + var7;
                        var12++;
                        continue L13;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private kj(d param0) {
        super(param0);
        iu discarded$0 = null;
        this.field_h = false;
        this.field_y = false;
        this.field_g = new ph(4);
        this.field_d = 50;
        this.field_z = 0;
        this.field_w = 0;
        this.field_o = 3500;
        this.field_j = 512;
        this.field_k = 0;
        this.field_D = 0;
        this.field_r = 512;
        this.field_u = new gq(16);
        try {
            this.field_F = new gq(256);
            discarded$0 = new iu();
            this.f(1);
            this.d(0);
            fr.a(true, 0, true);
            this.field_h = true;
            this.field_B = (int)kh.a(-61);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.a(-9);
            throw new RuntimeException("");
        }
    }

    private final void j() {
        this.field_z = 0;
        this.field_w = 0;
        this.field_k = this.field_f;
        this.field_D = this.field_v;
        this.f();
    }

    final void a(za param0) {
    }

    final za c(int param0) {
        return null;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            L1: {
              if (param2 <= param3) {
                L2: {
                  param0 = param0 << 16;
                  param0 = param0 + 32768;
                  param2 = param2 << 16;
                  var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                  param3 = param3 + param1;
                  if (param1 >= this.field_w) {
                    break L2;
                  } else {
                    param0 = param0 + var7 * (this.field_w - param1);
                    param1 = this.field_w;
                    break L2;
                  }
                }
                L3: {
                  if (param3 < this.field_D) {
                    break L3;
                  } else {
                    param3 = this.field_D - 1;
                    break L3;
                  }
                }
                L4: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (param5 != 1) {
                        break L5;
                      } else {
                        if (var8 != 255) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L6: while (true) {
                          if (param1 > param3) {
                            break L1;
                          } else {
                            L7: {
                              var9 = param0 >> 16;
                              if (var9 < this.field_z) {
                                break L7;
                              } else {
                                if (var9 >= this.field_k) {
                                  break L7;
                                } else {
                                  var10 = var9 + param1 * this.field_f;
                                  var11 = this.field_E[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  this.field_E[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L7;
                                }
                              }
                            }
                            param0 = param0 + var7;
                            param1++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L8: while (true) {
                        if (param1 > param3) {
                          break L1;
                        } else {
                          L9: {
                            var10 = param0 >> 16;
                            if (var10 < this.field_z) {
                              break L9;
                            } else {
                              if (var10 >= this.field_k) {
                                break L9;
                              } else {
                                var11 = var10 + param1 * this.field_f;
                                var12 = this.field_E[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                this.field_E[var10 + param1 * this.field_f] = param4 + var12;
                                break L9;
                              }
                            }
                          }
                          param0 = param0 + var7;
                          param1++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                L10: while (true) {
                  if (param1 > param3) {
                    break L1;
                  } else {
                    L11: {
                      var9 = param0 >> 16;
                      if (var9 < this.field_z) {
                        break L11;
                      } else {
                        if (var9 >= this.field_k) {
                          break L11;
                        } else {
                          this.field_E[var9 + param1 * this.field_f] = param4;
                          break L11;
                        }
                      }
                    }
                    param0 = param0 + var7;
                    param1++;
                    continue L10;
                  }
                }
              } else {
                L12: {
                  param1 = param1 << 16;
                  param1 = param1 + 32768;
                  param3 = param3 << 16;
                  var7 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                  param2 = param2 + param0;
                  if (param0 >= this.field_z) {
                    break L12;
                  } else {
                    param1 = param1 + var7 * (this.field_z - param0);
                    param0 = this.field_z;
                    break L12;
                  }
                }
                L13: {
                  if (param2 < this.field_k) {
                    break L13;
                  } else {
                    param2 = this.field_k - 1;
                    break L13;
                  }
                }
                L14: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L14;
                  } else {
                    L15: {
                      if (param5 != 1) {
                        break L15;
                      } else {
                        if (var8 != 255) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L16: while (true) {
                          if (param0 > param2) {
                            break L1;
                          } else {
                            L17: {
                              var9 = param1 >> 16;
                              if (var9 < this.field_w) {
                                break L17;
                              } else {
                                if (var9 >= this.field_D) {
                                  break L17;
                                } else {
                                  var10 = param0 + var9 * this.field_f;
                                  var11 = this.field_E[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  this.field_E[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L17;
                                }
                              }
                            }
                            param1 = param1 + var7;
                            param0++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L18: while (true) {
                        if (param0 > param2) {
                          break L1;
                        } else {
                          L19: {
                            var10 = param1 >> 16;
                            if (var10 < this.field_w) {
                              break L19;
                            } else {
                              if (var10 >= this.field_D) {
                                break L19;
                              } else {
                                var11 = param0 + var10 * this.field_f;
                                var12 = this.field_E[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                this.field_E[var11] = param4 + var12;
                                break L19;
                              }
                            }
                          }
                          param1 = param1 + var7;
                          param0++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                L20: while (true) {
                  if (param0 > param2) {
                    break L1;
                  } else {
                    L21: {
                      var9 = param1 >> 16;
                      if (var9 < this.field_w) {
                        break L21;
                      } else {
                        if (var9 >= this.field_D) {
                          break L21;
                        } else {
                          this.field_E[param0 + var9 * this.field_f] = param4;
                          break L21;
                        }
                      }
                    }
                    param1 = param1 + var7;
                    param0++;
                    continue L20;
                  }
                }
              }
            }
            return;
          } else {
            L22: {
              if (param3 < 0) {
                this.b(param0, param1 + param3, -param3 + 1, param4, param5);
                break L22;
              } else {
                this.b(param0, param1, param3 + 1, param4, param5);
                break L22;
              }
            }
            return;
          }
        } else {
          L23: {
            if (param2 < 0) {
              this.U(param0 + param2, param1, -param2 + 1, param4, param5);
              break L23;
            } else {
              this.U(param0, param1, param2 + 1, param4, param5);
              break L23;
            }
          }
          return;
        }
    }

    final da a(vs param0, vd[] param1, boolean param2) {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1.length) {
            if (!param2) {
              if (var6 == 0) {
                return (da) ((Object) new be((kj) (this), param0, param1, var4, var5));
              } else {
                throw new IllegalArgumentException("");
              }
            } else {
              if (var6 == 0) {
                return (da) ((Object) new tu((kj) (this), param0, param1, var4, var5));
              } else {
                return (da) ((Object) new ts((kj) (this), param0, param1, var4, var5));
              }
            }
          } else {
            var4[var7] = param1[var7].field_h;
            var5[var7] = param1[var7].field_c;
            if (param1[var7].field_e != null) {
              var6 = 1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        this.field_A = param0;
        this.field_e = new it[this.field_A];
        for (var2 = 0; var2 < this.field_A; var2++) {
            this.field_e[var2] = new it((kj) (this));
        }
    }

    final void b(int param0, int param1) throws lp {
        Exception exception = null;
        java.awt.Graphics var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (this.field_l == null) {
            break L0;
          } else {
            if (this.field_p != null) {
              try {
                L1: {
                  var3 = this.field_l.getGraphics();
                  this.field_p.a(this.field_q, param1, 0, this.field_n, -57, var3, param0, 0);
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  exception = (Exception) (Object) decompiledCaughtException;
                  this.field_l.repaint();
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalStateException(field_H);
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > this.field_f) {
            param2 = this.field_f;
        }
        if (param3 > this.field_v) {
            param3 = this.field_v;
        }
        this.field_z = param0;
        this.field_k = param2;
        this.field_w = param1;
        this.field_D = param3;
        this.f();
    }

    final boolean b() {
        return false;
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          if (param1 < this.field_w) {
            break L0;
          } else {
            if (param1 < this.field_D) {
              L1: {
                if (param0 >= this.field_z) {
                  break L1;
                } else {
                  param2 = param2 - (this.field_z - param0);
                  param0 = this.field_z;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= this.field_k) {
                  break L2;
                } else {
                  param2 = this.field_k - param0;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * this.field_f;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = this.field_E[var6 + var8];
                            var10 = param3 + var9;
                            var11 = (param3 & 16711935) + (var9 & 16711935);
                            var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                            this.field_E[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = this.field_E[var6 + var9];
                          var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                          this.field_E[var6 + var9] = param3 + var10;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  this.field_E[var6 + var8] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.U(param0, param1, param2, param4, param5);
        this.U(param0, param1 + param3 - 1, param2, param4, param5);
        this.b(param0, param1 + 1, param3 - 2, param4, param5);
        this.b(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    final gd a(int param0, int param1) {
        return (gd) ((Object) new ac(param0, param1));
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        oe var4 = null;
        java.awt.Dimension var5 = null;
        var4 = (oe) ((Object) this.field_g.a((byte) 106, (long)param0.hashCode()));
        if (var4 == null) {
          return;
        } else {
          L0: {
            var4.c(-128);
            var4 = oi.a(param0, -43, param1, param2);
            this.field_g.a(-32, (long)param0.hashCode(), var4);
            if (this.field_l != param0) {
              break L0;
            } else {
              if (this.field_C != null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    var5 = param0.getSize();
                    this.field_q = var5.width;
                    this.field_n = var5.height;
                    this.field_p = var4;
                    this.field_E = var4.field_e;
                    this.field_f = var4.field_g;
                    this.field_v = var4.field_h;
                    if (this.field_f != this.field_x) {
                      break L2;
                    } else {
                      if (this.field_v == this.field_m) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_x = this.field_f;
                  this.field_s = this.field_f;
                  this.field_m = this.field_v;
                  this.field_t = this.field_v;
                  break L1;
                }
                this.g();
                break L0;
              }
            }
          }
          return;
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_G = param0;
        this.field_i = param1;
        this.field_r = param2;
        this.field_j = param3;
        this.f();
    }

    final void f(int param0, int param1) {
        it discarded$0 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_d = param0;
        this.field_o = param1;
    }

    private final void a(java.awt.Canvas param0) {
        oe var2 = null;
        java.awt.Dimension var3 = null;
        L0: {
          if (param0 == null) {
            this.field_l = null;
            this.field_p = null;
            if (this.field_C != null) {
              break L0;
            } else {
              this.field_E = null;
              this.field_v = 1;
              this.field_f = 1;
              this.field_m = 1;
              this.field_x = 1;
              this.g();
              break L0;
            }
          } else {
            var2 = (oe) ((Object) this.field_g.a((byte) 106, (long)param0.hashCode()));
            if (var2 == null) {
              break L0;
            } else {
              this.field_l = param0;
              var3 = param0.getSize();
              this.field_q = var3.width;
              this.field_n = var3.height;
              this.field_p = var2;
              if (this.field_C != null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    this.field_E = var2.field_e;
                    this.field_f = var2.field_g;
                    this.field_v = var2.field_h;
                    if (this.field_f != this.field_x) {
                      break L2;
                    } else {
                      if (this.field_v == this.field_m) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_x = this.field_f;
                  this.field_s = this.field_f;
                  this.field_m = this.field_v;
                  this.field_t = this.field_v;
                  break L1;
                }
                this.g();
                break L0;
              }
            }
          }
        }
    }

    final pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int incrementValue$21 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        L0: while (true) {
          L1: {
            if (var9 >= param4) {
              break L1;
            } else {
              var10 = 0;
              L2: while (true) {
                if (var10 >= param3) {
                  var9++;
                  continue L0;
                } else {
                  incrementValue$21 = var8;
                  var8++;
                  var11 = param0[incrementValue$21] >>> 24;
                  if (var11 != 0) {
                    if (var11 != 255) {
                      var7 = 1;
                      break L1;
                    } else {
                      var10++;
                      continue L2;
                    }
                  } else {
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
          if (var7 == 0) {
            return (pa) ((Object) new vh((kj) (this), param0, param1, param2, param3, param4, param5));
          } else {
            return (pa) ((Object) new jg((kj) (this), param0, param1, param2, param3, param4, param5));
          }
        }
    }

    final void a() {
        if (this.field_l != null) {
            this.field_E = this.field_p.field_e;
            this.field_f = this.field_p.field_g;
            this.field_v = this.field_p.field_h;
            this.field_x = this.field_s;
            this.field_m = this.field_t;
        } else {
            this.field_f = 1;
            this.field_v = 1;
            this.field_E = null;
            this.field_x = 1;
            this.field_m = 1;
        }
        this.field_C = null;
        this.g();
    }

    private final void g() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_A; var1++) {
            this.field_e[var1].a(false);
        }
        this.j();
    }

    private final void d(int param0) {
        this.field_e[param0].a((Runnable) ((Object) Thread.currentThread()), 6);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_z < param0) {
            this.field_z = param0;
        }
        if (this.field_w < param1) {
            this.field_w = param1;
        }
        if (this.field_k > param2) {
            this.field_k = param2;
        }
        if (this.field_D > param3) {
            this.field_D = param3;
        }
        this.f();
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 < this.field_z) {
            break L0;
          } else {
            if (param0 < this.field_k) {
              L1: {
                if (param1 >= this.field_w) {
                  break L1;
                } else {
                  param2 = param2 - (this.field_w - param1);
                  param1 = this.field_w;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= this.field_D) {
                  break L2;
                } else {
                  param2 = this.field_D - param1;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * this.field_f;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = var6 + var8 * this.field_f;
                            var10 = this.field_E[var9];
                            var11 = param3 + var10;
                            var12 = (param3 & 16711935) + (var10 & 16711935);
                            var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                            this.field_E[var9] = var11 - var10 | var10 - (var10 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = var6 + var9 * this.field_f;
                          var11 = this.field_E[var10];
                          var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                          this.field_E[var10] = param3 + var11;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  this.field_E[var6 + var8 * this.field_f] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final int XA() {
        return this.field_o;
    }

    kj(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
            this.b(param0, param2, param3);
            this.a(param0);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.a(-9);
            throw new RuntimeException("");
        }
    }

    final boolean d() {
        return false;
    }

    final boolean h() {
        return this.field_y;
    }

    final void K(int[] param0) {
        param0[0] = this.field_z;
        param0[1] = this.field_w;
        param0[2] = this.field_k;
        param0[3] = this.field_D;
    }

    final void c() {
        if (this.field_h) {
            da.a(121, false, true);
            this.field_h = false;
        }
        this.field_p = null;
        this.field_l = null;
        this.field_q = 0;
        this.field_n = 0;
        this.field_g = null;
        this.field_y = true;
    }

    final sm a(ra param0, gd param1) {
        return (sm) ((Object) new lb((kj) (this), (pa) ((Object) param0), (ac) ((Object) param1)));
    }

    static {
        field_H = "off";
    }
}
