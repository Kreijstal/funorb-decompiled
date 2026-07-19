/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ac field_e;
    private boolean field_o;
    private boolean[] field_b;
    static String field_f;
    private int field_n;
    private boolean[] field_m;
    private boolean field_a;
    private int field_j;
    private int[] field_i;
    private boolean[] field_g;
    private int[] field_h;
    static int[] field_l;
    private int[] field_p;
    private int field_k;
    private int[] field_c;
    private boolean[] field_d;

    final void b(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param3 = param3 * 4;
        if (param0 != 7) {
            return;
        }
        int var5 = param3 + this.field_k * param2;
        int var6 = -4 + this.field_k;
        var5 = var5 + var6 * param1;
        for (var7 = 0; 4 > var7; var7++) {
            incrementValue$0 = var5;
            var5++;
            this.field_m[incrementValue$0] = true;
        }
    }

    final void g(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * param2;
        param0 = param0 * 4;
        int var4 = param1 + param0 * this.field_k;
        int var5 = this.field_k - 4;
        for (var6 = 0; (var6 ^ -1) > -5; var6++) {
            for (var7 = 0; var7 < 4; var7++) {
                this.field_b[var4] = false;
                this.field_g[var4] = false;
                this.field_m[var4] = false;
                this.field_c[var4] = 0;
                var4++;
            }
            var4 = var4 + var5;
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 > -56) {
            this.a(75, 49, 83, true);
        }
        int var4 = param2 + param1 * this.field_k;
        return this.field_c[var4];
    }

    final boolean c(int param0, int param1, int param2) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = MinerDisturbance.field_ab;
        int var4 = param1 * this.field_k + param2;
        int var5 = -4 + this.field_k;
        int var6 = 0;
        int var7 = -74 / ((param0 - 27) / 51);
        while (-5 < (var6 ^ -1)) {
            for (var8 = 0; var8 < 4; var8++) {
                incrementValue$0 = var4;
                var4++;
                if (this.field_d[incrementValue$0]) {
                    return true;
                }
            }
            var4 = var4 + var5;
            var6++;
        }
        return false;
    }

    final void a(boolean param0, je[][] param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
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
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_7_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_114_0 = 0;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_175_0 = null;
        StringBuilder stackIn_175_1 = null;
        String stackIn_175_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        RuntimeException stackOut_174_0 = null;
        StringBuilder stackOut_174_1 = null;
        String stackOut_174_2 = null;
        RuntimeException stackOut_173_0 = null;
        StringBuilder stackOut_173_1 = null;
        String stackOut_173_2 = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (-3 < (je.field_H ^ -1)) {
                je.field_H = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var20 = new int[]{2147483647, 2147483647, 2147483647};
              var21 = var20;
              var3_array = var21;
              var23 = new int[var20.length];
              var22 = var23;
              var4 = var22;
              if (je.field_u < je.field_N[cm.field_o]) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var5 = stackIn_7_0;
            var6 = -2 + je.field_t * 4;
            L3: while (true) {
              if (var6 < -4 + je.field_H * 4) {
                L4: {
                  var6 = 0;
                  var7 = 0;
                  var8 = 0;
                  if (param0) {
                    break L4;
                  } else {
                    field_l = (int[]) null;
                    break L4;
                  }
                }
                var9 = 0;
                L5: while (true) {
                  if (var9 >= var21.length) {
                    L6: {
                      if (-1 <= (var6 ^ -1)) {
                        break L6;
                      } else {
                        if (0 != (this.field_n & 15)) {
                          break L6;
                        } else {
                          L7: {
                            var7 = var7 / var6;
                            var8 = var8 / var6;
                            if (-2 < (var7 ^ -1)) {
                              var7 = 1;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            var9 = 80 * oc.field_f / (int)Math.sqrt((double)var7);
                            if (oc.field_f >= var9) {
                              break L8;
                            } else {
                              var9 = oc.field_f;
                              break L8;
                            }
                          }
                          L9: {
                            var10 = 10;
                            var11 = (var8 >> -1224060638) + -ca.field_k;
                            if (-var10 > var11) {
                              var11 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (var11 > var10) {
                              var11 = var10;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            var12 = 128 + var11 * 128 / var10;
                            if (var12 < 0) {
                              var12 = 0;
                              break L11;
                            } else {
                              if ((var12 ^ -1) >= -256) {
                                break L11;
                              } else {
                                var12 = 255;
                                break L11;
                              }
                            }
                          }
                          od.a(var12, 47, var9, 4);
                          break L6;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L12: {
                      if (var21[var9] != 2147483647) {
                        var6++;
                        var8 = var8 + var23[var9];
                        var7 = var7 + var21[var9];
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var9++;
                    continue L5;
                  }
                }
              } else {
                var7 = var6 >> 1687730786;
                var8 = 3;
                L13: while (true) {
                  if ((var8 ^ -1) < -125) {
                    var6--;
                    continue L3;
                  } else {
                    L14: {
                      var9 = var8 - -(this.field_k * var6);
                      if (0 >= this.field_c[var9]) {
                        if (var5 == 0) {
                          break L14;
                        } else {
                          if (4 * hf.field_t + 128 >= var6) {
                            break L14;
                          } else {
                            this.field_c[var9] = 10;
                            if (32 + je.field_H >= je.field_t) {
                              break L14;
                            } else {
                              je.field_t = je.field_t - 1;
                              break L14;
                            }
                          }
                        }
                      } else {
                        L15: {
                          var10 = this.field_c[var9];
                          if (var10 <= 0) {
                            break L15;
                          } else {
                            L16: {
                              var11 = -(var8 >> -476617982) + ca.field_k;
                              var12 = -(var6 >> 1544864738) + hf.field_t;
                              var13 = var11 * var11 + var12 * var12;
                              if (!sc.field_b) {
                                break L16;
                              } else {
                                if (ni.a(6, 11764)) {
                                  break L16;
                                } else {
                                  if ((var13 ^ -1) > -41) {
                                    ag.a(true, 6, 8 * var6, var8 * 8);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            var14 = 0;
                            L17: while (true) {
                              if (var21.length <= var14) {
                                break L15;
                              } else {
                                if (var13 == var21[var14]) {
                                  var4[var14] = (var8 + var23[var14]) / 2;
                                  break L15;
                                } else {
                                  if (var13 >= var21[var14]) {
                                    var14++;
                                    continue L17;
                                  } else {
                                    var21[var14] = var13;
                                    var23[var14] = var8;
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if (!this.field_b[var9]) {
                            break L18;
                          } else {
                            this.field_b[var9] = false;
                            var10--;
                            this.field_c[var9] = var10;
                            break L18;
                          }
                        }
                        L19: {
                          this.field_i[var9] = 8;
                          var11 = 1 + this.field_h[var9];
                          this.field_h[var9] = var11;
                          if (-16 > (var11 ^ -1)) {
                            L20: {
                              this.field_h[var9] = 0;
                              if (-2 <= (var10 ^ -1)) {
                                break L20;
                              } else {
                                if (je.i(var8, var6 + -1)) {
                                  break L20;
                                } else {
                                  var12 = this.field_c[var9];
                                  if (var12 < 10) {
                                    this.field_c[-this.field_k + var9] = 1 + var12;
                                    var10--;
                                    this.field_c[var9] = var10;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L21: {
                              if (-11 >= (var10 ^ -1)) {
                                break L21;
                              } else {
                                var10 += 2;
                                this.field_c[var9] = var10;
                                break L21;
                              }
                            }
                            L22: {
                              if (var10 <= 1) {
                                break L22;
                              } else {
                                if (this.field_c[var9 - -this.field_k] > 0) {
                                  break L22;
                                } else {
                                  if (!je.i(var8, 1 + var6)) {
                                    this.field_c[var9] = 0;
                                    this.field_c[var9 + this.field_k] = var10;
                                    var10 = 0;
                                    break L19;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (var10 <= 2) {
                              break L19;
                            } else {
                              L23: {
                                if (0.5 >= Math.random()) {
                                  stackOut_44_0 = 0;
                                  stackIn_45_0 = stackOut_44_0;
                                  break L23;
                                } else {
                                  stackOut_43_0 = 1;
                                  stackIn_45_0 = stackOut_43_0;
                                  break L23;
                                }
                              }
                              L24: {
                                var12 = stackIn_45_0;
                                if (var12 == 0) {
                                  break L24;
                                } else {
                                  if (this.field_c[var9 - -1] >= var10) {
                                    break L24;
                                  } else {
                                    if (!je.i(1 + var8, var6)) {
                                      var10--;
                                      this.field_c[var9] = var10;
                                      this.field_c[1 + var9] = this.field_c[1 + var9] + 1;
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                              L25: {
                                if (var10 <= this.field_c[-1 + var9]) {
                                  break L25;
                                } else {
                                  if (je.i(-1 + var8, var6)) {
                                    break L25;
                                  } else {
                                    var10--;
                                    this.field_c[var9] = var10;
                                    this.field_c[var9 + -1] = this.field_c[var9 + -1] + 1;
                                    break L25;
                                  }
                                }
                              }
                              if (var12 != 0) {
                                break L19;
                              } else {
                                if (var10 <= this.field_c[var9 - -1]) {
                                  break L19;
                                } else {
                                  if (!je.i(1 + var8, var6)) {
                                    var10--;
                                    this.field_c[var9] = var10;
                                    this.field_c[var9 - -1] = this.field_c[var9 - -1] + 1;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          } else {
                            break L19;
                          }
                        }
                        L26: {
                          var12 = var8 >> 1621660194;
                          param1[var12][var7].field_i = 255;
                          var13 = 2 + var12 * 4 - -((2 + var7 * 4) * this.field_k);
                          if (!this.field_m[var13]) {
                            break L26;
                          } else {
                            var14 = var12 * 4 - 8;
                            L27: while (true) {
                              if (4 * (1 + var12) - -8 <= var14) {
                                break L26;
                              } else {
                                var15 = 4 * var7 - 8;
                                L28: while (true) {
                                  if (8 + (4 + 4 * var7) <= var15) {
                                    var14++;
                                    continue L27;
                                  } else {
                                    L29: {
                                      L30: {
                                        var16 = var15 * this.field_k + var14;
                                        if (this.field_m[var16]) {
                                          break L30;
                                        } else {
                                          if (this.field_g[var16]) {
                                            break L30;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (!this.field_g[var16]) {
                                          break L31;
                                        } else {
                                          L32: {
                                            if (this.field_g[var16 - this.field_k]) {
                                              this.field_d[var16 - this.field_k] = true;
                                              break L32;
                                            } else {
                                              break L32;
                                            }
                                          }
                                          L33: {
                                            if (this.field_g[var16 - 1]) {
                                              this.field_d[var16 - 1] = true;
                                              break L33;
                                            } else {
                                              break L33;
                                            }
                                          }
                                          if (this.field_g[1 + var16]) {
                                            this.field_d[var16 + 1] = true;
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      L34: {
                                        lj.field_r = lj.field_r + 25;
                                        if ((var8 & 3 ^ -1) != -2) {
                                          break L34;
                                        } else {
                                          if ((3 & var6 ^ -1) != -2) {
                                            break L34;
                                          } else {
                                            var17 = jf.b((byte) 100);
                                            uf.field_p[var17] = new gf(var14 / 4, var15 / 4, 16);
                                            uf.field_p[var17].field_g = 0;
                                            uf.field_p[var17].field_b = 250;
                                            break L34;
                                          }
                                        }
                                      }
                                      L35: {
                                        if (!oe.field_b) {
                                          this.field_m[var9] = false;
                                          break L35;
                                        } else {
                                          break L35;
                                        }
                                      }
                                      var17 = var14 / 4 - 1;
                                      L36: while (true) {
                                        if (var14 / 4 + 1 < var17) {
                                          break L29;
                                        } else {
                                          var18 = -1 + var15 / 4;
                                          L37: while (true) {
                                            if (var18 > var15 / 4 + 1) {
                                              var17++;
                                              continue L36;
                                            } else {
                                              L38: {
                                                if ((var18 ^ -1) >= -1) {
                                                  break L38;
                                                } else {
                                                  if (-1 <= (var17 ^ -1)) {
                                                    break L38;
                                                  } else {
                                                    if (31 <= var17) {
                                                      break L38;
                                                    } else {
                                                      if (je.field_t - 1 <= var18) {
                                                        break L38;
                                                      } else {
                                                        if (!param1[var17][var18].field_a) {
                                                          break L38;
                                                        } else {
                                                          param1[var17][var18].field_S = true;
                                                          param1[var17][var18].field_r = 900;
                                                          break L38;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var18++;
                                              continue L37;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var15++;
                                    continue L28;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L39: {
                          if (param1[var12][var7].field_E) {
                            param1[var12][var7].field_E = false;
                            param1[var12][var7].field_a = false;
                            this.h(var12, 4, var7);
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        L40: {
                          if (param1[var12][var7].field_a) {
                            if (1 < var10) {
                              L41: {
                                if (!param1[var12][var7].field_b) {
                                  stackOut_113_0 = 0;
                                  stackIn_114_0 = stackOut_113_0;
                                  break L41;
                                } else {
                                  stackOut_112_0 = 1;
                                  stackIn_114_0 = stackOut_112_0;
                                  break L41;
                                }
                              }
                              L42: {
                                var14 = stackIn_114_0;
                                if (var10 <= 4) {
                                  break L42;
                                } else {
                                  if (param1[var12][var7].field_v) {
                                    param1[var12][var7].field_q = param1[var12][var7].field_q + 4;
                                    var10 -= 4;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              L43: {
                                if (-2 <= (var10 ^ -1)) {
                                  break L43;
                                } else {
                                  if (var14 != 0) {
                                    break L43;
                                  } else {
                                    var10 -= 2;
                                    param1[var12][var7].field_q = param1[var12][var7].field_q + 2;
                                    break L43;
                                  }
                                }
                              }
                              L44: {
                                if (var10 <= 4) {
                                  break L44;
                                } else {
                                  if (var14 == 0) {
                                    var10 -= 2;
                                    param1[var12][var7].field_q = param1[var12][var7].field_q + 2;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                if ((var10 ^ -1) >= -10) {
                                  break L45;
                                } else {
                                  var10 -= 2;
                                  param1[var12][var7].field_q = param1[var12][var7].field_q + 2;
                                  break L45;
                                }
                              }
                              L46: {
                                if ((var10 ^ -1) >= -1) {
                                  var10 = 1;
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                              if (param1[var12][var7].field_q > 768) {
                                if (var14 == 0) {
                                  param1[var12][var7].field_q = 0;
                                  param1[var12][var7].field_a = false;
                                  param1[var12][var7].field_v = false;
                                  param1[var12][var7].field_E = false;
                                  param1[var12][var7].field_U = -1;
                                  param1[var12][var7].field_b = false;
                                  this.a(false, var12, 9, var7);
                                  lj.field_r = lj.field_r + 25;
                                  break L40;
                                } else {
                                  param1[var12][var7].field_q = 768;
                                  break L40;
                                }
                              } else {
                                break L40;
                              }
                            } else {
                              if (var10 <= 0) {
                                var13 = 4 * var12 + 2 - -(this.field_k * (2 + 4 * var7));
                                if (this.field_b[var13]) {
                                  param1[var12][var7].field_a = true;
                                  param1[var12][var7].field_q = 0;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                var8++;
                                continue L13;
                              }
                            }
                          } else {
                            break L40;
                          }
                        }
                        if (var10 <= 0) {
                          var13 = 4 * var12 + 2 - -(this.field_k * (2 + 4 * var7));
                          if (this.field_b[var13]) {
                            param1[var12][var7].field_a = true;
                            param1[var12][var7].field_q = 0;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    var8++;
                    continue L13;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L47: {
            var3 = decompiledCaughtException;
            stackOut_172_0 = (RuntimeException) (var3);
            stackOut_172_1 = new StringBuilder().append("rb.J(").append(param0).append(',');
            stackIn_174_0 = stackOut_172_0;
            stackIn_174_1 = stackOut_172_1;
            stackIn_173_0 = stackOut_172_0;
            stackIn_173_1 = stackOut_172_1;
            if (param1 == null) {
              stackOut_174_0 = (RuntimeException) ((Object) stackIn_174_0);
              stackOut_174_1 = (StringBuilder) ((Object) stackIn_174_1);
              stackOut_174_2 = "null";
              stackIn_175_0 = stackOut_174_0;
              stackIn_175_1 = stackOut_174_1;
              stackIn_175_2 = stackOut_174_2;
              break L47;
            } else {
              stackOut_173_0 = (RuntimeException) ((Object) stackIn_173_0);
              stackOut_173_1 = (StringBuilder) ((Object) stackIn_173_1);
              stackOut_173_2 = "{...}";
              stackIn_175_0 = stackOut_173_0;
              stackIn_175_1 = stackOut_173_1;
              stackIn_175_2 = stackOut_173_2;
              break L47;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_175_0), stackIn_175_2 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        var4 = 0;
        if (param1) {
          param2 = param2 * 4;
          var5 = 0;
          param0 = param0 * 4;
          var6 = (param2 + 1) * this.field_k + param0;
          var7 = this.field_k + -4;
          var8 = 0;
          L0: while (true) {
            if (-5 >= (var8 ^ -1)) {
              var8 = param0 + ((1 + param2) * this.field_k + -4);
              var9 = 3;
              L1: while (true) {
                if (var9 <= 0) {
                  var6 = param0 + this.field_k * (1 + param2);
                  var9 = 0;
                  L2: while (true) {
                    if ((var9 ^ -1) <= -5) {
                      return var5 != 0;
                    } else {
                      var10 = 0;
                      L3: while (true) {
                        if (var10 >= 4) {
                          var6 = var6 + var7;
                          var9++;
                          continue L2;
                        } else {
                          if (!this.field_b[var6]) {
                            if (-1 > (var4 ^ -1)) {
                              var5 = 1;
                              this.field_b[var6] = true;
                              var4--;
                              var6++;
                              var10++;
                              continue L3;
                            } else {
                              var6++;
                              var10++;
                              continue L3;
                            }
                          } else {
                            var6++;
                            var10++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L4: while (true) {
                    if (var10 >= 4) {
                      var8 = var8 - (4 + var7);
                      var9--;
                      continue L1;
                    } else {
                      if (this.field_b[var8]) {
                        if (-1 > (var4 ^ -1)) {
                          var4--;
                          this.field_b[var8] = true;
                          var5 = 1;
                          var8++;
                          var10++;
                          continue L4;
                        } else {
                          var8++;
                          var10++;
                          continue L4;
                        }
                      } else {
                        var8++;
                        var10++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } else {
              var9 = 0;
              L5: while (true) {
                if ((var9 ^ -1) <= -5) {
                  var6 = var6 + var7;
                  var8++;
                  continue L0;
                } else {
                  if (this.field_b[var6]) {
                    var4++;
                    this.field_b[var6] = false;
                    var5 = 1;
                    var6++;
                    var9++;
                    continue L5;
                  } else {
                    var6++;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final int j(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int var4 = this.field_k * param1 + param2;
        if (param0 > -112) {
            discarded$0 = this.j(50, 67, 7);
        }
        return this.field_p[var4];
    }

    public static void a(int param0) {
        if (param0 != -2004317953) {
            return;
        }
        field_l = null;
        field_f = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int var10 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param3 = param3 * 4;
        int var6 = param2 - -(this.field_k * param3);
        int var7 = -4 + this.field_k;
        if (!param4) {
            this.field_h = (int[]) null;
        }
        for (var8 = 0; var8 < 4; var8++) {
            for (var9 = 0; -5 < (var9 ^ -1); var9++) {
                incrementValue$0 = var6;
                var6++;
                this.field_b[incrementValue$0] = (double)param1 * Math.random() < (double)param0 ? true : false;
            }
            var6 = var6 + var7;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = param2 - -(this.field_k * param0);
        this.field_b[var5] = param1;
        int var6 = -112 % ((param3 - -40) / 34);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int var11 = MinerDisturbance.field_ab;
        param4 = param4 * 4;
        param2 = param2 * 4;
        int var6 = param4 + this.field_k * param2;
        int var7 = this.field_k + -4;
        int var8 = 0;
        int var9 = 64 % ((param3 - -13) / 60);
        while (4 > var8) {
            for (var10 = 0; -5 < (var10 ^ -1); var10++) {
                incrementValue$0 = var6;
                var6++;
                this.field_g[incrementValue$0] = (double)param1 > Math.random() * (double)param0 ? true : false;
            }
            var6 = var6 + var7;
            var8++;
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param0 = param0 * 4;
        int var4 = param0 - -(this.field_k * param2);
        if (param1 > -82) {
            return true;
        }
        int var5 = this.field_k + -4;
        for (var6 = 0; (var6 ^ -1) > -5; var6++) {
            for (var7 = 0; -5 < (var7 ^ -1); var7++) {
                incrementValue$0 = var4;
                var4++;
                if (!(!this.field_b[incrementValue$0])) {
                    return true;
                }
            }
            var4 = var4 + var5;
        }
        return false;
    }

    final void h(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * param1;
        param2 = param2 * 4;
        int var4 = param2 * this.field_k + param0;
        int var5 = -4 + this.field_k;
        for (var6 = 0; -5 < (var6 ^ -1); var6++) {
            for (var7 = 0; 4 > var7; var7++) {
                incrementValue$0 = var4;
                var4++;
                this.field_b[incrementValue$0] = true;
            }
            var4 = var4 + var5;
        }
    }

    final void e(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        if (param2 != 83) {
            return;
        }
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param1 + this.field_k * param0;
        int var5 = this.field_k - 4;
        for (var6 = 0; -5 < (var6 ^ -1); var6++) {
            for (var7 = 0; var7 < 4; var7++) {
                if (this.field_g[var4]) {
                    this.field_g[var4] = false;
                    return;
                }
                var4++;
            }
            var4 = var4 + var5;
        }
    }

    final void b(int param0, boolean param1, int param2, int param3) {
        int var5 = param2 + this.field_k * param3;
        if (param0 <= 91) {
            return;
        }
        this.field_m[var5] = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int var10 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param2 = param2 * 4;
        int var6 = param2 * this.field_k + param3;
        int var7 = param1 + this.field_k;
        for (var8 = 0; -5 < (var8 ^ -1); var8++) {
            for (var9 = 0; (var9 ^ -1) > -5; var9++) {
                incrementValue$0 = var6;
                var6++;
                this.field_m[incrementValue$0] = (double)param4 > Math.random() * (double)param0 ? true : false;
            }
            var6 = var6 + var7;
        }
    }

    final boolean d(int param0, int param1, byte param2) {
        int var4 = param1 + param0 * this.field_k;
        if (param2 > -76) {
            return false;
        }
        return (this.field_i[var4] ^ -1) < -1 ? true : false;
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (fg.a(-1975005818, param1)) {
            return true;
          } else {
            L0: {
              if (45 == param1) {
                break L0;
              } else {
                if (param1 == 160) {
                  break L0;
                } else {
                  if (param1 == 32) {
                    break L0;
                  } else {
                    if (param1 != 95) {
                      if (param0 > 117) {
                        return false;
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean b(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param0 + this.field_k * param1;
        int var5 = this.field_k - 4;
        if (param2 <= 12) {
            return true;
        }
        for (var6 = 0; var6 < 4; var6++) {
            for (var7 = 0; -5 < (var7 ^ -1); var7++) {
                incrementValue$0 = var4;
                var4++;
                if (!(!this.field_d[incrementValue$0])) {
                    return true;
                }
            }
            var4 = var4 + var5;
        }
        return false;
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param2 = param2 * 4;
        int var5 = param3 * this.field_k + param2;
        if (param1 <= 0) {
            this.field_h = (int[]) null;
        }
        int var6 = this.field_k - 4;
        for (var7 = 0; var7 < 4; var7++) {
            for (var8 = 0; var8 < 4; var8++) {
                incrementValue$0 = var5;
                var5++;
                this.field_d[incrementValue$0] = true;
            }
            var5 = var5 + var6;
        }
    }

    final boolean e(int param0, int param1, int param2) {
        if (param2 != 2) {
            this.field_a = false;
        }
        int var4 = param0 - -(this.field_k * param1);
        return this.field_b[var4];
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param1 = param1 * 4;
        int var5 = param1 - -(param3 * this.field_k);
        int var6 = this.field_k - 4;
        int var7 = 0;
        if (param0) {
            return;
        }
        while (-5 < (var7 ^ -1)) {
            for (var8 = 0; (var8 ^ -1) > -5; var8++) {
                incrementValue$0 = var5;
                var5++;
                this.field_c[incrementValue$0] = param2;
            }
            var5 = var5 + var6;
            var7++;
        }
    }

    final boolean f(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param0 = param0 * 4;
        int var4 = param2 + param0 * this.field_k;
        if (param1 != 2) {
            this.field_a = false;
        }
        int var5 = this.field_k + -4;
        for (var6 = 0; 4 > var6; var6++) {
            for (var7 = 0; 4 > var7; var7++) {
                incrementValue$0 = var4;
                var4++;
                if (!(!this.field_g[incrementValue$0])) {
                    return true;
                }
            }
            var4 = var4 + var5;
        }
        return false;
    }

    final boolean i(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (-1 < (param1 ^ -1)) {
            break L0;
          } else {
            if (this.field_k - 1 < param1) {
              break L0;
            } else {
              if (-1 + this.field_j < param2) {
                break L0;
              } else {
                if ((param2 ^ -1) > -1) {
                  break L0;
                } else {
                  var4 = -123 / ((param0 - 9) / 36);
                  var5 = param1 + param2 * this.field_k;
                  return this.field_m[var5];
                }
              }
            }
          }
        }
        return false;
    }

    final void a(int param0, int param1, int param2, je[][] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (this.field_a) {
                var5_int = -1;
                break L1;
              } else {
                var5_int = 1;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (this.field_a) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((rb) (this)).field_a = stackIn_7_1 != 0;
            var6 = hf.field_t * 4 + 64;
            var7 = param0 * 4 + 4;
            L3: while (true) {
              if (param2 * 4 > var7) {
                var7 = -92 % ((param1 - 54) / 39);
                var8 = param0 * 4 + 4;
                L4: while (true) {
                  if (var8 < param2 * 4) {
                    break L0;
                  } else {
                    L5: {
                      if (var8 < var6) {
                        var9 = 123;
                        L6: while (true) {
                          if (var9 < 0) {
                            break L5;
                          } else {
                            L7: {
                              var10 = var8 * this.field_k + var9;
                              if (this.field_b[var10]) {
                                L8: {
                                  this.field_i[var10] = 8;
                                  var11 = var9 >> -1067481278;
                                  var12 = var8 >> 811936930;
                                  stackOut_63_0 = 0;
                                  stackIn_65_0 = stackOut_63_0;
                                  stackIn_64_0 = stackOut_63_0;
                                  if (param3[var11][var12].field_a) {
                                    stackOut_65_0 = stackIn_65_0;
                                    stackOut_65_1 = 0;
                                    stackIn_66_0 = stackOut_65_0;
                                    stackIn_66_1 = stackOut_65_1;
                                    break L8;
                                  } else {
                                    stackOut_64_0 = stackIn_64_0;
                                    stackOut_64_1 = 1;
                                    stackIn_66_0 = stackOut_64_0;
                                    stackIn_66_1 = stackOut_64_1;
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (stackIn_66_0 != stackIn_66_1) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (0 >= param3[var11][var12].field_q) {
                                        break L10;
                                      } else {
                                        param3[var11][var12].field_q = param3[var11][var12].field_q - 1;
                                        break L10;
                                      }
                                    }
                                    if ((param3[var11][var12].field_q ^ -1) >= -193) {
                                      break L9;
                                    } else {
                                      param3[var11][var12].field_q = param3[var11][var12].field_q - 128;
                                      if (15.0 <= Math.random() * 100.0) {
                                        break L9;
                                      } else {
                                        this.field_b[var10] = false;
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (!this.field_b[var10]) {
                                  break L7;
                                } else {
                                  L11: {
                                    if (this.field_b[var10 + this.field_k]) {
                                      break L11;
                                    } else {
                                      if (je.i(var9, var8 - -1)) {
                                        break L11;
                                      } else {
                                        this.field_b[var10] = false;
                                        this.field_b[this.field_k + var10] = true;
                                        break L7;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (this.field_b[var10 - -var5_int]) {
                                      break L12;
                                    } else {
                                      if (je.i(var9 + var5_int, var8)) {
                                        break L12;
                                      } else {
                                        this.field_b[var10] = false;
                                        this.field_b[var5_int + var10] = true;
                                        break L7;
                                      }
                                    }
                                  }
                                  if (this.field_b[var10 + -var5_int]) {
                                    break L7;
                                  } else {
                                    if (!je.i(var9 + -var5_int, var8)) {
                                      this.field_b[var10] = false;
                                      this.field_b[var10 + -var5_int] = true;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            L13: {
                              if (!this.field_m[var10]) {
                                break L13;
                              } else {
                                L14: {
                                  this.field_p[var10] = 64;
                                  if (this.field_m[-this.field_k + var10]) {
                                    break L14;
                                  } else {
                                    if (je.i(var9, var8 + -1)) {
                                      break L14;
                                    } else {
                                      if (!oe.field_b) {
                                        this.field_m[var10] = false;
                                        this.field_m[var10 - this.field_k] = true;
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  if (this.field_m[var10 + var5_int]) {
                                    break L15;
                                  } else {
                                    if (je.i(var9 + var5_int, var8)) {
                                      break L15;
                                    } else {
                                      this.field_m[var10] = false;
                                      this.field_m[var10 - -var5_int] = true;
                                      break L13;
                                    }
                                  }
                                }
                                if (this.i(123, var9 - var5_int, var8)) {
                                  break L13;
                                } else {
                                  if (je.i(-var5_int + var9, var8)) {
                                    break L13;
                                  } else {
                                    this.field_m[var10] = false;
                                    this.field_m[-var5_int + var10] = true;
                                    break L13;
                                  }
                                }
                              }
                            }
                            var9--;
                            continue L6;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var8--;
                    continue L4;
                  }
                }
              } else {
                L16: {
                  if (var7 >= var6) {
                    break L16;
                  } else {
                    var8 = 0;
                    L17: while (true) {
                      if (124 < var8) {
                        break L16;
                      } else {
                        L18: {
                          var9 = var8 + this.field_k * var7;
                          if (this.field_b[var9]) {
                            L19: {
                              if (je.i(var8, var7)) {
                                if (!this.field_b[var9 + -this.field_k]) {
                                  this.field_b[var9 - this.field_k] = true;
                                  this.field_b[var9] = false;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              } else {
                                L20: {
                                  if (this.field_b[var9 + this.field_k]) {
                                    break L20;
                                  } else {
                                    if (!je.i(var8, var7 - -1)) {
                                      this.field_b[var9] = false;
                                      this.field_b[this.field_k + var9] = true;
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L21: {
                                  var10 = this.field_b[var5_int + var9] ? 1 : 0;
                                  var11 = this.field_b[var9 - var5_int] ? 1 : 0;
                                  if (var10 != 0) {
                                    break L21;
                                  } else {
                                    if (!je.i(var5_int + var8, var7)) {
                                      this.field_b[var9] = false;
                                      this.field_b[var9 - -var5_int] = true;
                                      break L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                if (var11 != 0) {
                                  break L19;
                                } else {
                                  if (!je.i(var8 + -var5_int, var7)) {
                                    this.field_b[var9] = false;
                                    this.field_b[var9 + -var5_int] = true;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            this.field_i[var9] = 8;
                            break L18;
                          } else {
                            L22: {
                              if (-1 <= (this.field_i[var9] ^ -1)) {
                                break L22;
                              } else {
                                this.field_i[var9] = this.field_i[var9] - 1;
                                break L22;
                              }
                            }
                            if (-1 > (this.field_p[var9] ^ -1)) {
                              this.field_p[var9] = this.field_p[var9] - 1;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L23: {
                          if (this.field_m[var9]) {
                            if (-31 <= (var7 ^ -1)) {
                              this.field_m[var9] = false;
                              break L23;
                            } else {
                              L24: {
                                this.field_p[var9] = 64;
                                if (this.field_m[-this.field_k + var9]) {
                                  break L24;
                                } else {
                                  if (this.field_b[-this.field_k + var9]) {
                                    break L24;
                                  } else {
                                    if (je.i(var8, var7 - 1)) {
                                      break L24;
                                    } else {
                                      this.field_m[var9] = false;
                                      this.field_m[var9 - this.field_k] = true;
                                      break L23;
                                    }
                                  }
                                }
                              }
                              L25: {
                                if (this.field_m[var9 - -var5_int]) {
                                  break L25;
                                } else {
                                  if (this.field_b[var9 - -var5_int]) {
                                    break L25;
                                  } else {
                                    if (!je.i(var5_int + var8, var7)) {
                                      this.field_m[var9] = false;
                                      this.field_m[var9 - -var5_int] = true;
                                      break L23;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              if (this.field_m[var9 - var5_int]) {
                                break L23;
                              } else {
                                if (this.field_b[var9 + -var5_int]) {
                                  break L23;
                                } else {
                                  if (!je.i(-var5_int + var8, var7)) {
                                    this.field_m[var9] = false;
                                    this.field_m[-var5_int + var9] = true;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          } else {
                            break L23;
                          }
                        }
                        var8++;
                        continue L17;
                      }
                    }
                  }
                }
                var7--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var5 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var5);
            stackOut_98_1 = new StringBuilder().append("rb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param3 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L26;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L26;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
    }

    final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param1 + param0 * this.field_k;
        int var5 = this.field_k + -4;
        if (param2 != -5) {
            return;
        }
        for (var6 = 0; 4 > var6; var6++) {
            for (var7 = 0; -5 < (var7 ^ -1); var7++) {
                incrementValue$0 = var4;
                var4++;
                this.field_g[incrementValue$0] = true;
            }
            var4 = var4 + var5;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param1 = param1 * 4;
        int var4 = param1 - -(this.field_k * param2);
        int var5 = -4 + this.field_k;
        for (var6 = 0; 4 > var6; var6++) {
            for (var7 = 0; (var7 ^ -1) > -5; var7++) {
                incrementValue$0 = var4;
                var4++;
                this.field_b[incrementValue$0] = false;
            }
            var4 = var4 + var5;
        }
        if (param0 <= 115) {
            this.field_k = 87;
        }
    }

    final void c(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * 4;
        param1 = param1 * 4;
        if (param2 != -48) {
            this.field_p = (int[]) null;
        }
        int var4 = this.field_k * param0 + param1;
        int var5 = this.field_k + -4;
        for (var6 = 0; (var6 ^ -1) > -5; var6++) {
            for (var7 = 0; var7 < 4; var7++) {
                incrementValue$0 = var4;
                var4++;
                this.field_m[incrementValue$0] = true;
            }
            var4 = var4 + var5;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * 4;
        param2 = param2 * 4;
        int var4 = this.field_k * param2 + param0;
        int var5 = this.field_k + param1;
        for (var6 = 0; -5 < (var6 ^ -1); var6++) {
            for (var7 = 0; (var7 ^ -1) > -5; var7++) {
                this.field_m[var4] = false;
                this.field_p[var4] = 0;
            }
            var4 = var4 + var5;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != 61) {
            return true;
        }
        int var4 = this.field_k * param1 + param0;
        return this.field_g[var4];
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param3 + this.field_k * param1;
        this.field_p[var5] = param2;
        if (param0 >= -91) {
            field_l = (int[]) null;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        boolean discarded$0 = false;
        if (param1 < 71) {
            discarded$0 = this.f(109, -23, 126);
        }
        int var5 = this.field_k * param2 + param0;
        this.field_g[var5] = param3;
    }

    final void a(int param0, boolean param1, je[][] param2, int param3) {
        int fieldTemp$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
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
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_88_0 = 0;
        Object stackIn_130_0 = null;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        RuntimeException stackIn_156_0 = null;
        StringBuilder stackIn_156_1 = null;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        String stackIn_158_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_129_0 = null;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_155_0 = null;
        StringBuilder stackOut_155_1 = null;
        RuntimeException stackOut_157_0 = null;
        StringBuilder stackOut_157_1 = null;
        String stackOut_157_2 = null;
        RuntimeException stackOut_156_0 = null;
        StringBuilder stackOut_156_1 = null;
        String stackOut_156_2 = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            fieldTemp$1 = this.field_n + 1;
            this.field_n = this.field_n + 1;
            if ((3 & fieldTemp$1) == 0) {
              if (param1) {
                L1: {
                  if (this.field_o) {
                    var5_int = -1;
                    break L1;
                  } else {
                    var5_int = 1;
                    break L1;
                  }
                }
                var6 = 64 + hf.field_t * 4;
                var7_int = 4 + 4 * param0;
                L2: while (true) {
                  if (param3 * 4 > var7_int) {
                    var7 = new int[]{2147483647, 2147483647, 2147483647};
                    var21 = new int[var7.length];
                    var20 = var21;
                    var8 = var20;
                    var9 = 4 * param0 + 4;
                    L3: while (true) {
                      if (var9 < param3 * 4) {
                        L4: {
                          if (-1 == (this.field_n & 15 ^ -1)) {
                            L5: {
                              stackOut_129_0 = this;
                              stackIn_131_0 = stackOut_129_0;
                              stackIn_130_0 = stackOut_129_0;
                              if (this.field_o) {
                                stackOut_131_0 = this;
                                stackOut_131_1 = 0;
                                stackIn_132_0 = stackOut_131_0;
                                stackIn_132_1 = stackOut_131_1;
                                break L5;
                              } else {
                                stackOut_130_0 = this;
                                stackOut_130_1 = 1;
                                stackIn_132_0 = stackOut_130_0;
                                stackIn_132_1 = stackOut_130_1;
                                break L5;
                              }
                            }
                            ((rb) (this)).field_o = stackIn_132_1 != 0;
                            var9 = 0;
                            var10 = 0;
                            var11 = 0;
                            var12 = 0;
                            L6: while (true) {
                              if (var7.length <= var12) {
                                if (0 >= var9) {
                                  break L4;
                                } else {
                                  L7: {
                                    var11 = var11 / var9;
                                    var10 = var10 / var9;
                                    if (var10 < 1) {
                                      var10 = 1;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    var12 = 80 * oc.field_f / (int)Math.sqrt((double)var10);
                                    if (var12 > oc.field_f) {
                                      var12 = oc.field_f;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    var13 = 10;
                                    var14 = (var11 >> 589201954) + -ca.field_k;
                                    if (var14 >= -var13) {
                                      break L9;
                                    } else {
                                      var14 = -var13;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (var14 <= var13) {
                                      break L10;
                                    } else {
                                      var14 = var13;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    var15 = 128 + 128 * var14 / var13;
                                    if ((var15 ^ -1) <= -1) {
                                      if (-256 <= (var15 ^ -1)) {
                                        break L11;
                                      } else {
                                        var15 = 255;
                                        break L11;
                                      }
                                    } else {
                                      var15 = 0;
                                      break L11;
                                    }
                                  }
                                  od.a(var15, 46, var12, 4);
                                  break L4;
                                }
                              } else {
                                L12: {
                                  if (2147483647 != var7[var12]) {
                                    var9++;
                                    var11 = var11 + var21[var12];
                                    var10 = var10 + var7[var12];
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var12++;
                                continue L6;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L13: {
                          if (var6 > var9) {
                            L14: {
                              if (!this.field_o) {
                                stackOut_54_0 = 0;
                                stackIn_55_0 = stackOut_54_0;
                                break L14;
                              } else {
                                stackOut_53_0 = 124;
                                stackIn_55_0 = stackOut_53_0;
                                break L14;
                              }
                            }
                            L15: {
                              var10 = stackIn_55_0;
                              if (this.field_o) {
                                stackOut_57_0 = -1;
                                stackIn_58_0 = stackOut_57_0;
                                break L15;
                              } else {
                                stackOut_56_0 = 125;
                                stackIn_58_0 = stackOut_56_0;
                                break L15;
                              }
                            }
                            var11 = stackIn_58_0;
                            var12 = var10;
                            L16: while (true) {
                              if (var12 == var11) {
                                break L13;
                              } else {
                                L17: {
                                  var13 = var12 + this.field_k * var9;
                                  if (!this.field_g[var13]) {
                                    this.field_d[var13] = false;
                                    break L17;
                                  } else {
                                    L18: {
                                      L19: {
                                        if (this.field_g[var13 + this.field_k]) {
                                          break L19;
                                        } else {
                                          if (this.field_g[-this.field_k + var13]) {
                                            break L19;
                                          } else {
                                            if (!je.e(var12, var9 + 1)) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                      L20: {
                                        if (this.field_g[var13 - -var5_int]) {
                                          break L20;
                                        } else {
                                          if (je.e(var5_int + var12, var9)) {
                                            break L20;
                                          } else {
                                            this.field_g[var13] = false;
                                            this.field_g[var13 + var5_int] = true;
                                            break L18;
                                          }
                                        }
                                      }
                                      if (this.field_g[var13 - var5_int]) {
                                        break L18;
                                      } else {
                                        if (je.e(-var5_int + var12, var9)) {
                                          break L18;
                                        } else {
                                          this.field_g[var13] = false;
                                          this.field_g[var13 + -var5_int] = true;
                                          break L18;
                                        }
                                      }
                                    }
                                    if (!this.field_d[var13]) {
                                      break L17;
                                    } else {
                                      if (!this.field_b[var13]) {
                                        var14 = ca.field_k - (var12 >> 1580302338);
                                        var15 = -(var9 >> 1508088226) + hf.field_t;
                                        var16 = var14 * var14 + var15 * var15;
                                        var17 = 0;
                                        L21: while (true) {
                                          L22: {
                                            if (var17 >= var7.length) {
                                              break L22;
                                            } else {
                                              if (var7[var17] != var16) {
                                                if (var7[var17] <= var16) {
                                                  var17++;
                                                  continue L21;
                                                } else {
                                                  var7[var17] = var16;
                                                  var21[var17] = var12;
                                                  break L22;
                                                }
                                              } else {
                                                var8[var17] = (var21[var17] + var12) / 2;
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (oe.field_b) {
                                              break L23;
                                            } else {
                                              if (this.field_m[var13]) {
                                                this.a(var12 >> -1234786334, -4, var9 >> 2055624866);
                                                uf.field_p[jf.b((byte) 56)] = new gf(var12 >> -1776438366, var9 >> -847813662, 16);
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          L24: {
                                            if ((15 & (this.field_n >> -1691772222) + var13) != 0) {
                                              stackOut_87_0 = 0;
                                              stackIn_88_0 = stackOut_87_0;
                                              break L24;
                                            } else {
                                              stackOut_86_0 = 1;
                                              stackIn_88_0 = stackOut_86_0;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            var17 = stackIn_88_0;
                                            if (var17 == 0) {
                                              break L25;
                                            } else {
                                              L26: {
                                                var18 = 0;
                                                if (this.field_g[var13]) {
                                                  var18 = 1;
                                                  this.field_g[var13] = false;
                                                  break L26;
                                                } else {
                                                  if (!this.field_g[var13 - -var5_int]) {
                                                    if (this.field_g[-var5_int + var13]) {
                                                      this.field_g[-var5_int + var13] = false;
                                                      var18 = 1;
                                                      break L26;
                                                    } else {
                                                      break L26;
                                                    }
                                                  } else {
                                                    this.field_g[var5_int + var13] = false;
                                                    var18 = 1;
                                                    break L26;
                                                  }
                                                }
                                              }
                                              if (var18 == 0) {
                                                break L25;
                                              } else {
                                                pi.field_a = pi.field_a + 1;
                                                if (2800 <= pi.field_a) {
                                                  fn.a(26, 229, 3);
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                          L27: {
                                            if (this.field_d[-1 + var13]) {
                                              break L27;
                                            } else {
                                              if (this.field_g[-1 + var13]) {
                                                this.field_d[-1 + var13] = true;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          L28: {
                                            if (this.field_d[var13 - -1]) {
                                              break L28;
                                            } else {
                                              if (this.field_g[var13 + 1]) {
                                                this.field_d[1 + var13] = true;
                                                break L28;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                          L29: {
                                            if (this.field_d[-this.field_k + (var13 - 1)]) {
                                              break L29;
                                            } else {
                                              if (!this.field_g[var13 + -this.field_k - 1]) {
                                                break L29;
                                              } else {
                                                this.field_d[-1 + -this.field_k + var13] = true;
                                                break L29;
                                              }
                                            }
                                          }
                                          L30: {
                                            if (this.field_d[-this.field_k + (var13 - -1)]) {
                                              break L30;
                                            } else {
                                              if (!this.field_g[-this.field_k + (var13 - -1)]) {
                                                break L30;
                                              } else {
                                                this.field_d[1 + -this.field_k + var13] = true;
                                                break L30;
                                              }
                                            }
                                          }
                                          if (this.field_g[var13]) {
                                            break L17;
                                          } else {
                                            L31: {
                                              this.field_d[var13] = false;
                                              if (this.field_g[var13 - -this.field_k]) {
                                                break L31;
                                              } else {
                                                this.field_d[this.field_k + var13] = true;
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              if (this.field_g[var13 - -1]) {
                                                break L32;
                                              } else {
                                                if (!this.field_g[this.field_k + 1 + var13]) {
                                                  break L32;
                                                } else {
                                                  this.field_d[this.field_k + 1 + var13] = true;
                                                  break L32;
                                                }
                                              }
                                            }
                                            if (this.field_g[var13 + -1]) {
                                              break L17;
                                            } else {
                                              if (this.field_g[-1 + var13 + this.field_k]) {
                                                this.field_d[var13 + (-1 - -this.field_k)] = true;
                                                break L17;
                                              } else {
                                                var12 = var12 + var5_int;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        this.field_d[var13] = false;
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                var12 = var12 + var5_int;
                                continue L16;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                        var9--;
                        continue L3;
                      }
                    }
                  } else {
                    L33: {
                      if (var6 <= var7_int) {
                        break L33;
                      } else {
                        L34: {
                          if (!this.field_o) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L34;
                          } else {
                            stackOut_12_0 = 124;
                            stackIn_14_0 = stackOut_12_0;
                            break L34;
                          }
                        }
                        L35: {
                          var8_int = stackIn_14_0;
                          if (!this.field_o) {
                            stackOut_16_0 = 125;
                            stackIn_17_0 = stackOut_16_0;
                            break L35;
                          } else {
                            stackOut_15_0 = -1;
                            stackIn_17_0 = stackOut_15_0;
                            break L35;
                          }
                        }
                        var9 = stackIn_17_0;
                        var10 = var8_int;
                        L36: while (true) {
                          if (var10 == var9) {
                            break L33;
                          } else {
                            L37: {
                              var11 = var10 + this.field_k * var7_int;
                              if (!this.field_g[var11]) {
                                break L37;
                              } else {
                                L38: {
                                  if (!this.field_m[var11]) {
                                    break L38;
                                  } else {
                                    if (!this.field_d[var11]) {
                                      this.field_m[var11] = false;
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                                L39: {
                                  if (this.field_g[-this.field_k + var11]) {
                                    break L39;
                                  } else {
                                    if (!je.e(var10, 1 + var7_int)) {
                                      break L39;
                                    } else {
                                      this.field_g[var11] = false;
                                      this.field_g[var11 + -this.field_k] = true;
                                      break L37;
                                    }
                                  }
                                }
                                L40: {
                                  if (this.field_g[var11 - this.field_k]) {
                                    break L40;
                                  } else {
                                    if (!this.field_b[var11]) {
                                      break L40;
                                    } else {
                                      this.field_g[var11] = false;
                                      this.field_g[-this.field_k + var11] = true;
                                      break L37;
                                    }
                                  }
                                }
                                L41: {
                                  if (this.field_g[this.field_k + var11]) {
                                    break L41;
                                  } else {
                                    if (this.field_b[this.field_k + var11]) {
                                      break L41;
                                    } else {
                                      if (!je.e(var10, var7_int + 1)) {
                                        this.field_g[var11] = false;
                                        this.field_g[var11 + this.field_k] = true;
                                        break L37;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                L42: {
                                  if (this.field_g[this.field_k + var11]) {
                                    break L42;
                                  } else {
                                    if (this.field_g[-this.field_k + var11]) {
                                      break L42;
                                    } else {
                                      if (je.e(var10, var7_int + 1)) {
                                        break L42;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                                L43: {
                                  if (this.field_g[var5_int + var11]) {
                                    break L43;
                                  } else {
                                    if (!je.e(var5_int + var10, var7_int)) {
                                      this.field_g[var11] = false;
                                      this.field_g[var11 + var5_int] = true;
                                      break L37;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                if (this.field_g[var11 - var5_int]) {
                                  break L37;
                                } else {
                                  if (je.e(var10 - var5_int, var7_int)) {
                                    break L37;
                                  } else {
                                    this.field_g[var11] = false;
                                    this.field_g[-var5_int + var11] = true;
                                    break L37;
                                  }
                                }
                              }
                            }
                            var10 = var10 + var5_int;
                            continue L36;
                          }
                        }
                      }
                    }
                    var7_int--;
                    continue L2;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L44: {
            var5 = decompiledCaughtException;
            stackOut_155_0 = (RuntimeException) (var5);
            stackOut_155_1 = new StringBuilder().append("rb.O(").append(param0).append(',').append(param1).append(',');
            stackIn_157_0 = stackOut_155_0;
            stackIn_157_1 = stackOut_155_1;
            stackIn_156_0 = stackOut_155_0;
            stackIn_156_1 = stackOut_155_1;
            if (param2 == null) {
              stackOut_157_0 = (RuntimeException) ((Object) stackIn_157_0);
              stackOut_157_1 = (StringBuilder) ((Object) stackIn_157_1);
              stackOut_157_2 = "null";
              stackIn_158_0 = stackOut_157_0;
              stackIn_158_1 = stackOut_157_1;
              stackIn_158_2 = stackOut_157_2;
              break L44;
            } else {
              stackOut_156_0 = (RuntimeException) ((Object) stackIn_156_0);
              stackOut_156_1 = (StringBuilder) ((Object) stackIn_156_1);
              stackOut_156_2 = "{...}";
              stackIn_158_0 = stackOut_156_0;
              stackIn_158_1 = stackOut_156_1;
              stackIn_158_2 = stackOut_156_2;
              break L44;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_158_0), stackIn_158_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, je[][] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_122_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var18 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (vi.field_h) {
                break L1;
              } else {
                if (!wm.field_e) {
                  var10 = param2 * 4;
                  L2: while (true) {
                    if (var10 > 4 + 4 * param0) {
                      L3: {
                        if (param4 == 17761) {
                          break L3;
                        } else {
                          rb.a(-117);
                          break L3;
                        }
                      }
                      var10 = jb.field_o[cm.field_o];
                      var11 = sk.field_b[cm.field_o];
                      var12 = param2 * 4;
                      L4: while (true) {
                        if (var12 > 4 + 4 * param0) {
                          var12 = 4 * param2;
                          L5: while (true) {
                            if (4 * param0 + 4 < var12) {
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              var13 = param3 * 4;
                              L6: while (true) {
                                if (var13 < 4 * param1 + 4) {
                                  var12++;
                                  continue L5;
                                } else {
                                  var7_int = -li.field_c + 8 * var12;
                                  var8 = -db.field_d + var13 * 8;
                                  if (-64 < var7_int) {
                                    if (-64 < var8) {
                                      if (var7_int < 704) {
                                        L7: {
                                          if (544 > var8) {
                                            var14 = var13 * this.field_k + var12;
                                            if (this.field_g[var14]) {
                                              var15 = 0;
                                              if (this.field_d[var14]) {
                                                if (!this.field_g[var14 - this.field_k]) {
                                                  L8: {
                                                    var16 = 8;
                                                    eh.f(ll.a((byte) -73, 8) + var7_int, -var15 + (var8 - ll.a((byte) -73, 4)), 4, 16711680, 110);
                                                    if (8 < var16 + (8 - var15)) {
                                                      var16 = -var15 + 8;
                                                      break L8;
                                                    } else {
                                                      break L8;
                                                    }
                                                  }
                                                  eh.a(var7_int + ll.a((byte) -73, 8) << -253735772, -ll.a((byte) -73, 4) + var8 - (var15 + -1) << -1599481916, 64, 4, re.field_c);
                                                  eh.a(var7_int - -ll.a((byte) -73, 8) << 534001988, -var15 + var8 + (-ll.a((byte) -73, 4) + 1) << 435033956, 64, 4, re.field_c);
                                                  eh.a(var7_int + ll.a((byte) -73, 8) << 1384996580, 1 + (-ll.a((byte) -73, 6) + (var8 + -var15)) << -391524380, 80, 5, re.field_c);
                                                  eh.a(var7_int + ll.a((byte) -73, 8) << -816472796, 1 + var8 - var15 + -ll.a((byte) -73, 6) << -1073720860, 80, 5, re.field_c);
                                                  break L7;
                                                } else {
                                                  var13--;
                                                  continue L6;
                                                }
                                              } else {
                                                var13--;
                                                continue L6;
                                              }
                                            } else {
                                              var13--;
                                              continue L6;
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        var13--;
                                        continue L6;
                                      } else {
                                        var13--;
                                        continue L6;
                                      }
                                    } else {
                                      var13--;
                                      continue L6;
                                    }
                                  } else {
                                    var13--;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var13 = param3 * 4;
                          L9: while (true) {
                            if (var13 < 4 * param1 - -4) {
                              var12++;
                              continue L4;
                            } else {
                              L10: {
                                var7_int = -li.field_c + var12 * 8;
                                var8 = -db.field_d + var13 * 8;
                                if (-64 >= var7_int) {
                                  break L10;
                                } else {
                                  if ((var8 ^ -1) >= 63) {
                                    break L10;
                                  } else {
                                    if (var7_int >= 704) {
                                      break L10;
                                    } else {
                                      if (-545 < (var8 ^ -1)) {
                                        if (!param5[var12 >> -773432030][var13 >> -684892094].field_V) {
                                          break L10;
                                        } else {
                                          var14 = var12 + var13 * this.field_k;
                                          if (this.field_c[var14] <= 0) {
                                            L11: {
                                              L12: {
                                                var15 = var11;
                                                if (param5[var12 >> 1572220450][var13 >> 433731906].field_A) {
                                                  break L12;
                                                } else {
                                                  if (param5[var12 - 1 >> -967870][var13 >> -1695357182].field_A) {
                                                    break L12;
                                                  } else {
                                                    if (param5[var12 - -1 >> -739360958][var13 >> 1177148642].field_A) {
                                                      break L12;
                                                    } else {
                                                      if (param5[var12 >> 1147550626][var13 + -1 >> -500111678].field_A) {
                                                        break L12;
                                                      } else {
                                                        if (param5[var12 >> 612754466][1 + var13 >> -793923006].field_A) {
                                                          break L12;
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var15 = -2004317953;
                                              break L11;
                                            }
                                            if (!this.field_b[var14]) {
                                              if (this.field_b[var14 - -this.field_k]) {
                                                var16 = this.field_i[var14];
                                                var17 = (this.field_i[-1 + var14] + (var16 + this.field_i[1 + var14])) / 3;
                                                eh.b(var7_int, -var17 + var8 + 8, 8, var17, var15, var10);
                                                break L10;
                                              } else {
                                                if ((this.field_p[var14] ^ -1) >= -17) {
                                                  break L10;
                                                } else {
                                                  var16 = this.field_p[var14 - -this.field_k] + this.field_p[-this.field_k + var14] + (this.field_p[var14 - 1] + this.field_p[var14]) >> 144727010;
                                                  eh.b(var7_int, var8, 8, 8, 65280, var16);
                                                  break L10;
                                                }
                                              }
                                            } else {
                                              eh.b(var7_int, var8, 8, 8, var15, var10);
                                              break L10;
                                            }
                                          } else {
                                            L13: {
                                              var9 = this.field_c[var14];
                                              var15 = 8930372;
                                              if (1 != var9) {
                                                break L13;
                                              } else {
                                                var15 = 8930372;
                                                break L13;
                                              }
                                            }
                                            L14: {
                                              if (var9 != 2) {
                                                break L14;
                                              } else {
                                                var15 = 11158596;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              if (3 == var9) {
                                                var15 = 16729156;
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              if (var9 != 4) {
                                                break L16;
                                              } else {
                                                var15 = 16746564;
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              if (-6 != (var9 ^ -1)) {
                                                break L17;
                                              } else {
                                                var15 = 16755268;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              if (6 == var9) {
                                                var15 = 16777028;
                                                break L18;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              if (var9 != 7) {
                                                break L19;
                                              } else {
                                                var15 = 16777096;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              if ((var9 ^ -1) == -9) {
                                                var15 = 16777130;
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (9 <= var9) {
                                                var15 = 16777215;
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            eh.b(var7_int + -4, var8 - -4, 16, 16, var15, var10);
                                            break L10;
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              var13--;
                              continue L9;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = param3 * 4;
                      L22: while (true) {
                        if (var11 < 4 + param1 * 4) {
                          var10++;
                          continue L2;
                        } else {
                          L23: {
                            var7_int = 8 * var10 - li.field_c;
                            var8 = 8 * var11 - db.field_d;
                            if ((var7_int ^ -1) >= 63) {
                              break L23;
                            } else {
                              if (var8 <= -64) {
                                break L23;
                              } else {
                                if (704 <= var7_int) {
                                  break L23;
                                } else {
                                  if (-545 < (var8 ^ -1)) {
                                    if (!param5[var10 >> 478278114][var11 >> -1612791742].field_V) {
                                      break L23;
                                    } else {
                                      var12 = var10 + this.field_k * var11;
                                      if (!this.field_g[var12]) {
                                        break L23;
                                      } else {
                                        L24: {
                                          var13 = var8;
                                          var14 = 8;
                                          if (!param5[var10 >> -952388894][var11 - -1 >> 523724706].field_a) {
                                            break L24;
                                          } else {
                                            var14 = 12;
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          var15 = 8;
                                          eh.e(var7_int, var13, var15, var14, 0);
                                          if (this.field_g[var12 - 1]) {
                                            break L25;
                                          } else {
                                            L26: {
                                              L27: {
                                                if (this.field_b[var12]) {
                                                  break L27;
                                                } else {
                                                  if (param5[var10 >> -1949908254][var11 + 1 >> 467518530].field_a) {
                                                    break L26;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                              if (this.field_g[this.field_k + var12]) {
                                                break L26;
                                              } else {
                                                eh.c(var7_int, var13 - -4, 3, 0);
                                                break L25;
                                              }
                                            }
                                            if (this.field_g[var12 - 1 - -this.field_k]) {
                                              eh.a(-8 + var7_int, var13 - 8, var7_int, var13 - -8);
                                              eh.c(var7_int, var13 - -8, 6, 0);
                                              eh.a();
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        L28: {
                                          if (!this.field_g[1 + var12]) {
                                            L29: {
                                              L30: {
                                                if (this.field_b[var12]) {
                                                  break L30;
                                                } else {
                                                  if (param5[var10 >> 1416387906][1 + var11 >> -857838814].field_a) {
                                                    break L29;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                              if (this.field_g[var12 + this.field_k]) {
                                                break L29;
                                              } else {
                                                eh.c(var7_int + 8, 4 + var13, 3, 0);
                                                break L28;
                                              }
                                            }
                                            if (this.field_g[this.field_k + (var12 - -1)]) {
                                              eh.a(8 + var7_int, var13 - 8, 16 + var7_int, var13 - -8);
                                              eh.c(8 + var7_int, var13 + 8, 6, 0);
                                              eh.a();
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        var16 = var12 + -this.field_k;
                                        if (this.field_g[var16]) {
                                          break L23;
                                        } else {
                                          if (this.field_g[var16 + 1]) {
                                            break L23;
                                          } else {
                                            if (!this.field_g[var16 - 1]) {
                                              eh.g(var7_int, var13, 8, 16777113, 200);
                                              eh.g(var7_int, 1 + var13, 9, 16777113, 128);
                                              eh.g(var7_int, var13 + 2, 10, 16777113, 64);
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                          var11--;
                          continue L22;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var7 = decompiledCaughtException;
            stackOut_119_0 = (RuntimeException) (var7);
            stackOut_119_1 = new StringBuilder().append("rb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_121_0 = stackOut_119_0;
            stackIn_121_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param5 == null) {
              stackOut_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackOut_121_1 = (StringBuilder) ((Object) stackIn_121_1);
              stackOut_121_2 = "null";
              stackIn_122_0 = stackOut_121_0;
              stackIn_122_1 = stackOut_121_1;
              stackIn_122_2 = stackOut_121_2;
              break L31;
            } else {
              stackOut_120_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackOut_120_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackOut_120_2 = "{...}";
              stackIn_122_0 = stackOut_120_0;
              stackIn_122_1 = stackOut_120_1;
              stackIn_122_2 = stackOut_120_2;
              break L31;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_122_0), stackIn_122_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rb(int param0, int param1) {
        int var3 = 0;
        this.field_j = param1 * 4;
        this.field_k = param0 * 4;
        this.field_i = new int[this.field_j * this.field_k];
        this.field_g = new boolean[this.field_k * this.field_j];
        this.field_h = new int[this.field_k * this.field_j];
        this.field_b = new boolean[this.field_j * this.field_k];
        this.field_m = new boolean[this.field_j * this.field_k];
        this.field_p = new int[this.field_j * this.field_k];
        this.field_c = new int[this.field_j * this.field_k];
        this.field_d = new boolean[this.field_j * this.field_k];
        for (var3 = 0; var3 < this.field_j * this.field_k; var3++) {
            this.field_h[var3] = ll.a((byte) -73, 15);
        }
        this.field_n = 0;
    }

    static {
        field_f = "This password is part of your Player Name, and would be easy to guess";
        field_l = new int[25];
    }
}
