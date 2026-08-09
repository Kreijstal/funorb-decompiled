/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vv {
    private int field_i;
    private int field_h;
    phb[] field_b;
    phb field_e;
    private int field_g;
    private boolean field_d;
    private int field_f;
    static String field_a;
    static int field_c;
    private int field_j;

    final void a(byte param0, vv param1) {
        try {
            param1.field_b = this.field_b;
            param1.field_i = this.field_i;
            param1.field_h = this.field_h;
            param1.field_g = this.field_g;
            param1.field_j = this.field_j;
            param1.field_f = this.field_f;
            int var3_int = 52 / ((param0 - 30) / 45);
            param1.field_e = this.field_e;
            param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vv.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vv a(int param0, int param1) {
        int var3 = 107 / ((0 - param0) / 45);
        this.field_h = param1;
        return (vv) (this);
    }

    final void a(uea param0, boolean param1, int param2, shb param3, int param4) {
        no stackIn_21_0 = null;
        String stackIn_21_1 = null;
        no stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              abb.a(3, param3.field_f, param3.field_h, param4 - -param3.field_r, this.field_b, param2 - -param3.field_g);
              if (this.field_e != null) {
                L2: {
                  var6_int = this.field_h + (param2 - -param3.field_g);
                  if (-2 == (param0.field_c ^ -1)) {
                    var6_int = var6_int + (-this.field_e.field_m + param3.field_h) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_f + (param4 - -param3.field_r);
                  if (2 == param0.field_c) {
                    var6_int = var6_int + (-this.field_e.field_m + param3.field_h);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((param0.field_n ^ -1) == -2) {
                    var7 = var7 + (-this.field_e.field_n + param3.field_f) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_n != 2) {
                    break L5;
                  } else {
                    var7 = var7 + (param3.field_f - this.field_e.field_n);
                    break L5;
                  }
                }
                this.field_e.a(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param1) {
              L6: {
                var6 = param0.b((byte) -110, param3);
                if (var6 == null) {
                  break L6;
                } else {
                  if (null == param0.field_d) {
                    break L6;
                  } else {
                    if (-1 < (this.field_j ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_21_0 = param0.field_d;

                        stackIn_21_1 = (String) (var6);

                        if (2147483647 != (this.field_h ^ -1)) {
                          stackIn_22_0 = (no) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = this.field_h;
                          break L7;
                        } else {
                          stackIn_22_0 = (no) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = 0;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_24_2 = stackIn_22_2 + param0.field_f + (param2 + param3.field_g);

                        stackIn_24_3 = param4;

                        stackIn_24_4 = param3.field_r;

                        stackIn_24_5 = -param0.field_k;

                        if (-2147483648 != this.field_f) {
                          stackIn_22_0 = (no) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = this.field_f;
                          break L8;
                        } else {
                          stackIn_22_0 = (no) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = 0;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_27_3 = stackIn_25_3 + (stackIn_25_4 - (stackIn_25_5 + -stackIn_25_6));

                        stackIn_27_4 = param3.field_h + -param0.field_f - param0.field_o;

                        stackIn_27_5 = -param0.field_k + (param3.field_f - param0.field_m);

                        stackIn_27_6 = this.field_j;

                        stackIn_27_7 = this.field_g;

                        if (-2147483648 != this.field_i) {
                          stackIn_22_0 = (no) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_i;
                          break L9;
                        } else {
                          stackIn_22_0 = (no) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = 256;
                          break L9;
                        }
                      }
                      ((no) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param0.field_c, param0.field_n, param0.field_h);
                      break L6;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("vv.H(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 24358) {
            vv.b(-6);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final void a(vv param0, int param1, shb param2, int param3, int param4, uea param5) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param4 == -2879) {
                break L1;
              } else {
                this.field_f = 100;
                break L1;
              }
            }
            L2: {
              if (!this.field_d) {
                break L2;
              } else {
                param0.a(param5, false, param1, param2, param3);
                param0.a(param4 ^ -2887);
                break L2;
              }
            }
            L3: {
              if (2147483647 != (this.field_f ^ -1)) {
                param0.field_f = this.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 <= this.field_g) {
                param0.field_g = this.field_g;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-2147483648 != this.field_i) {
                param0.field_i = this.field_i;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == this.field_b) {
                break L6;
              } else {
                param0.field_b = this.field_b;
                break L6;
              }
            }
            L7: {
              if (null != this.field_e) {
                param0.field_e = this.field_e;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-2147483648 != this.field_h) {
                param0.field_h = this.field_h;
                break L8;
              } else {
                break L8;
              }
            }
            if (0 >= (this.field_j ^ -1)) {
              param0.field_j = this.field_j;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("vv.J(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_34_2 + ')');
        }
    }

    final vv b(int param0, int param1) {
        if (param1 != -2147483648) {
            this.field_b = (phb[]) null;
            this.field_j = param0;
            return (vv) (this);
        }
        this.field_j = param0;
        return (vv) (this);
    }

    final vv a(boolean param0, phb[] param1) {
        RuntimeException var3 = null;
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
              if (param0) {
                break L1;
              } else {
                this.a(77, 70);
                break L1;
              }
            }
            this.field_b = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vv.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (vv) (this);
    }

    final vv c(int param0, int param1) {
        this.field_g = param0;
        if (param1 != -2147483648) {
            this.b(-117, 101);
            return (vv) (this);
        }
        return (vv) (this);
    }

    final vv b(int param0, boolean param1) {
        shb var4;
        if (param1) {
          var4 = (shb) null;
          this.a((uea) null, false, 1, (shb) null, -23);
          this.field_f = param0;
          return (vv) (this);
        } else {
          this.field_f = param0;
          return (vv) (this);
        }
    }

    final vv a(int param0, boolean param1) {
        this.field_d = param1 ? true : false;
        if (param0 > -121) {
            return (vv) null;
        }
        return (vv) (this);
    }

    final void a(int param0) {
        this.field_g = -1;
        if (param0 != 120) {
          this.a(-14, 114);
          this.field_h = 0;
          this.field_f = 0;
          this.field_b = null;
          this.field_i = 256;
          this.field_e = null;
          this.field_j = 0;
          return;
        } else {
          this.field_h = 0;
          this.field_f = 0;
          this.field_b = null;
          this.field_i = 256;
          this.field_e = null;
          this.field_j = 0;
          return;
        }
    }

    vv() {
        this.field_b = null;
        this.field_g = -2;
        this.field_d = false;
        this.field_i = -2147483648;
        this.field_f = -2147483648;
        this.field_e = null;
        this.field_h = -2147483648;
        this.field_j = -2;
    }

    static {
        field_a = "Only show lobby chat from my friends";
        field_c = 120;
    }
}
