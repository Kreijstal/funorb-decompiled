/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    iu[] field_i;
    private int field_j;
    private int field_a;
    static nh[] field_b;
    private int field_d;
    iu field_c;
    private int field_l;
    static nh[] field_k;
    private boolean field_g;
    static String field_e;
    private int field_h;
    static jpa[] field_f;

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 != 46) {
            ng.a((byte) -11);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final void a(boolean param0) {
        this.field_c = null;
        this.field_j = 0;
        this.field_d = 0;
        this.field_i = null;
        this.field_a = 256;
        this.field_l = -1;
        this.field_h = 0;
        if (!param0) {
            field_f = (jpa[]) null;
        }
    }

    final ng b(int param0, int param1) {
        if (param1 != -2147483648) {
            this.b(119, -53);
            this.field_h = param0;
            return (ng) (this);
        }
        this.field_h = param0;
        return (ng) (this);
    }

    final ng c(int param0, int param1) {
        iu[] var4;
        if (param0 != -1) {
          var4 = (iu[]) null;
          this.a(-11, (iu[]) null);
          this.field_d = param1;
          return (ng) (this);
        } else {
          this.field_d = param1;
          return (ng) (this);
        }
    }

    final ng a(int param0, int param1) {
        this.field_j = param0;
        if (param1 != 1) {
            this.field_l = 50;
            return (ng) (this);
        }
        return (ng) (this);
    }

    final ng a(byte param0, int param1) {
        this.field_l = param1;
        if (param0 != 7) {
            this.a(50, false);
            return (ng) (this);
        }
        return (ng) (this);
    }

    final void a(int param0, int param1, vga param2, int param3, ae param4) {
        il stackIn_20_0;
        String stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        il stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              rsa.a(param4.field_p, this.field_i, param3 + param4.field_n, -118, param4.field_m, param1 - -param4.field_i);
              if (null != this.field_c) {
                L2: {
                  var6_int = param1 + (param4.field_i - -this.field_d);
                  if ((param2.field_l ^ -1) == -2) {
                    var6_int = var6_int + (param4.field_m - this.field_c.field_n) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_j + (param3 + param4.field_n);
                  if (1 != param2.field_a) {
                    break L3;
                  } else {
                    var7 = var7 + (-this.field_c.field_k + param4.field_p) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (-3 != (param2.field_l ^ -1)) {
                    break L4;
                  } else {
                    var6_int = var6_int + (-this.field_c.field_n + param4.field_m);
                    break L4;
                  }
                }
                L5: {
                  if ((param2.field_a ^ -1) != -3) {
                    break L5;
                  } else {
                    var7 = var7 + (param4.field_p - this.field_c.field_k);
                    break L5;
                  }
                }
                this.field_c.b(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param0 <= -31) {
                break L6;
              } else {
                field_b = (nh[]) null;
                break L6;
              }
            }
            L7: {
              var6 = param2.d(-4, param4);
              if (var6 == null) {
                break L7;
              } else {
                if (null == param2.field_e) {
                  break L7;
                } else {
                  if (this.field_h >= 0) {
                    L8: {
                      stackIn_20_0 = param2.field_e;

                      stackIn_20_1 = (String) (var6);

                      stackIn_20_2 = param2.field_h;

                      stackIn_20_3 = param4.field_i;

                      stackIn_20_4 = param1;

                      if (-2147483648 != this.field_d) {
                        stackIn_21_0 = (il) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = stackIn_20_3;
                        stackIn_21_4 = stackIn_20_4;
                        stackIn_21_5 = this.field_d;
                        break L8;
                      } else {
                        stackIn_21_0 = (il) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = stackIn_20_3;
                        stackIn_21_4 = stackIn_20_4;
                        stackIn_21_5 = 0;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_23_2 = stackIn_21_2 + (stackIn_21_3 + (stackIn_21_4 + stackIn_21_5));

                      if (-2147483648 != this.field_j) {
                        stackIn_21_0 = (il) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = this.field_j;
                        break L9;
                      } else {
                        stackIn_21_0 = (il) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_26_3 = stackIn_24_3 + (param2.field_g + param3 + param4.field_n);

                      stackIn_26_4 = param4.field_m - (param2.field_h + param2.field_c);

                      stackIn_26_5 = -param2.field_i + (param4.field_p - param2.field_g);

                      stackIn_26_6 = this.field_h;

                      stackIn_26_7 = this.field_l;

                      if (this.field_a != -2147483648) {
                        stackIn_21_0 = (il) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = this.field_a;
                        break L10;
                      } else {
                        stackIn_21_0 = (il) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = 256;
                        break L10;
                      }
                    }
                    ((il) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param2.field_l, param2.field_a, param2.field_f);
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
            stackIn_31_0 = (RuntimeException) (var6_ref);

            stackIn_31_1 = new StringBuilder().append("ng.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
    }

    final void a(vga param0, ae param1, int param2, int param3, int param4, ng param5) {
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
              if (!this.field_g) {
                break L1;
              } else {
                param5.a(-49, param4, param0, param3, param1);
                param5.a(true);
                break L1;
              }
            }
            L2: {
              if (null == this.field_i) {
                break L2;
              } else {
                param5.field_i = this.field_i;
                break L2;
              }
            }
            L3: {
              if (this.field_d != -2147483648) {
                param5.field_d = this.field_d;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((this.field_l ^ -1) > 0) {
                break L4;
              } else {
                param5.field_l = this.field_l;
                break L4;
              }
            }
            L5: {
              if ((this.field_a ^ -1) != 2147483647) {
                param5.field_a = this.field_a;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_h ^ -1) <= 0) {
                param5.field_h = this.field_h;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null != this.field_c) {
                param5.field_c = this.field_c;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param2 > 122) {
                break L8;
              } else {
                this.field_h = 119;
                break L8;
              }
            }
            if (2147483647 != (this.field_j ^ -1)) {
              param5.field_j = this.field_j;
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

            stackIn_26_1 = new StringBuilder().append("ng.G(");

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


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
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


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ')');
        }
    }

    final ng a(int param0, boolean param1) {
        ng var4;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != -2) {
          L0: {
            var4 = (ng) null;
            this.a((vga) null, (ae) null, 76, 31, 78, (ng) null);
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((ng) (this)).field_g = stackIn_8_1 != 0;
          return (ng) (this);
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((ng) (this)).field_g = stackIn_4_1 != 0;
          return (ng) (this);
        }
    }

    final ng a(int param0, iu[] param1) {
        RuntimeException var3 = null;
        ng stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_i = param1;
            if (param0 == 2) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ng) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ng.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ng) (this);
        }
    }

    final void a(boolean param0, ng param1) {
        param1.field_i = this.field_i;
        param1.field_c = this.field_c;
        param1.field_h = this.field_h;
        param1.field_g = this.field_g;
        param1.field_j = this.field_j;
        param1.field_d = this.field_d;
        if (!param0) {
            return;
        }
        try {
            param1.field_l = this.field_l;
            param1.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ng.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ng() {
        this.field_i = null;
        this.field_l = -2;
        this.field_c = null;
        this.field_a = -2147483648;
        this.field_g = false;
        this.field_j = -2147483648;
        this.field_h = -2;
        this.field_d = -2147483648;
    }

    static {
        field_e = "Restart Tomb";
    }
}
