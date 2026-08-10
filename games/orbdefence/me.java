/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ca {
    static hj field_f;
    private double field_l;
    static ki field_g;
    private double field_o;
    private double field_h;
    private double field_k;
    private int field_j;
    static String field_i;
    static hj field_n;
    int field_m;

    final void a(byte param0) {
        int var2;
        int var3;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          this.field_o = this.field_o + this.field_l;
          this.field_h = this.field_h + this.field_k;
          this.field_j = this.field_j + 1;
          if (param0 == 32) {
            break L0;
          } else {
            this.field_o = -1.8265532045286497;
            break L0;
          }
        }
        L1: {
          var2 = this.field_m;
          if (-1 != (var2 ^ -1)) {
            if ((var2 ^ -1) == -2) {
              if (50 < this.field_j) {
                this.field_m = -1;
                break L1;
              } else {
                break L1;
              }
            } else {
              if (4 != var2) {
                if (-3 != (var2 ^ -1)) {
                  if (3 != var2) {
                    if ((var2 ^ -1) == -6) {
                      if (50 >= this.field_j) {
                        break L1;
                      } else {
                        this.field_m = -1;
                        break L1;
                      }
                    } else {
                      if (var2 == 6) {
                        if ((this.field_j ^ -1) < -11) {
                          this.field_m = -1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (7 != var2) {
                          L2: {
                            if (-9 != (var2 ^ -1)) {
                              if (9 == var2) {
                                break L2;
                              } else {
                                break L1;
                              }
                            } else {
                              break L2;
                            }
                          }
                          L3: {
                            if ((this.field_j ^ -1) != -11) {
                              break L3;
                            } else {
                              this.field_l = 0.0;
                              this.field_k = 0.0;
                              break L3;
                            }
                          }
                          if ((this.field_j ^ -1) < -21) {
                            this.field_m = -1;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          L4: {
                            if (-21 <= (this.field_j ^ -1)) {
                              break L4;
                            } else {
                              this.field_m = -1;
                              break L4;
                            }
                          }
                          if (10 == this.field_j) {
                            this.field_k = 0.0;
                            this.field_l = 0.0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  if (this.field_j <= 50) {
                    break L1;
                  } else {
                    this.field_m = -1;
                    break L1;
                  }
                }
              } else {
                if (25 >= this.field_j) {
                  break L1;
                } else {
                  this.field_m = -1;
                  break L1;
                }
              }
            }
          } else {
            if ((this.field_j ^ -1) >= -21) {
              break L1;
            } else {
              this.field_m = -1;
              break L1;
            }
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var4 = 60 % ((71 - param1) / 51);
            var3 = 1;
            L1: while (true) {
              if (param0.length() <= var3) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("me.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7_int;
        double var7;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var6 = -106 % ((param2 - 12) / 60);
          var4 = (int)(320.0 + ((double)ol.field_e * this.field_o - (double)param0));
          var5 = (int)((double)ol.field_e * this.field_h - (double)param1 + 240.0);
          ol.field_e = 8;
          var7_int = this.field_m;
          if (var7_int == 0) {
            break L0;
          } else {
            if (-2 != (var7_int ^ -1)) {
              if ((var7_int ^ -1) != -5) {
                if (var7_int != 2) {
                  if ((var7_int ^ -1) == -4) {
                    break L0;
                  } else {
                    if (-6 == (var7_int ^ -1)) {
                      L1: {
                        var7 = (double)ol.field_e;
                        var9 = this.field_j * 1;
                        if (this.field_j < 25) {
                          break L1;
                        } else {
                          var9 = (-this.field_j + 50) / 2;
                          break L1;
                        }
                      }
                      ul.d((int)(-var7 + (double)var4), (int)((double)var5 - var7), (int)var7 * 2, 2 * (int)var7, 16711935, var9);
                      break L0;
                    } else {
                      if (6 != var7_int) {
                        if (var7_int != 7) {
                          if ((var7_int ^ -1) == -9) {
                            L2: {
                              var7 = (double)ol.field_e * 0.75;
                              var9 = 25 * this.field_j;
                              if ((this.field_j ^ -1) <= -11) {
                                var9 = -(this.field_j * 25) + 500;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                            ul.i(var4, var5, (int)var7, 65535, var9);
                            ul.i(var4, var5, (int)(var7 * 0.75), 6750207, var9);
                            ul.i(var4, var5, (int)(0.5 * var7), 16777215, var9);
                            break L0;
                          } else {
                            if (-10 == (var7_int ^ -1)) {
                              L3: {
                                var7 = (double)ol.field_e * 2.0;
                                var9 = 5 * this.field_j;
                                if (this.field_j >= 10) {
                                  var9 = (20 + -this.field_j) * 5;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              ul.i(var4, var5, (int)var7, 65535, var9);
                              ul.i(var4, var5, (int)(0.75 * var7), 6750207, var9);
                              ul.i(var4, var5, (int)(0.5 * var7), 16777215, var9);
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        } else {
                          L4: {
                            var7 = (double)ol.field_e * 0.5;
                            var9 = 25 * this.field_j;
                            if (-11 >= (this.field_j ^ -1)) {
                              var9 = -(this.field_j * 25) + 500;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ul.i(var4, var5, (int)var7, 8926122, var9);
                          ul.i(var4, var5, (int)(var7 * 0.75), 11176191, var9);
                          ul.i(var4, var5, (int)(0.5 * var7), 16777215, var9);
                          break L0;
                        }
                      } else {
                        L5: {
                          var7 = (double)ol.field_e * 0.5;
                          var9 = 50 * this.field_j;
                          if (5 <= this.field_j) {
                            var9 = (10 - this.field_j) * 10;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ul.i(var4, var5, (int)var7, 4456516, var9);
                        ul.i(var4, var5, (int)(0.75 * var7), 8913032, var9);
                        ul.i(var4, var5, (int)(0.5 * var7), 16711935, var9);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (this.field_j > 0) {
                    var7 = 0.1 * (double)ol.field_e;
                    var9 = 16777215 - this.field_j * 328192;
                    var10 = 255 - this.field_j * 5;
                    ul.i(var4, var5, (int)var7, var9, var10);
                    ul.i(var4, var5, (int)(-1.0 + var7), var9, var10);
                    break L0;
                  } else {
                    var7 = 0.1 * (double)ol.field_e;
                    var9 = 16777215;
                    var10 = 255;
                    ul.i(var4, var5, (int)var7, var9, var10);
                    ul.i(var4, var5, (int)(var7 - 1.0), var9, var10);
                    break L0;
                  }
                }
              } else {
                L6: {
                  var7 = (double)ol.field_e;
                  var9 = 16 * this.field_j / 25;
                  if (var9 < 16) {
                    break L6;
                  } else {
                    var9 = 15;
                    break L6;
                  }
                }
                gd.field_b[var9].e((int)((double)var4 - var7), (int)(-var7 + (double)var5), (int)(2.0 * var7), (int)(var7 * 2.0), 64);
                break L0;
              }
            } else {
              L7: {
                var7 = (double)(2 * ol.field_e);
                var9 = this.field_j * 16 / 50;
                if (var9 < 16) {
                  break L7;
                } else {
                  var9 = 15;
                  break L7;
                }
              }
              gd.field_b[var9].e((int)(-var7 + (double)var4), (int)((double)var5 - var7), (int)(2.0 * var7), (int)(2.0 * var7), 64);
              break L0;
            }
          }
        }
    }

    final static int b(byte param0) {
        if (param0 >= -4) {
            return -53;
        }
        return lc.field_q - ha.field_o;
    }

    final static void c(boolean param0) {
        bc.field_t = null;
        pj.field_o = null;
        pc.field_db = false;
        fd.field_e = null;
        sj.field_u = null;
        if (!param0) {
            field_i = (String) null;
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_f = null;
        if (param0 != 5) {
            field_i = (String) null;
        }
        field_g = null;
        field_n = null;
    }

    me(double param0, double param1, int param2) {
        this.field_k = 0.0;
        this.field_o = param0;
        this.field_m = param2;
        this.field_l = 0.0;
        this.field_h = param1;
    }

    me(double param0, double param1, double param2, double param3, int param4) {
        this.field_l = param2;
        this.field_k = param3;
        this.field_h = param1;
        this.field_m = param4;
        this.field_o = param0;
    }

    static {
        field_i = "Unpacking sound effects";
    }
}
