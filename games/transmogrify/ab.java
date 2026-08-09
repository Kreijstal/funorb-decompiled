/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static qj field_c;
    private int field_g;
    ti field_d;
    ti[] field_i;
    private int field_h;
    private int field_f;
    private int field_b;
    private boolean field_k;
    private int field_e;
    static int field_j;
    static String field_a;

    final ab b(int param0, byte param1) {
        int var3 = 104 / ((param1 - -55) / 45);
        this.field_e = param0;
        return (ab) (this);
    }

    final void a(int param0, ab param1) {
        param1.field_k = this.field_k;
        param1.field_e = this.field_e;
        param1.field_d = this.field_d;
        param1.field_g = this.field_g;
        param1.field_f = this.field_f;
        param1.field_i = this.field_i;
        param1.field_h = this.field_h;
        if (param0 <= 68) {
            return;
        }
        try {
            param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ab.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ab a(ti[] param0, byte param1) {
        RuntimeException var3 = null;
        ab var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = param0;
              if (param1 == 32) {
                break L1;
              } else {
                var4 = (ab) null;
                this.a(86, (ab) null);
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ab.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ab) (this);
    }

    final ab a(int param0, int param1) {
        this.field_h = param1;
        if (param0 >= -53) {
            return (ab) null;
        }
        return (ab) (this);
    }

    final ab a(int param0, boolean param1) {
        if (param1) {
            return (ab) null;
        }
        this.field_b = param0;
        return (ab) (this);
    }

    final void a(byte param0, ki param1, int param2, qg param3, int param4) {
        kg stackIn_17_0 = null;
        String stackIn_17_1 = null;
        kg stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              dk.a(param3.field_h, this.field_i, -28018, param3.field_p + param4, param3.field_n + param2, param3.field_l);
              if (null != this.field_d) {
                L2: {
                  var6_int = this.field_f + param3.field_p + param4;
                  var7 = param2 - -param3.field_n - -this.field_b;
                  if (1 != param1.field_b) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_d.field_r + param3.field_l) / 2;
                    break L2;
                  }
                }
                L3: {
                  if ((param1.field_a ^ -1) != -2) {
                    break L3;
                  } else {
                    var7 = var7 + (param3.field_h - this.field_d.field_s) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_b != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param3.field_l + -this.field_d.field_r);
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param1.field_a ^ -1)) {
                    var7 = var7 + (param3.field_h - this.field_d.field_s);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_d.c(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6 = param1.c(param3, 82);
              var7 = -84 / ((-29 - param0) / 48);
              if (var6 == null) {
                break L6;
              } else {
                if (null == param1.field_i) {
                  break L6;
                } else {
                  if (this.field_h < 0) {
                    break L6;
                  } else {
                    L7: {
                      stackIn_17_0 = param1.field_i;

                      stackIn_17_1 = (String) (var6);

                      if (this.field_f == -2147483648) {
                        stackIn_18_0 = (kg) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) ((Object) stackIn_17_1);
                        stackIn_18_2 = 0;
                        break L7;
                      } else {
                        stackIn_18_0 = (kg) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) ((Object) stackIn_17_1);
                        stackIn_18_2 = this.field_f;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_20_2 = stackIn_18_2 + param3.field_p + (param4 + param1.field_h);

                      stackIn_20_3 = param1.field_c + param3.field_n + param2;

                      if ((this.field_b ^ -1) != 2147483647) {
                        stackIn_18_0 = (kg) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = stackIn_20_3;
                        stackIn_21_4 = this.field_b;
                        break L8;
                      } else {
                        stackIn_18_0 = (kg) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = stackIn_20_3;
                        stackIn_21_4 = 0;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_23_3 = stackIn_21_3 + stackIn_21_4;

                      stackIn_23_4 = param3.field_l + (-param1.field_h + -param1.field_k);

                      stackIn_23_5 = -param1.field_c + (param3.field_h + -param1.field_d);

                      stackIn_23_6 = this.field_h;

                      stackIn_23_7 = this.field_e;

                      if (2147483647 == (this.field_g ^ -1)) {
                        stackIn_18_0 = (kg) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);

                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = stackIn_23_6;
                        stackIn_24_7 = stackIn_23_7;
                        stackIn_24_8 = 256;
                        break L9;
                      } else {
                        stackIn_18_0 = (kg) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);

                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = stackIn_23_6;
                        stackIn_24_7 = stackIn_23_7;
                        stackIn_24_8 = this.field_g;
                        break L9;
                      }
                    }
                    ((kg) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, param1.field_b, param1.field_a, param1.field_e);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6_ref);

            stackIn_28_1 = new StringBuilder().append("ab.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0) {
        ab var3;
        this.field_h = 0;
        this.field_d = null;
        this.field_b = 0;
        this.field_i = null;
        this.field_g = 256;
        this.field_f = 0;
        if (param0 != 313) {
          var3 = (ab) null;
          this.a(85, (ab) null);
          this.field_e = -1;
          return;
        } else {
          this.field_e = -1;
          return;
        }
    }

    final ab a(boolean param0, int param1) {
        this.field_k = param0 ? true : false;
        if (param1 != 256) {
            return (ab) null;
        }
        return (ab) (this);
    }

    final void a(ki param0, byte param1, int param2, int param3, ab param4, qg param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_k) {
                param4.a((byte) 105, param0, param3, param5, param2);
                param4.a(313);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((this.field_b ^ -1) != 2147483647) {
                param4.field_b = this.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_f ^ -1) != 2147483647) {
                param4.field_f = this.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((this.field_g ^ -1) == 2147483647) {
                break L4;
              } else {
                param4.field_g = this.field_g;
                break L4;
              }
            }
            L5: {
              if (param1 < -42) {
                break L5;
              } else {
                this.a(false, 102);
                break L5;
              }
            }
            L6: {
              if (this.field_i != null) {
                param4.field_i = this.field_i;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null == this.field_d) {
                break L7;
              } else {
                param4.field_d = this.field_d;
                break L7;
              }
            }
            L8: {
              if ((this.field_h ^ -1) > 0) {
                break L8;
              } else {
                param4.field_h = this.field_h;
                break L8;
              }
            }
            if (this.field_e >= -1) {
              param4.field_e = this.field_e;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("ab.J(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param5 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -2147483648) {
            field_a = (String) null;
        }
    }

    final ab a(int param0, byte param1) {
        this.field_f = param0;
        int var3 = 22 / ((param1 - 36) / 50);
        return (ab) (this);
    }

    ab() {
        this.field_d = null;
        this.field_g = -2147483648;
        this.field_h = -2;
        this.field_k = false;
        this.field_b = -2147483648;
        this.field_f = -2147483648;
        this.field_i = null;
        this.field_e = -2;
    }

    static {
        field_c = new qj();
        field_a = "Click";
    }
}
