/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    int field_f;
    static String field_h;
    private int field_b;
    int field_l;
    double field_j;
    static String field_i;
    private qe field_g;
    static bj[] field_r;
    int field_n;
    static int[][] field_o;
    double field_k;
    int field_q;
    double field_a;
    static boolean[] field_s;
    private int field_e;
    int field_d;
    int field_m;
    double field_c;
    int field_p;

    private final void b(byte param0) {
        int var2 = 0;
        qe var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        vl var30 = null;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        int var36 = 0;
        L0: {
          var36 = stellarshard.field_B;
          if (param0 < -125) {
            break L0;
          } else {
            this.a(88, 65, true);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -1001) {
            return;
          } else {
            if (a.field_h[var2] != null) {
              if (this.a(-48, a.field_h[var2], false)) {
                L2: {
                  if (a.field_h[var2].field_m != -1) {
                    break L2;
                  } else {
                    if (nc.field_H != 2) {
                      break L2;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
                var3 = a.field_h[var2];
                if (var3 != this.field_g) {
                  if (!var3.a((byte) -47)) {
                    L3: {
                      var4 = -var3.field_a + this.field_c;
                      var6 = this.field_k - var3.field_l;
                      if (0.0 != var4) {
                        break L3;
                      } else {
                        if (0.0 != var6) {
                          break L3;
                        } else {
                          var2++;
                          continue L1;
                        }
                      }
                    }
                    var8 = Math.sqrt(var6 * var6 + var4 * var4);
                    var10 = var4 / var8;
                    var12 = var6 / var8;
                    var14 = -(this.field_a * var10) + var12 * this.field_j;
                    var16 = -(var10 * var3.field_k) + var12 * var3.field_d;
                    var18 = var10 * this.field_j + this.field_a * var12;
                    var20 = var3.field_d * var10 + var12 * var3.field_k;
                    if (var18 < var20) {
                      L4: {
                        var22 = var18 * (double)this.field_m + (double)var3.field_n * var20;
                        var24 = -var20 + var18;
                        var26 = 0.0;
                        var26 = (var22 - var24 * (double)var3.field_n) / (double)(this.field_m - -var3.field_n);
                        var28 = 0.0;
                        if (0.0 == var10) {
                          var10 = 0.00001;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var28 = var24 + var26;
                        if (var12 == 0.0) {
                          var12 = 0.00001;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        var30 = new vl((vl) (this));
                        var30.field_b = 0;
                        var30.field_f = 6;
                        wk.field_b[eg.a(-101)] = var30;
                        this.field_a = (var12 * (var26 / var10) - var14) / (var12 * var12 / var10 + var10);
                        var3.field_k = (var28 / var10 * var12 - var16) / (var12 * var12 / var10 + var10);
                        this.field_j = (-(this.field_a * var12) + var26) / var10;
                        var3.field_d = (var28 - var12 * var3.field_k) / var10;
                        if (a.field_h[var2].field_m == -1) {
                          if (-1 > (el.field_I ^ -1)) {
                            break L6;
                          } else {
                            el.field_I = 50;
                            this.field_p = this.field_p - 1;
                            break L6;
                          }
                        } else {
                          this.field_p = this.field_p - 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (11 != var3.field_m) {
                            break L8;
                          } else {
                            if ((var3.field_c ^ -1) == -14) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3.field_g = var3.field_g - 1;
                        break L7;
                      }
                      L9: {
                        if (fe.field_e) {
                          if (a.field_h[0] == null) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                var31 = -a.field_h[0].field_a + this.field_c;
                                var33 = this.field_k - a.field_h[0].field_l;
                                var35 = 128;
                                if (var31 != 0.0) {
                                  break L11;
                                } else {
                                  if (var33 != 0.0) {
                                    break L11;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var35 = (int)(25600.0 / Math.sqrt(var31 * var31 + var33 * var33));
                              break L10;
                            }
                            L12: {
                              if ((var35 ^ -1) >= -129) {
                                break L12;
                              } else {
                                var35 = 128;
                                break L12;
                              }
                            }
                            ll.field_c.a(sb.field_e[40], 100, pk.field_h * var35 / 50);
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      L13: {
                        if (5 < this.field_p) {
                          break L13;
                        } else {
                          if (-101 > (this.field_l ^ -1)) {
                            break L13;
                          } else {
                            var2++;
                            continue L1;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (-12 != (var3.field_m ^ -1)) {
                            break L15;
                          } else {
                            if (var3.field_c == 13) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var3.field_g = var3.field_g - this.field_p;
                        break L14;
                      }
                      this.field_f = 4;
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, pb param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        double var6 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qe var10 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var3_int = (int)(320.0 + this.field_c);
              var4 = (int)(this.field_k + 240.0);
              var5 = this.field_q;
              if (0 != (this.field_d ^ -1)) {
                var6_int = 16711680 & ((this.field_d & 16711680) * this.field_e + (128 + -this.field_e) * (16711680 & this.field_q)) / 128;
                var7 = 65280 & ((this.field_d & 65280) * this.field_e + (65280 & this.field_q) * (-this.field_e + 128)) / 128;
                var8 = 255 & ((this.field_q & 255) * (128 + -this.field_e) - -((this.field_d & 255) * this.field_e)) / 128;
                var5 = var8 + var7 + var6_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((this.field_f ^ -1) == -1) {
                if (this.field_n != -4) {
                  if (this.field_n == -2) {
                    ti.c(var3_int, var4, 5 + this.field_p, 16777215 + -var5, 32);
                    ti.e(var3_int, var4, 1 - -this.field_p, var5);
                    break L2;
                  } else {
                    L3: {
                      if ((this.field_n ^ -1) == 0) {
                        break L3;
                      } else {
                        if (this.field_n != 0) {
                          L4: {
                            if (-2 == (this.field_n ^ -1)) {
                              break L4;
                            } else {
                              if (-7 == (this.field_n ^ -1)) {
                                break L4;
                              } else {
                                if ((this.field_n ^ -1) != -3) {
                                  if (-4 == (this.field_n ^ -1)) {
                                    break L2;
                                  } else {
                                    if (7 != this.field_n) {
                                      if ((this.field_n ^ -1) == -5) {
                                        break L2;
                                      } else {
                                        if ((this.field_n ^ -1) != -10) {
                                          if ((this.field_n ^ -1) == -6) {
                                            ti.c(var3_int, var4, this.field_p + 5, var5, 32);
                                            ti.c(var3_int, var4, 3 - -this.field_p, var5, 32);
                                            ti.c(var3_int, var4, this.field_p + 1, 16777215, 32);
                                            break L2;
                                          } else {
                                            if (this.field_n != -3) {
                                              L5: {
                                                if (-11 == (this.field_n ^ -1)) {
                                                  break L5;
                                                } else {
                                                  if (-12 == (this.field_n ^ -1)) {
                                                    break L5;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              }
                                              ti.a(var3_int << -1485503996, var4 << 442772228, this.field_p - -6 << 456904196, 192, ei.field_I);
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  var6_int = (int)(Math.sin(0.1 * (double)this.field_b) * (double)this.field_p);
                                  var7 = (int)(Math.cos((double)this.field_b * 0.1) * (double)this.field_p);
                                  ti.c(var3_int + var6_int, var4 + var7, this.field_p + 1, 0, 128);
                                  ti.c(var3_int + -var6_int, -var7 + var4, 1 - -this.field_p, 0, 128);
                                  ti.c(var3_int + var6_int, var4 + var7, this.field_p, var5, 128);
                                  ti.c(var3_int - var6_int, var4 + -var7, this.field_p, var5, 128);
                                  ti.e(var3_int - -var6_int, var4 + var7, 1 - -(this.field_p / 3), 16777215);
                                  ti.e(var3_int - var6_int, -var7 + var4, this.field_p / 3 + 1, 16777215);
                                  break L2;
                                }
                              }
                            }
                          }
                          ti.e(var3_int, var4, this.field_p + 1, var5);
                          ti.e((int)(-(this.field_j / 2.0) + (double)var3_int), (int)((double)var4 - this.field_a / 2.0), this.field_p / 2 + 1, var5);
                          ti.e((int)(-(this.field_j / 4.0) + (double)var3_int), (int)((double)var4 - this.field_a / 4.0), 1 + this.field_p / 4, var5);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ti.e(var3_int, var4, this.field_p + 1, var5);
                    ti.c((int)(-this.field_j + (double)var3_int), (int)(-this.field_a + (double)var4), this.field_p / 2 + 1, var5, 128);
                    ti.c((int)((double)var3_int - this.field_j * 2.0), (int)(-(this.field_a * 2.0) + (double)var4), 1 + this.field_p / 3, var5, 64);
                    ti.c((int)(-(this.field_j * 3.0) + (double)var3_int), (int)(-(this.field_a * 3.0) + (double)var4), 1 - -(this.field_p / 4), var5, 32);
                    ti.e(var3_int, var4, 1 - -(this.field_p / 2), 16777215);
                    break L2;
                  }
                } else {
                  ti.c(var3_int, var4, 5 - -this.field_p, -var5 + 16777215, 32);
                  ti.e(var3_int, var4, this.field_p, var5);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L6: {
              if ((this.field_f ^ -1) == -2) {
                param1.e();
                ti.c(var3_int, var4, this.field_b / 16 + 1, 255, 128 + -(this.field_b / 2));
                pd.field_h.a((byte) -107);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-5 == (this.field_f ^ -1)) {
                param1.e();
                ti.c(var3_int, var4, this.field_b / 16 + 1, 255, 128 + -(this.field_b / 2));
                pd.field_h.a((byte) -107);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((this.field_f ^ -1) != -3) {
                break L8;
              } else {
                if (0 < this.field_b) {
                  var6_int = this.field_b >> 340714084;
                  var7 = 2 * this.field_b / 3 - -24;
                  pg.field_hb[var6_int].c(-var7 + var3_int, var4 - var7, var7 * 2, 2 * var7, (255 + -this.field_b) / 2);
                  var7 = 24 + 2 * this.field_b / 9;
                  pg.field_hb[var6_int].c(-var7 + var3_int, var4 + -var7, var7 * 2, 2 * var7, 255 - this.field_b);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (this.field_f != 6) {
                break L9;
              } else {
                if ((this.field_b ^ -1) < -1) {
                  var6_int = this.field_b >> 98086564;
                  var7 = 12 + this.field_b / 3;
                  pg.field_hb[var6_int].c(var3_int + -var7, var4 - var7, 2 * var7, var7 * 2, (255 + -this.field_b) / 2);
                  var7 = 12 + this.field_b / 9;
                  pg.field_hb[var6_int].c(-var7 + var3_int, var4 - var7, var7 * 2, var7 * 2, -this.field_b + 255);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (3 == this.field_f) {
                ti.c(var3_int, var4, 7, 0, 128);
                ti.e(var3_int, var4, 2, var5);
                ti.c(var3_int, var4, 3, var5, 128);
                var6_int = 0;
                L11: while (true) {
                  if (-6 >= (var6_int ^ -1)) {
                    break L10;
                  } else {
                    ti.c((int)((double)var3_int - this.field_j), (int)((double)var4 - this.field_a), 3, var5, 128 + -(15 * var6_int));
                    var6_int++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (this.field_f == 5) {
                if (-5 == this.field_n) {
                  var6 = 0.0;
                  L13: while (true) {
                    if (1.0 <= var6) {
                      break L12;
                    } else {
                      ti.a((int)(var6 * this.field_j + (double)var3_int) << -1600441820, (int)((double)var4 + var6 * this.field_a) << -1904504156, (int)(6.0 + (-var6 + 1.0) * (double)this.field_p) << -240804572, 32 + -(int)(32.0 * var6), ei.field_I);
                      var6 = var6 + 0.1;
                      continue L13;
                    }
                  }
                } else {
                  var6 = 0.0;
                  L14: while (true) {
                    if (var6 >= 1.0) {
                      break L12;
                    } else {
                      ti.c((int)((double)var3_int + this.field_j * var6), (int)((double)var4 + var6 * this.field_a), 1 + this.field_p, var5, 255 + -(64 * this.field_b));
                      var6 = var6 + 0.1;
                      continue L14;
                    }
                  }
                }
              } else {
                break L12;
              }
            }
            L15: {
              if (param0 < -35) {
                break L15;
              } else {
                var10 = (qe) null;
                discarded$1 = this.a(68, (qe) null, true);
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var3);
            stackOut_64_1 = new StringBuilder().append("vl.E(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L16;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L16;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ')');
        }
    }

    final vl a(byte param0) {
        int var2 = 0;
        double var3_double = 0.0;
        vl var3 = null;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        if (param0 < -84) {
          L0: {
            var2 = this.field_l;
            if (var2 == 1001) {
              var2 = 250;
              break L0;
            } else {
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              var2--;
              if (-1002 == (this.field_l ^ -1)) {
                var3_double = Math.sqrt(this.field_a * this.field_a + this.field_j * this.field_j);
                var5 = -0.1 + (Math.atan2(this.field_j, this.field_a) + 0.2 * Math.random());
                this.field_j = var3_double * Math.sin(var5);
                this.field_a = Math.cos(var5) * var3_double;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.a(true);
              if ((this.field_d ^ -1) != 0) {
                L4: {
                  this.field_e = this.field_e + 1;
                  if (128 <= this.field_e) {
                    break L4;
                  } else {
                    this.field_e = this.field_e + 1;
                    if (this.field_e >= 128) {
                      this.field_e = 0;
                      this.field_q = this.field_d;
                      this.field_d = -1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 == this.field_n) {
                  if (this.field_d != -1) {
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (this.field_f == 0) {
                L6: {
                  this.field_b = this.field_b + 1;
                  this.b((byte) -127);
                  if (0 < this.field_p) {
                    break L6;
                  } else {
                    this.field_j = this.field_j * 0.1;
                    this.field_a = this.field_a * 0.1;
                    this.field_p = 1;
                    this.field_q = 16777215;
                    this.field_f = 1;
                    break L6;
                  }
                }
                L7: {
                  if (-1 == (this.field_f ^ -1)) {
                    break L7;
                  } else {
                    this.field_l = 0;
                    break L7;
                  }
                }
                if (-1 <= (this.field_l ^ -1)) {
                  break L5;
                } else {
                  if (11 != this.field_n) {
                    L8: {
                      var3 = new vl((vl) (this));
                      if (5 == this.field_l) {
                        var3.field_p = 5 + -var2;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var4 = dc.a(true);
                    if (var4 > -1) {
                      wk.field_b[var4] = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            L9: {
              if (this.field_f != 1) {
                if (-3 == (this.field_f ^ -1)) {
                  this.field_b = this.field_b + 16;
                  if (this.field_b <= 255) {
                    break L9;
                  } else {
                    return null;
                  }
                } else {
                  if (this.field_f != 6) {
                    break L9;
                  } else {
                    this.field_b = this.field_b + 16;
                    if ((this.field_b ^ -1) >= -256) {
                      break L9;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                this.field_b = this.field_b + 16;
                if (255 >= this.field_b) {
                  break L9;
                } else {
                  return null;
                }
              }
            }
            L10: {
              if (3 == this.field_f) {
                this.field_b = this.field_b + 1;
                this.b((byte) -126);
                if (-1 <= (this.field_p ^ -1)) {
                  this.field_q = 16711680;
                  this.field_p = 1;
                  this.field_j = this.field_j * 0.1;
                  this.field_f = 1;
                  this.field_a = this.field_a * 0.1;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if ((this.field_f ^ -1) == -5) {
                this.b((byte) -128);
                this.field_b = this.field_b + 8;
                if (this.field_b <= 255) {
                  if (0 >= this.field_p) {
                    this.field_b = 0;
                    this.field_p = 1;
                    this.field_f = 1;
                    this.field_q = 16777215;
                    this.field_a = this.field_a * 0.1;
                    this.field_j = this.field_j * 0.1;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  return null;
                }
              } else {
                break L11;
              }
            }
            if (-384.0 <= this.field_c) {
              if (this.field_c <= 384.0) {
                if (this.field_k >= -304.0) {
                  if (304.0 >= this.field_k) {
                    if (this.field_p > 0) {
                      if (var2 > 0) {
                        continue L1;
                      } else {
                        if (this.field_l != 1001) {
                          return (vl) (this);
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } else {
          return (vl) null;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_k = this.field_k - (double)param0;
        if (!param2) {
            field_o = (int[][]) null;
        }
        this.field_c = this.field_c - (double)param1;
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_o = (int[][]) null;
        field_i = null;
        int var1 = 118 % ((-40 - param0) / 46);
        field_h = null;
    }

    private final void a(boolean param0) {
        this.field_c = this.field_c + this.field_j;
        if (!param0) {
            vl.a(-40);
        }
        this.field_k = this.field_k + this.field_a;
    }

    private final boolean a(int param0, qe param1, boolean param2) {
        RuntimeException var4 = null;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_a - 48.0 >= this.field_c) {
                break L1;
              } else {
                if (this.field_c >= 48.0 + param1.field_a) {
                  break L1;
                } else {
                  if (-48.0 + param1.field_l >= this.field_k) {
                    break L1;
                  } else {
                    if (param1.field_l + 48.0 > this.field_k) {
                      L2: {
                        if (param2) {
                          break L2;
                        } else {
                          if (param1.b(param0 ^ -688).c((int)(param1.field_a - 48.0), (int)(param1.field_l - 48.0), (int)this.field_c, (int)this.field_k)) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              if (-4.0 + param1.field_a >= this.field_c) {
                break L3;
              } else {
                if (this.field_c >= 4.0 + param1.field_a) {
                  break L3;
                } else {
                  if (this.field_k <= param1.field_l - 4.0) {
                    break L3;
                  } else {
                    if (this.field_k < 4.0 + param1.field_l) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            if (param0 == -48) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              field_r = (bj[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("vl.F(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    private vl(vl param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              this.field_b = 0;
              this.field_n = -2;
              this.field_j = param0.field_j;
              this.field_e = param0.field_e;
              this.field_m = param0.field_m;
              this.field_d = param0.field_d;
              this.field_k = param0.field_k;
              this.field_p = param0.field_p;
              this.field_l = 0;
              this.field_q = param0.field_q;
              this.field_f = 5;
              this.field_c = param0.field_c;
              this.field_g = param0.field_g;
              this.field_a = param0.field_a;
              if (9 != param0.field_n) {
                break L1;
              } else {
                this.field_n = -4;
                break L1;
              }
            }
            L2: {
              if (param0.field_n != 10) {
                break L2;
              } else {
                this.field_n = -5;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("vl.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    vl(int param0, qe param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              this.field_m = 10;
              this.field_c = 0.0;
              this.field_k = 0.0;
              this.field_f = param0;
              this.field_q = 16777215;
              this.field_g = param1;
              this.field_b = 0;
              this.field_a = 0.0;
              this.field_e = 0;
              this.field_p = 1;
              this.field_j = 0.0;
              this.field_d = -1;
              if (param0 != 3) {
                break L1;
              } else {
                this.field_q = 16711680;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("vl.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_h = "Sound: ";
        field_i = "to keep fullscreen or";
    }
}
