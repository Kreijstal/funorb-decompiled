/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    wk field_j;
    static boolean field_e;
    private int field_g;
    private int field_h;
    private int field_a;
    wk[] field_d;
    private int field_i;
    private boolean field_f;
    static wk[] field_c;
    private int field_b;

    final ip a(byte param0, int param1) {
        this.field_a = param1;
        if (param0 != 81) {
            field_e = true;
            return (ip) (this);
        }
        return (ip) (this);
    }

    final void a(kb param0, byte param1, int param2, int param3, ao param4) {
        ka stackIn_19_0;
        String stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        ka stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_26_8;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              i.a(this.field_d, param0.field_w, param0.field_B + param3, (byte) -47, param2 - -param0.field_p, param0.field_l);
              if (null == this.field_j) {
                break L1;
              } else {
                L2: {
                  var6_int = this.field_i + param0.field_B + param3;
                  if (1 == param4.field_n) {
                    var6_int = var6_int + (param0.field_l - this.field_j.field_A) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_a + (param2 - -param0.field_p);
                  if (-2 != (param4.field_k ^ -1)) {
                    break L3;
                  } else {
                    var7 = var7 + (-this.field_j.field_x + param0.field_w) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (param4.field_n != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param0.field_l - this.field_j.field_A);
                    break L4;
                  }
                }
                L5: {
                  if (param4.field_k != 2) {
                    break L5;
                  } else {
                    var7 = var7 + (param0.field_w - this.field_j.field_x);
                    break L5;
                  }
                }
                this.field_j.g(var6_int, var7);
                break L1;
              }
            }
            L6: {
              var6 = param4.d(0, param0);
              if (param1 >= 44) {
                break L6;
              } else {
                this.a(-101, 108);
                break L6;
              }
            }
            L7: {
              if (var6 == null) {
                break L7;
              } else {
                if (param4.field_q == null) {
                  break L7;
                } else {
                  if (0 <= this.field_b) {
                    L8: {
                      stackIn_19_0 = param4.field_q;

                      stackIn_19_1 = (String) (var6);

                      stackIn_19_2 = param4.field_i + param3;

                      stackIn_19_3 = param0.field_B;

                      if (-2147483648 != this.field_i) {
                        stackIn_20_0 = (ka) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) ((Object) stackIn_19_1);
                        stackIn_20_2 = stackIn_19_2;
                        stackIn_20_3 = stackIn_19_3;
                        stackIn_20_4 = this.field_i;
                        break L8;
                      } else {
                        stackIn_20_0 = (ka) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) ((Object) stackIn_19_1);
                        stackIn_20_2 = stackIn_19_2;
                        stackIn_20_3 = stackIn_19_3;
                        stackIn_20_4 = 0;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_22_2 = stackIn_20_2 + (stackIn_20_3 + stackIn_20_4);

                      if (2147483647 == (this.field_a ^ -1)) {
                        stackIn_20_0 = (ka) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = 0;
                        break L9;
                      } else {
                        stackIn_20_0 = (ka) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = this.field_a;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_25_3 = stackIn_23_3 + param4.field_g + (param2 - -param0.field_p);

                      stackIn_25_4 = -param4.field_t + -param4.field_i + param0.field_l;

                      stackIn_25_5 = -param4.field_g + param0.field_w + -param4.field_m;

                      stackIn_25_6 = this.field_b;

                      stackIn_25_7 = this.field_g;

                      if (-2147483648 == this.field_h) {
                        stackIn_20_0 = (ka) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);

                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = stackIn_25_5;
                        stackIn_26_6 = stackIn_25_6;
                        stackIn_26_7 = stackIn_25_7;
                        stackIn_26_8 = 256;
                        break L10;
                      } else {
                        stackIn_20_0 = (ka) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);

                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = stackIn_25_5;
                        stackIn_26_6 = stackIn_25_6;
                        stackIn_26_7 = stackIn_25_7;
                        stackIn_26_8 = this.field_h;
                        break L10;
                      }
                    }
                    ((ka) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param4.field_n, param4.field_k, param4.field_j);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var6_ref);

            stackIn_30_1 = new StringBuilder().append("ip.A(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
    }

    final void a(boolean param0, ip param1) {
        try {
            param1.field_d = this.field_d;
            param1.field_g = this.field_g;
            param1.field_a = this.field_a;
            param1.field_f = this.field_f;
            param1.field_j = this.field_j;
            param1.field_b = this.field_b;
            param1.field_h = this.field_h;
            if (param0) {
                this.field_d = (wk[]) null;
            }
            param1.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ip.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ip a(boolean param0, byte param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 < 53) {
          L0: {
            this.field_h = -125;
            stackIn_7_0 = this;

            if (!param0) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((ip) (this)).field_f = stackIn_8_1 != 0;
          return (ip) (this);
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((ip) (this)).field_f = stackIn_4_1 != 0;
          return (ip) (this);
        }
    }

    final ip a(int param0, int param1) {
        this.field_i = param0;
        if (param1 != 1) {
            this.field_d = (wk[]) null;
            return (ip) (this);
        }
        return (ip) (this);
    }

    final void a(int param0, ip param1, int param2, ao param3, int param4, kb param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ao var8 = null;
        try {
          L0: {
            L1: {
              if (!this.field_f) {
                break L1;
              } else {
                param1.a(param5, (byte) 53, param4, param2, param3);
                param1.a(false);
                break L1;
              }
            }
            L2: {
              if (-2147483648 == this.field_i) {
                break L2;
              } else {
                param1.field_i = this.field_i;
                break L2;
              }
            }
            L3: {
              if (null == this.field_j) {
                break L3;
              } else {
                param1.field_j = this.field_j;
                break L3;
              }
            }
            L4: {
              if (-1 <= this.field_b) {
                param1.field_b = this.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_g ^ -1) > 0) {
                break L5;
              } else {
                param1.field_g = this.field_g;
                break L5;
              }
            }
            L6: {
              if ((this.field_a ^ -1) == 2147483647) {
                break L6;
              } else {
                param1.field_a = this.field_a;
                break L6;
              }
            }
            L7: {
              if (2147483647 != (this.field_h ^ -1)) {
                param1.field_h = this.field_h;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_d != null) {
                param1.field_d = this.field_d;
                break L8;
              } else {
                break L8;
              }
            }
            if (param0 == -10265) {
              break L0;
            } else {
              var8 = (ao) null;
              this.a((kb) null, (byte) -95, -90, -1, (ao) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("ip.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
    }

    final ip b(int param0, int param1) {
        if (param1 < 121) {
            this.a(true, (byte) -5);
            this.field_g = param0;
            return (ip) (this);
        }
        this.field_g = param0;
        return (ip) (this);
    }

    final void a(boolean param0) {
        ao var3;
        this.field_h = 256;
        this.field_a = 0;
        if (param0) {
          var3 = (ao) null;
          this.a((kb) null, (byte) 78, -97, 60, (ao) null);
          this.field_g = -1;
          this.field_b = 0;
          this.field_d = null;
          this.field_i = 0;
          this.field_j = null;
          return;
        } else {
          this.field_g = -1;
          this.field_b = 0;
          this.field_d = null;
          this.field_i = 0;
          this.field_j = null;
          return;
        }
    }

    final ip a(wk[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -84 / ((param1 - -64) / 62);
            this.field_d = param0;
            stackIn_1_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ip.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return (ip) (this);
    }

    final static void a(int param0, int param1, byte param2) {
        of.field_Ib = param0;
        me.field_e = param1;
        if (param2 <= 77) {
            field_e = true;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, tu param4, wk[] param5, int param6, String param7, int param8) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        try {
          L0: {
            L1: {
              var9_int = param4.a(param7) + (param5[0].field_y << -1198538111);
              if (param1 <= -92) {
                break L1;
              } else {
                field_c = (wk[]) null;
                break L1;
              }
            }
            L2: {
              var10 = param6 + -(var9_int >> 1465652833);
              var11 = param6 - -(var9_int >> -695313151);
              if (-1 < (var10 ^ -1)) {
                param6 = param6 - var10;
                break L2;
              } else {
                if (var11 <= 640) {
                  break L2;
                } else {
                  param6 = param6 - (-640 + var11);
                  break L2;
                }
              }
            }
            jp.a(-(var9_int >> 347888929) + param6, param8, var9_int, param5, param3, -8991);
            param4.c(param7, param6, 2 + (param4.field_v + param8), param0, -1);
            if (param2) {
              re.a(param8, -(var9_int >> -673827519) + param6, -122, var9_int, param5, 128);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var9);

            stackIn_12_1 = new StringBuilder().append("ip.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ',' + param8 + ')');
        }
    }

    final ip a(int param0, byte param1) {
        this.field_b = param0;
        int var3 = -92 / ((param1 - -28) / 55);
        return (ip) (this);
    }

    public static void a(int param0) {
        int var1 = 72 % ((-33 - param0) / 60);
        field_c = null;
    }

    ip() {
        this.field_d = null;
        this.field_a = -2147483648;
        this.field_g = -2;
        this.field_j = null;
        this.field_i = -2147483648;
        this.field_f = false;
        this.field_h = -2147483648;
        this.field_b = -2;
    }

    static {
        field_e = false;
    }
}
