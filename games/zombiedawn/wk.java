/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    int field_c;
    private int field_q;
    private int field_s;
    private int field_t;
    private int field_j;
    private int field_m;
    private int field_b;
    private int field_k;
    private int field_l;
    float field_e;
    private int field_y;
    static vn field_o;
    private int field_p;
    int field_u;
    private int field_n;
    float field_g;
    private int field_x;
    int field_f;
    private float field_r;
    private int field_i;
    private int field_h;
    static String field_z;
    int field_v;
    private int field_w;
    private int field_a;
    boolean field_d;

    public static void a(int param0) {
        if (param0 < 6) {
            field_z = (String) null;
        }
        field_o = null;
        field_z = null;
    }

    final void a(byte param0) {
        int discarded$0 = 0;
        this.field_c = this.field_k;
        this.field_f = this.field_k;
        this.field_d = true;
        this.field_u = this.field_l;
        this.field_v = this.field_l;
        this.field_g = 1.0f;
        if (param0 >= -33) {
            discarded$0 = this.a(-48, true);
        }
        this.field_e = 0.0f;
        this.field_r = 0.004999999888241291f;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_n = (-(27 * param0) + (6 * param1 + param4 * -15 - -(param7 * 54))) / 18;
        if (param8 != 106) {
            this.field_m = -116;
        }
        this.field_x = (54 * param2 + (-15 * param3 - -(6 * param6) + -(27 * param5))) / 18;
        this.field_j = param1;
        this.field_m = (54 * param0 + (param1 * -15 - (-(param4 * 6) - -(param7 * 27)))) / 18;
        this.field_h = param6;
        this.field_l = param4;
        this.field_b = (param5 * 54 + (param3 * 6 + (param6 * -15 - param2 * 27))) / 18;
        this.field_k = param3;
    }

    final int a(int param0, boolean param1) {
        int discarded$0 = 0;
        if (param1) {
            discarded$0 = this.b(64, false);
        }
        return -bd.field_d + (param0 - -this.field_u);
    }

    final void c(int param0) {
        this.field_d = false;
        this.field_e = 1.0f;
        this.field_u = this.field_j;
        this.field_c = this.field_h;
        int var2 = 73 % ((-42 - param0) / 61);
    }

    final int b(int param0, boolean param1) {
        if (!param1) {
            return -101;
        }
        return this.field_c + param0 - nh.field_G;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 >= param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 > param0 + 1) {
                L1: {
                  if (param0 - -5 >= param1) {
                    break L1;
                  } else {
                    if (param6 != param5) {
                      var7_int = (param5 & param6 & 1) + ((param5 >> 282953857) + (param6 >> 1117036385));
                      var8 = param0;
                      var9 = param6;
                      var10 = param5;
                      var11 = param0;
                      L2: while (true) {
                        if (var11 >= param1) {
                          wk.a(param0, var8, param2, param3, param4, var9, param6);
                          wk.a(var8, param1, param2, 0, param4, param5, var10);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = qd.field_c[var11];
                            if (param4) {
                              stackOut_22_0 = dj.field_g[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = qp.field_b[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var7_int < var13) {
                              L5: {
                                qd.field_c[var11] = qd.field_c[var8];
                                if (var9 > var13) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              incrementValue$1 = var8;
                              var8++;
                              qd.field_c[incrementValue$1] = var12;
                              break L4;
                            } else {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param1;
                L6: while (true) {
                  if (param0 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param0;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = qd.field_c[var8];
                          var10 = qd.field_c[var8 + 1];
                          if (!fp.a(var9, param4, 0, var10)) {
                            break L8;
                          } else {
                            qd.field_c[var8] = var10;
                            qd.field_c[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var7), "wk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, byte param1) {
        if (param1 >= -58) {
            return -34;
        }
        return bd.field_d + (param0 + -this.field_u);
    }

    final int a(int param0, int param1) {
        if (param1 != 0) {
            this.field_x = 23;
        }
        return -this.field_c + param0 + nh.field_G;
    }

    final void a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4, boolean param5) {
        float var7_float = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          this.field_p = this.field_t - bd.field_d;
          if (param3 <= -41) {
            break L0;
          } else {
            field_z = (String) null;
            break L0;
          }
        }
        L1: {
          if (bo.field_i) {
            this.field_a = this.field_q - 240;
            this.field_w = 240;
            break L1;
          } else {
            this.field_a = -nh.field_G + this.field_q;
            if (nh.field_G <= this.field_a) {
              this.field_w = nh.field_G;
              break L1;
            } else {
              this.field_w = (this.field_a + nh.field_G) / 2;
              this.field_a = (this.field_a + nh.field_G) / 2;
              break L1;
            }
          }
        }
        L2: {
          if (this.field_p >= bd.field_d) {
            this.field_s = bd.field_d;
            break L2;
          } else {
            this.field_s = (bd.field_d + this.field_p) / 2;
            this.field_p = (bd.field_d + this.field_p) / 2;
            break L2;
          }
        }
        L3: {
          if (!this.field_d) {
            L4: {
              if (0.0f >= this.field_g) {
                break L4;
              } else {
                this.field_g = this.field_g - 0.07000000029802322f;
                break L4;
              }
            }
            L5: {
              if (0 >= this.field_i) {
                break L5;
              } else {
                this.field_i = this.field_i - 1;
                break L5;
              }
            }
            L6: {
              if (0 >= this.field_y) {
                break L6;
              } else {
                this.field_y = this.field_y - 1;
                break L6;
              }
            }
            L7: {
              if (this.field_i < 0) {
                this.field_i = this.field_i + 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((this.field_y ^ -1) <= -1) {
                break L8;
              } else {
                this.field_y = this.field_y + 1;
                break L8;
              }
            }
            L9: {
              if (param5) {
                stackOut_32_0 = 2;
                stackIn_33_0 = stackOut_32_0;
                break L9;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_33_0 * 8;
              if (param1) {
                this.field_y = -var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param0) {
                this.field_y = var7;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (!param4) {
                break L12;
              } else {
                this.field_i = var7;
                break L12;
              }
            }
            L13: {
              if (!param2) {
                break L13;
              } else {
                this.field_i = -var7;
                break L13;
              }
            }
            this.field_u = this.field_u + this.field_i;
            this.field_c = this.field_c + this.field_y;
            break L3;
          } else {
            L14: {
              if (0.00001 >= (double)this.field_r) {
                break L14;
              } else {
                if (this.field_e < 1.0f) {
                  L15: {
                    this.field_e = this.field_e + this.field_r;
                    if ((double)this.field_e > 0.87) {
                      this.field_r = (float)((double)this.field_r - 0.0001);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var7_float = this.field_e;
                  var8 = 1.0f - var7_float;
                  this.field_u = (int)((float)(this.field_m * 3) * var8 * var7_float * var7_float + (var8 * (var8 * (float)this.field_l) * var8 + var8 * ((float)(this.field_n * 3) * var8) * var7_float) + var7_float * (var7_float * (float)this.field_j * var7_float));
                  this.field_v = (int)((float)(this.field_m * 3) * var8 * var7_float * var7_float + (var8 * (var8 * (float)this.field_l) * var8 + var8 * ((float)(this.field_n * 3) * var8) * var7_float) + var7_float * (var7_float * (float)this.field_j * var7_float));
                  this.field_c = (int)(var8 * ((float)this.field_k * var8 * var8) + (float)(this.field_x * 3) * var8 * var8 * var7_float + var7_float * (var7_float * (var8 * (float)(this.field_b * 3))) + var7_float * (float)this.field_h * var7_float * var7_float);
                  this.field_f = (int)(var8 * ((float)this.field_k * var8 * var8) + (float)(this.field_x * 3) * var8 * var8 * var7_float + var7_float * (var7_float * (var8 * (float)(this.field_b * 3))) + var7_float * (float)this.field_h * var7_float * var7_float);
                  break L3;
                } else {
                  break L14;
                }
              }
            }
            this.field_d = false;
            break L3;
          }
        }
        this.b(-28216);
    }

    final void a(byte param0, int param1, int param2) {
        this.field_c = this.field_c - param2;
        this.field_u = this.field_u - param1;
        int var4 = 15 % ((-55 - param0) / 43);
        this.b(-28216);
    }

    private final void b(int param0) {
        if (!(this.field_u >= this.field_s)) {
            this.field_u = this.field_s;
        }
        if (param0 != -28216) {
            return;
        }
        if (this.field_w > this.field_c) {
            this.field_c = this.field_w;
        }
        if (this.field_a < this.field_c) {
            this.field_c = this.field_a;
        }
        if (!(this.field_u <= this.field_p)) {
            this.field_u = this.field_p;
        }
    }

    wk(int param0, int param1) {
        this.field_y = 0;
        this.field_i = 0;
        this.field_d = false;
        this.field_g = 0.0f;
        this.field_s = bd.field_d;
        this.field_t = param0;
        this.field_q = param1;
        this.field_p = -bd.field_d + this.field_t;
        int var3 = bo.field_i ? 240 : nh.field_G;
        this.field_w = -var3 + 240;
        this.field_a = this.field_q + -var3;
    }

    static {
        field_z = "Unfortunately we are unable to create an account for you at this time.";
    }
}
