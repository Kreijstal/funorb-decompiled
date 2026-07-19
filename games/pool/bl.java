/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    boolean field_c;
    int field_E;
    private int field_m;
    private int field_h;
    private int field_i;
    private int field_f;
    private int field_u;
    static int[] field_r;
    private int field_D;
    private int field_z;
    private int field_F;
    private int field_k;
    static int field_s;
    private int field_p;
    private int field_d;
    private int field_b;
    int field_y;
    private int field_G;
    private int field_n;
    private int field_q;
    static String field_j;
    private int field_C;
    private int field_a;
    private int field_o;
    private int field_l;
    static int field_g;
    static String field_v;
    private int field_I;
    static String field_e;
    private int field_w;
    private int field_A;
    static String field_t;
    private int field_B;
    private int field_J;
    static boolean field_x;

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              var4 = this.field_i + -param1[1];
              var3_int = this.field_b + -param1[0];
              var5 = -param1[2] + this.field_u;
              this.field_B = var4 * param1[10] + (var3_int * param1[9] + param1[11] * var5) >> -1627368720;
              if (this.field_B != 0) {
                break L1;
              } else {
                this.field_B = -1;
                break L1;
              }
            }
            if (-1 > (this.field_B ^ -1)) {
              L2: {
                this.field_o = 320 - -((param1[5] * var5 + (param1[3] * var3_int + param1[4] * var4) >> -146015513) / this.field_B);
                this.field_l = (var5 * param1[8] + (param1[6] * var3_int + param1[7] * var4) >> -1794877753) / this.field_B + 240;
                var4 = this.field_F - param1[1];
                var5 = this.field_k - param1[2];
                var3_int = this.field_J + -param1[0];
                this.field_d = var4 * param1[10] + var3_int * param1[9] - -(param1[11] * var5) >> 668293520;
                if (0 == this.field_d) {
                  this.field_d = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (-1 > (this.field_d ^ -1)) {
                this.field_C = 320 + (var3_int * param1[3] + (var4 * param1[4] - -(var5 * param1[5])) >> -2108352345) / this.field_d;
                this.field_a = 240 - -((var3_int * param1[6] - -(param1[7] * var4) + param1[8] * var5 >> -1294252825) / this.field_d);
                var3_int = -param1[0] + this.field_z;
                var4 = this.field_D - param1[1];
                var5 = -param1[2] + this.field_h;
                this.field_f = param1[11] * var5 + (var4 * param1[10] + param1[9] * var3_int) >> 14019312;
                if (param0 <= -34) {
                  L3: {
                    if (0 == this.field_f) {
                      this.field_f = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (this.field_f <= 0) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    this.field_q = 240 - -((param1[7] * var4 + param1[6] * var3_int + param1[8] * var5 >> -430226553) / this.field_f);
                    this.field_n = (param1[5] * var5 + (param1[4] * var4 + param1[3] * var3_int) >> 463248295) / this.field_f + 320;
                    L4: {
                      var5 = -param1[2] + this.field_A;
                      var4 = this.field_m - param1[1];
                      var3_int = -param1[0] + this.field_w;
                      this.field_G = var4 * param1[10] + (param1[9] * var3_int + param1[11] * var5) >> 1725088912;
                      if (0 != this.field_G) {
                        break L4;
                      } else {
                        this.field_G = -1;
                        break L4;
                      }
                    }
                    if (0 >= this.field_G) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      this.field_p = 240 - -((param1[8] * var5 + (param1[7] * var4 + var3_int * param1[6]) >> 1626259495) / this.field_G);
                      this.field_I = 320 + (var5 * param1[5] + var3_int * param1[3] - -(param1[4] * var4) >> -34667129) / this.field_G;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
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
          L5: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        L0: {
          var8 = Pool.field_O;
          if (0 >= this.field_B) {
            break L0;
          } else {
            if (-1 <= (this.field_d ^ -1)) {
              break L0;
            } else {
              if (0 >= this.field_f) {
                break L0;
              } else {
                if (-1 > (this.field_G ^ -1)) {
                  L1: {
                    L2: {
                      L3: {
                        if (this.field_o >= qh.field_b) {
                          break L3;
                        } else {
                          if (this.field_C >= qh.field_b) {
                            break L3;
                          } else {
                            if (this.field_n >= qh.field_b) {
                              break L3;
                            } else {
                              if (qh.field_b > this.field_I) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      if (this.field_o < qh.field_j) {
                        break L1;
                      } else {
                        if (this.field_C < qh.field_j) {
                          break L1;
                        } else {
                          if (this.field_n < qh.field_j) {
                            break L1;
                          } else {
                            if (this.field_I < qh.field_j) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    L4: {
                      L5: {
                        if (qh.field_c <= this.field_l) {
                          break L5;
                        } else {
                          if (this.field_a >= qh.field_c) {
                            break L5;
                          } else {
                            if (this.field_q >= qh.field_c) {
                              break L5;
                            } else {
                              if (this.field_p < qh.field_c) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      if (qh.field_g > this.field_l) {
                        break L1;
                      } else {
                        if (qh.field_g > this.field_a) {
                          break L1;
                        } else {
                          if (qh.field_g > this.field_q) {
                            break L1;
                          } else {
                            if (qh.field_g > this.field_p) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                  L6: {
                    if ((this.field_E ^ -1) >= -1) {
                      var2 = 3346790;
                      break L6;
                    } else {
                      if (this.field_E >= 256) {
                        var2 = 10044586;
                        break L6;
                      } else {
                        var2 = (this.field_E * 17408 + 1114112 + -(this.field_E * 4352)) / 256 & 65280 | 16711935 & (this.field_E * 10027178 + (-(this.field_E * 3342438) + 855664128)) / 256;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((this.field_y ^ -1) >= -1) {
                      break L7;
                    } else {
                      if (256 <= this.field_y) {
                        break L7;
                      } else {
                        var3 = (this.field_I + -this.field_o << -2004925183) * this.field_y / 256;
                        var4 = this.field_y * (this.field_p - this.field_l << 1874039873) / 256;
                        var5 = 3 * (this.field_I + -this.field_o) / 2 * this.field_y / 256;
                        var6 = this.field_y * ((-this.field_l + this.field_p) * 3 / 2) / 256;
                        var7 = (-this.field_y + 256 << -1235201816) / 256;
                        qh.b(-var3 + this.field_o, this.field_l - var4, this.field_C - var3, this.field_a + -var4, 10044586, var7);
                        qh.b(var3 + this.field_n, this.field_q - -var4, var3 + this.field_I, this.field_p - -var4, 10044586, var7);
                        qh.b(this.field_o - var3, -var4 + this.field_l, this.field_n + -var3, this.field_q - var4, 10044586, var7);
                        qh.b(var3 + this.field_C, var4 + this.field_a, var3 + this.field_I, var4 + this.field_p, 10044586, var7);
                        qh.b(this.field_o - var5, this.field_l + -var6, -var5 + this.field_C, -var6 + this.field_a, 10044586, var7);
                        qh.b(this.field_n + var5, var6 + this.field_q, var5 + this.field_I, var6 + this.field_p, 10044586, var7);
                        qh.b(this.field_o + -var5, -var6 + this.field_l, this.field_n + -var5, this.field_q + -var6, 10044586, var7);
                        qh.b(var5 + this.field_C, var6 + this.field_a, this.field_I - -var5, this.field_p - -var6, 10044586, var7);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    qh.d(this.field_o, this.field_l, this.field_C, this.field_a, var2);
                    qh.d(this.field_n, this.field_q, this.field_I, this.field_p, var2);
                    qh.d(this.field_o, this.field_l, this.field_n, this.field_q, var2);
                    qh.d(this.field_C, this.field_a, this.field_I, this.field_p, var2);
                    if (param0 == 67) {
                      break L8;
                    } else {
                      var9 = (int[]) null;
                      this.a(-121, (int[]) null);
                      break L8;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_v = null;
        if (param0 <= 116) {
            field_r = (int[]) null;
        }
        field_j = null;
        field_e = null;
        field_r = null;
        field_t = null;
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        this.field_m = param10;
        this.field_w = param9;
        this.field_u = param2;
        this.field_A = param11;
        this.field_F = param4;
        this.field_k = param5;
        this.field_D = param7;
        this.field_z = param6;
        this.field_i = param1;
        this.field_J = param3;
        this.field_h = param8;
        this.field_b = param0;
    }

    static {
        field_s = 0;
        field_j = "You and <%0> have resigned!";
        field_r = new int[]{2, 20, 21, 49, 5, 10, 11, 13};
        field_v = "Game options changed (<%0>)";
        field_g = 65536;
        field_t = "Please enter your date of birth to enable chat:";
        field_e = "Kick";
    }
}
