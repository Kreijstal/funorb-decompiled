/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vcb extends oda implements oo {
    private htb field_A;
    private boolean field_G;
    private boolean field_y;
    private htb field_N;
    private int field_J;
    int field_K;
    private htb field_C;
    private int field_F;
    private int field_x;
    private boolean field_w;
    private int field_B;
    int field_L;
    private ef field_P;
    private int field_H;
    private htb field_D;
    static byte[][] field_E;
    static dja field_z;
    int field_M;
    private htb field_v;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 != 1) {
                break L1;
              } else {
                if (!this.field_y) {
                  break L1;
                } else {
                  L2: {
                    if (!this.field_G) {
                      break L2;
                    } else {
                      if (this.field_A == param3) {
                        this.a((byte) -17, -this.field_K + this.field_L);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!this.field_G) {
                      break L3;
                    } else {
                      if (this.field_v != param3) {
                        break L3;
                      } else {
                        this.a((byte) -17, this.field_K + this.field_L);
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (!this.field_w) {
                      break L4;
                    } else {
                      if (this.field_D == param3) {
                        this.a(-51, this.field_M - this.field_H);
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!this.field_w) {
                    break L1;
                  } else {
                    if (this.field_C != param3) {
                      break L1;
                    } else {
                      this.a(-23, this.field_M + this.field_H);
                      break L1;
                    }
                  }
                }
              }
            }
            L5: {
              if (param0 == 11) {
                break L5;
              } else {
                this.field_G = false;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("vcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (!(this.field_P.field_t instanceof htb)) {
                  break L2;
                } else {
                  if (!((htb) ((Object) this.field_P.field_t)).field_x) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-2 == (this.field_P.field_n ^ -1)) {
                L3: {
                  if (this.field_w) {
                    var5_int = this.field_M;
                    this.h((byte) 79);
                    if (var5_int == this.field_M) {
                      break L3;
                    } else {
                      if (this.field_l instanceof lt) {
                        ((lt) ((Object) this.field_l)).a((vcb) (this), this.field_M, this.field_M, true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    this.i((byte) -8);
                    break L3;
                  }
                }
                if (!this.field_G) {
                  this.e(param2 ^ -981);
                  break L1;
                } else {
                  var5_int = this.field_L;
                  this.g(127);
                  if (var5_int == this.field_L) {
                    break L1;
                  } else {
                    if (this.field_l instanceof lt) {
                      ((lt) ((Object) this.field_l)).a((vcb) (this), this.field_L, this.field_M, true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              L5: {
                if (!this.field_N.field_x) {
                  break L5;
                } else {
                  if (1 != this.field_N.field_z) {
                    break L5;
                  } else {
                    if (this.field_G) {
                      if (this.field_w) {
                        var5_int = -this.field_P.field_g + -(this.field_P.field_h >> 856790913) + (-param1 + kc.field_b) + -this.field_g;
                        var6 = uia.field_b + -param0 + (-this.field_r - (this.field_P.field_r + (this.field_P.field_f >> 171921409)));
                        if (Math.abs(var6) <= Math.abs(var5_int)) {
                          if ((var5_int ^ -1) >= -1) {
                            this.a(-116, this.field_M + -this.field_x);
                            break L4;
                          } else {
                            this.a(-15, this.field_x + this.field_M);
                            break L4;
                          }
                        } else {
                          if (0 < var6) {
                            this.a((byte) -17, this.field_L - -this.field_F);
                            break L4;
                          } else {
                            this.a((byte) -17, -this.field_F + this.field_L);
                            break L4;
                          }
                        }
                      } else {
                        if (uia.field_b <= param0 - (-this.field_P.field_r + -(this.field_P.field_f >> 870890145))) {
                          this.a((byte) -17, this.field_L - this.field_F);
                          break L4;
                        } else {
                          this.a((byte) -17, this.field_L - -this.field_F);
                          break L4;
                        }
                      }
                    } else {
                      if (!this.field_w) {
                        break L5;
                      } else {
                        if ((this.field_P.field_h >> -2115708159) + (this.field_P.field_g + param1) >= kc.field_b) {
                          this.a(107, -this.field_x + this.field_M);
                          break L4;
                        } else {
                          this.a(-102, this.field_M - -this.field_x);
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var5);

            stackIn_39_1 = new StringBuilder().append("vcb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L6;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 != 21944) {
            shb var5 = (shb) null;
            this.a(-20, -95, (shb) null, 'J');
        }
        if (param0 < param2) {
            var4 = this.field_N.field_h * param0 / param2;
            if (!(var4 >= this.field_J)) {
                var4 = this.field_J;
            }
            this.field_P.a(this.field_P.field_g, var4, this.field_P.field_f, 1, this.field_P.field_r);
            this.a((byte) -63, true);
        } else {
            this.field_P.a(this.field_P.field_g, this.field_N.field_h, this.field_P.field_f, param1 ^ 21945, this.field_P.field_r);
            this.a((byte) -110, false);
        }
        this.i((byte) -8);
    }

    final void c(int param0, int param1) {
        int var4;
        rn var5;
        L0: {
          var4 = VoidHunters.field_G;
          if ((param1 ^ -1) > -1) {
            this.field_L = 0;
            break L0;
          } else {
            if ((param1 ^ -1) < -65537) {
              this.field_L = 65536;
              break L0;
            } else {
              this.field_L = param1;
              break L0;
            }
          }
        }
        L1: {
          this.e(0);
          if (param0 == -3393) {
            break L1;
          } else {
            var5 = (rn) null;
            vcb.a(33, (llb) null, (llb) null, (llb) null, (rn) null);
            break L1;
          }
        }
    }

    private final void g(int param0) {
        int var2 = this.field_A == null ? this.field_N.field_r : this.field_A.field_f + this.field_A.field_r;
        int var3 = null != this.field_v ? -this.field_P.field_f + this.field_v.field_r : this.field_N.field_f + this.field_N.field_r - this.field_P.field_f;
        int var4 = 68 / ((9 - param0) / 59);
        this.c(-3393, var3 <= var2 ? 0 : (this.field_P.field_r + -var2 << 1407852400) / (var3 + -var2));
    }

    private final void a(int param0, int param1) {
        this.b(param1, 65536);
        int var3 = -73 % ((param0 - 35) / 49);
        if (!(!(this.field_l instanceof lt))) {
            ((lt) ((Object) this.field_l)).a(this.field_M, this.field_L, (vcb) (this), -125);
        }
    }

    private final void a(int param0, boolean param1) {
        htb stackIn_5_0 = null;
        htb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        htb stackIn_12_0 = null;
        htb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        htb stackIn_18_0 = null;
        htb stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        htb stackIn_23_0 = null;
        htb stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.h((byte) -20);
            break L0;
          }
        }
        L1: {
          L2: {
            stackIn_5_0 = this.field_N;

            if (param1) {
              break L2;
            } else {


              if (!this.field_w) {
                stackIn_7_0 = (htb) ((Object) stackIn_5_0);
                stackIn_7_1 = 0;
                break L1;
              } else {
                stackIn_5_0 = (htb) ((Object) stackIn_5_0);
                break L2;
              }
            }
          }
          stackIn_7_0 = (htb) ((Object) stackIn_5_0);
          stackIn_7_1 = 1;
          break L1;
        }
        L3: {
          stackIn_7_0.field_x = stackIn_7_1 != 0;
          if (this.field_P.field_t instanceof htb) {
            L4: {
              L5: {
                stackIn_12_0 = (htb) ((Object) this.field_P.field_t);

                if (param1) {
                  break L5;
                } else {


                  if (!this.field_w) {
                    stackIn_14_0 = (htb) ((Object) stackIn_12_0);
                    stackIn_14_1 = 0;
                    break L4;
                  } else {
                    stackIn_12_0 = (htb) ((Object) stackIn_12_0);
                    break L5;
                  }
                }
              }
              stackIn_14_0 = (htb) ((Object) stackIn_12_0);
              stackIn_14_1 = 1;
              break L4;
            }
            stackIn_14_0.field_x = stackIn_14_1 != 0;
            break L3;
          } else {
            break L3;
          }
        }
        L6: {
          if (this.field_A == null) {
            break L6;
          } else {
            L7: {
              stackIn_18_0 = this.field_A;

              if (!param1) {
                stackIn_19_0 = (htb) ((Object) stackIn_18_0);
                stackIn_19_1 = 0;
                break L7;
              } else {
                stackIn_19_0 = (htb) ((Object) stackIn_18_0);
                stackIn_19_1 = 1;
                break L7;
              }
            }
            stackIn_19_0.field_x = stackIn_19_1 != 0;
            break L6;
          }
        }
        L8: {
          if (null == this.field_v) {
            break L8;
          } else {
            L9: {
              stackIn_23_0 = this.field_v;

              if (!param1) {
                stackIn_24_0 = (htb) ((Object) stackIn_23_0);
                stackIn_24_1 = 0;
                break L9;
              } else {
                stackIn_24_0 = (htb) ((Object) stackIn_23_0);
                stackIn_24_1 = 1;
                break L9;
              }
            }
            stackIn_24_0.field_x = stackIn_24_1 != 0;
            break L8;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param0) {
            var4 = this.field_N.field_f * param0 / param1;
            if (!(this.field_B <= var4)) {
                var4 = this.field_B;
            }
            this.field_P.a(this.field_P.field_g, this.field_P.field_h, var4, 1, this.field_P.field_r);
            this.a(0, true);
        } else {
            this.field_P.a(this.field_P.field_g, this.field_P.field_h, this.field_N.field_f, 1, this.field_P.field_r);
            this.a(0, false);
        }
        this.e(0);
        if (param2 < 126) {
            rn var5 = (rn) null;
            vcb.a(-91, (llb) null, (llb) null, (llb) null, (rn) null);
        }
    }

    private final void h(byte param0) {
        if (param0 <= 49) {
            this.c(17, -59, -81);
        }
        int var2 = null != this.field_D ? this.field_D.field_g - -this.field_D.field_h : this.field_N.field_g;
        int var3 = this.field_C != null ? this.field_C.field_g - this.field_P.field_h : this.field_N.field_h + this.field_N.field_g + -this.field_P.field_h;
        this.b(var3 <= var2 ? 0 : (this.field_P.field_g + -var2 << 1306262288) / (var3 - var2), 65536);
    }

    vcb(int param0, int param1, int param2, int param3, wwa param4, wwa param5, wwa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ef dupTemp$0 = null;
        htb dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_F = 8192;
        this.field_x = 8192;
        this.field_B = 0;
        this.field_y = true;
        this.field_L = 32768;
        this.field_H = 1024;
        this.field_J = 0;
        this.field_K = 1024;
        this.field_M = 32768;
        try {
          L0: {
            L1: {
              this.field_u = new shb[6];
              dupTemp$0 = new ef(param0, param1, param7, param8, (wwa) null, (sba) null, new htb(0, 0, param7, param8, param6, (sba) null), false, false);
              this.field_P = dupTemp$0;
              this.field_u[0] = (shb) ((Object) dupTemp$0);
              dupTemp$1 = new htb(param0, param1, param7, param8, param5, (sba) null);
              this.field_N = dupTemp$1;
              this.field_u[1] = (shb) ((Object) dupTemp$1);
              stackIn_3_0 = this;

              if (!param11) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((vcb) (this)).field_w = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param12) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            ((vcb) (this)).field_G = stackIn_7_1 != 0;
            this.field_J = param9;
            this.field_B = param10;
            this.b(param13, 65536);
            this.c(-3393, param14);
            this.a(param0, param2, param3, 1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var16);

            stackIn_11_1 = new StringBuilder().append("vcb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    public static void j(byte param0) {
        if (param0 != -7) {
            field_E = (byte[][]) null;
        }
        field_E = (byte[][]) null;
        field_z = null;
    }

    private final int k(byte param0) {
        if (param0 != 110) {
            this.field_M = 17;
        }
        return (this.field_P.field_f << -699381232) / this.field_N.field_f;
    }

    private final void a(byte param0, boolean param1) {
        htb stackIn_3_0 = null;
        htb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        htb stackIn_11_0 = null;
        htb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        htb stackIn_17_0 = null;
        htb stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        htb stackIn_22_0 = null;
        htb stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        L0: {
          L1: {
            stackIn_3_0 = this.field_N;

            if (param1) {
              break L1;
            } else {


              if (!this.field_G) {
                stackIn_5_0 = (htb) ((Object) stackIn_3_0);
                stackIn_5_1 = 0;
                break L0;
              } else {
                stackIn_3_0 = (htb) ((Object) stackIn_3_0);
                break L1;
              }
            }
          }
          stackIn_5_0 = (htb) ((Object) stackIn_3_0);
          stackIn_5_1 = 1;
          break L0;
        }
        stackIn_5_0.field_x = stackIn_5_1 != 0;
        if (param0 <= -34) {
          L2: {
            if (!(this.field_P.field_t instanceof htb)) {
              break L2;
            } else {
              L3: {
                L4: {
                  stackIn_11_0 = (htb) ((Object) this.field_P.field_t);

                  if (param1) {
                    break L4;
                  } else {


                    if (!this.field_G) {
                      stackIn_13_0 = (htb) ((Object) stackIn_11_0);
                      stackIn_13_1 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = (htb) ((Object) stackIn_11_0);
                      break L4;
                    }
                  }
                }
                stackIn_13_0 = (htb) ((Object) stackIn_11_0);
                stackIn_13_1 = 1;
                break L3;
              }
              stackIn_13_0.field_x = stackIn_13_1 != 0;
              break L2;
            }
          }
          L5: {
            if (this.field_D == null) {
              break L5;
            } else {
              L6: {
                stackIn_17_0 = this.field_D;

                if (!param1) {
                  stackIn_18_0 = (htb) ((Object) stackIn_17_0);
                  stackIn_18_1 = 0;
                  break L6;
                } else {
                  stackIn_18_0 = (htb) ((Object) stackIn_17_0);
                  stackIn_18_1 = 1;
                  break L6;
                }
              }
              stackIn_18_0.field_x = stackIn_18_1 != 0;
              break L5;
            }
          }
          L7: {
            if (this.field_C == null) {
              break L7;
            } else {
              L8: {
                stackIn_22_0 = this.field_C;

                if (!param1) {
                  stackIn_23_0 = (htb) ((Object) stackIn_22_0);
                  stackIn_23_1 = 0;
                  break L8;
                } else {
                  stackIn_23_0 = (htb) ((Object) stackIn_22_0);
                  stackIn_23_1 = 1;
                  break L8;
                }
              }
              stackIn_23_0.field_x = stackIn_23_1 != 0;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void e(int param0) {
        int var2 = null == this.field_A ? this.field_N.field_r : this.field_A.field_f + this.field_A.field_r;
        int var3 = null == this.field_v ? this.field_N.field_r + (this.field_N.field_f - this.field_P.field_f) : this.field_v.field_r - this.field_P.field_f;
        this.field_P.field_r = (this.field_L * (-var2 + var3) >> -540725264) + var2;
        if (param0 != 0) {
            vcb.f(-79);
        }
    }

    private final void i(byte param0) {
        if (param0 != -8) {
            this.d(116);
        }
        int var2 = null == this.field_D ? this.field_N.field_g : this.field_D.field_h + this.field_D.field_g;
        int var3 = null != this.field_C ? -this.field_P.field_h + this.field_C.field_g : this.field_N.field_h + (this.field_N.field_g + -this.field_P.field_h);
        this.field_P.field_g = ((var3 + -var2) * this.field_M >> -393002192) + var2;
    }

    final static tjb a(int param0, llb param1, llb param2, llb param3, rn param4) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        tjb stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        tjb[] var11 = null;
        int var12 = 0;
        rn var13_ref_rn = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pi var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param4.field_l != null) {
                  stackIn_7_0 = param4.field_l.length;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null == param4.field_n) {
                  stackIn_10_0 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = param4.field_n.length;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int + var6;
                var8 = new String[var7];
                if (param0 == 0) {
                  break L3;
                } else {
                  vcb.j((byte) 98);
                  break L3;
                }
              }
              L4: {
                var21 = new char[var7];
                var19 = var21;
                var9 = var19;
                var20 = new int[var7];
                var18 = var20;
                var10 = var18;
                var11 = new tjb[var7];
                if (null == param4.field_l) {
                  break L4;
                } else {
                  var12 = 0;
                  L5: while (true) {
                    if (var12 >= param4.field_l.length) {
                      break L4;
                    } else {
                      var13_ref_rn = lnb.field_i.a((byte) -72, param4.field_l[var12]);
                      var8[var12] = var13_ref_rn.field_p;
                      var9[var12] = param4.field_q[var12];
                      var11[var12] = vcb.a(0, param1, param2, param3, var13_ref_rn);
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param4.field_n != null) {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (var14 >= param4.field_n.length) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param4.field_n[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = cu.field_p;
                          var9[var14 + var12] = param4.field_m[var14];
                          var10[var12 - -var14] = param4.field_n[var14];
                          break L8;
                        } else {
                          L9: {
                            var16 = usa.field_o.a(var15, -118);
                            var8[var14 + var12] = var16.a(80);
                            var9[var14 + var12] = param4.field_m[var14];
                            if (var9[var12 - -var14] > 0) {
                              break L9;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L9;
                            }
                          }
                          var10[var14 + var12] = param4.field_n[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
              stackIn_27_0 = new tjb(0L, param1, param2, param3, var11, var20, var8, var21);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("vcb.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tjb) ((Object) stackIn_3_0);
        } else {
          return stackIn_27_0;
        }
    }

    final void d(int param0) {
        int var3;
        L0: {
          var3 = VoidHunters.field_G;
          if (null != this.field_D) {
            this.field_D.field_g = 0;
            this.field_D.field_r = this.field_f - this.field_D.field_f >> -1547859519;
            this.field_N.field_g = this.field_D.field_g - -this.field_D.field_h;
            break L0;
          } else {
            this.field_N.field_g = 0;
            break L0;
          }
        }
        L1: {
          if (this.field_C != null) {
            this.field_C.field_g = this.field_h + -this.field_C.field_h;
            this.field_C.field_r = this.field_f + -this.field_C.field_f >> -535328607;
            this.field_N.field_h = this.field_h + (-this.field_N.field_g - this.field_C.field_h);
            break L1;
          } else {
            this.field_N.field_h = -this.field_N.field_g + this.field_h;
            break L1;
          }
        }
        L2: {
          this.i((byte) -8);
          if (this.field_A == null) {
            this.field_N.field_r = 0;
            break L2;
          } else {
            this.field_A.field_r = 0;
            this.field_A.field_g = this.field_h - this.field_A.field_h >> -1143110175;
            this.field_N.field_r = this.field_A.field_r + this.field_A.field_f;
            break L2;
          }
        }
        L3: {
          if (this.field_v != null) {
            this.field_v.field_r = this.field_f + -this.field_v.field_f;
            this.field_v.field_g = -this.field_v.field_h + this.field_h >> 33400769;
            this.field_N.field_f = -this.field_N.field_r + (this.field_f + -this.field_v.field_f);
            break L3;
          } else {
            this.field_N.field_f = this.field_f + -this.field_N.field_r;
            break L3;
          }
        }
        L4: {
          this.e(param0 ^ param0);
          if (this.field_G) {
            break L4;
          } else {
            this.field_P.field_f = this.field_N.field_f;
            this.field_P.field_r = 0;
            break L4;
          }
        }
        L5: {
          if (this.field_w) {
            break L5;
          } else {
            this.field_P.field_h = this.field_N.field_h;
            this.field_P.field_g = 0;
            break L5;
          }
        }
        this.field_P.a(false);
    }

    final boolean a(int param0, shb param1) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_L = -9;
                break L1;
              }
            }
            L2: {
              var3 = this.field_P;
              if (var3 == null) {
                break L2;
              } else {
                if (!((shb) ((Object) var3)).a(param0 ^ 0, param1)) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("vcb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void b(int param0, int param1) {
        int var4;
        L0: {
          var4 = VoidHunters.field_G;
          if (-1 < (param0 ^ -1)) {
            this.field_M = 0;
            break L0;
          } else {
            if (param0 <= 65536) {
              this.field_M = param0;
              break L0;
            } else {
              this.field_M = 65536;
              break L0;
            }
          }
        }
        if (param1 == 65536) {
          this.i((byte) -8);
          return;
        } else {
          return;
        }
    }

    final static void f(int param0) {
        int var1 = 0;
        if (param0 != 32) {
            vcb.j((byte) -101);
        }
        if ((hlb.field_p ^ -1) > -225) {
            var1 = hlb.field_p % 32;
            re.a(-var1 + hlb.field_p - -32, (byte) -100);
        } else {
            re.a(256, (byte) -126);
        }
    }

    private final void a(byte param0, int param1) {
        this.c(-3393, param1);
        if (this.field_l instanceof lt) {
            ((lt) ((Object) this.field_l)).a(this.field_L, this.field_L, (vcb) (this), param0 ^ 106);
        }
        if (param0 != -17) {
            this.i((byte) 62);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (!this.field_y) {
                  break L1;
                } else {
                  if (!this.field_P.e((byte) -120)) {
                    break L1;
                  } else {
                    if (98 == param1) {
                      this.a((byte) -17, this.field_L - this.field_K);
                      stackIn_39_0 = 1;
                      decompiledRegionSelector0 = 10;
                      break L0;
                    } else {
                      if ((param1 ^ -1) != -100) {
                        if (96 != param1) {
                          if (param1 != 97) {
                            if ((param1 ^ -1) != -105) {
                              if (-106 != (param1 ^ -1)) {
                                if (102 == param1) {
                                  L2: {
                                    if (!this.field_G) {
                                      break L2;
                                    } else {
                                      if (!si.field_o[82]) {
                                        break L2;
                                      } else {
                                        this.a((byte) -17, 0);
                                        stackIn_33_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (this.field_w) {
                                    this.a(-119, 0);
                                    stackIn_37_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    return false;
                                  }
                                } else {
                                  if (103 != param1) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!this.field_G) {
                                        break L3;
                                      } else {
                                        if (!si.field_o[82]) {
                                          break L3;
                                        } else {
                                          this.a((byte) -17, 65536);
                                          stackIn_26_0 = 1;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!this.field_w) {
                                      break L1;
                                    } else {
                                      this.a(param0 + 15790, 65536);
                                      stackIn_29_0 = 1;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                this.a((byte) -17, this.field_L + this.k((byte) 110));
                                stackIn_20_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              this.a((byte) -17, this.field_L - this.k((byte) 110));
                              stackIn_17_0 = 1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            this.a(116, this.field_M - -this.field_H);
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          this.a(param0 + 15923, this.field_M + -this.field_H);
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        this.a((byte) -17, this.field_K + this.field_L);
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackIn_41_0 = 0;
              decompiledRegionSelector0 = 11;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var5);

            stackIn_44_1 = new StringBuilder().append("vcb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L4;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_33_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_37_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_39_0 != 0;
                            } else {
                              return stackIn_41_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_E = new byte[250][];
        field_z = (dja) ((Object) new ej());
    }
}
