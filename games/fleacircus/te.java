/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private boolean field_b;
    dd field_c;
    static String field_i;
    private int field_f;
    private int field_h;
    private int field_a;
    private int field_e;
    dd[] field_g;
    private int field_d;

    final void a(int param0) {
        this.field_e = -1;
        this.field_d = 0;
        this.field_a = 0;
        this.field_f = 256;
        this.field_h = param0;
        this.field_c = null;
        this.field_g = null;
    }

    final te c(int param0, int param1) {
        this.field_a = param1;
        if (param0 < 103) {
            this.field_c = (dd) null;
            return (te) (this);
        }
        return (te) (this);
    }

    final te a(int param0, int param1) {
        this.field_e = param0;
        if (param1 < 111) {
            field_i = (String) null;
            return (te) (this);
        }
        return (te) (this);
    }

    final te a(int param0, byte param1) {
        if (param1 != -75) {
            return (te) null;
        }
        this.field_d = param0;
        return (te) (this);
    }

    final void a(hb param0, qa param1, int param2, int param3, int param4) {
        fa stackIn_21_0 = null;
        String stackIn_21_1 = null;
        fa stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
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
              og.a(param1.field_z + param3, this.field_g, -113, param4 + param1.field_y, param1.field_j, param1.field_u);
              if (this.field_c != null) {
                L2: {
                  var6_int = param4 - -param1.field_y - -this.field_h;
                  var7 = this.field_a + (param1.field_z + param3);
                  if (1 == param0.field_i) {
                    var6_int = var6_int + (-this.field_c.field_x + param1.field_u) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-2 == (param0.field_h ^ -1)) {
                    var7 = var7 + (-this.field_c.field_r + param1.field_j) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_i != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param1.field_u - this.field_c.field_x);
                    break L4;
                  }
                }
                L5: {
                  if (2 != param0.field_h) {
                    break L5;
                  } else {
                    var7 = var7 + (param1.field_j + -this.field_c.field_r);
                    break L5;
                  }
                }
                this.field_c.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            var6 = param0.c(35, param1);
            if (param2 == 0) {
              L6: {
                if (var6 == null) {
                  break L6;
                } else {
                  if (param0.field_j == null) {
                    break L6;
                  } else {
                    if (-1 >= (this.field_d ^ -1)) {
                      L7: {
                        stackIn_21_0 = param0.field_j;

                        stackIn_21_1 = (String) (var6);

                        if (2147483647 != (this.field_h ^ -1)) {
                          stackIn_22_0 = (fa) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = this.field_h;
                          break L7;
                        } else {
                          stackIn_22_0 = (fa) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = 0;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_24_2 = stackIn_22_2 + param0.field_n + (param4 + param1.field_y);

                        stackIn_24_3 = param3 + param1.field_z;

                        stackIn_24_4 = param0.field_m;

                        if (-2147483648 == this.field_a) {
                          stackIn_22_0 = (fa) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = 0;
                          break L8;
                        } else {
                          stackIn_22_0 = (fa) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = this.field_a;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_27_3 = stackIn_25_3 + (stackIn_25_4 + stackIn_25_5);

                        stackIn_27_4 = -param0.field_o + (-param0.field_n + param1.field_u);

                        stackIn_27_5 = -param0.field_k + -param0.field_m + param1.field_j;

                        stackIn_27_6 = this.field_d;

                        stackIn_27_7 = this.field_e;

                        if (2147483647 != (this.field_f ^ -1)) {
                          stackIn_22_0 = (fa) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_f;
                          break L9;
                        } else {
                          stackIn_22_0 = (fa) ((Object) stackIn_22_0);
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
                      ((fa) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param0.field_i, param0.field_h, param0.field_d);
                      break L6;
                    } else {
                      return;
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

            stackIn_32_1 = new StringBuilder().append("te.K(");

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


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final te a(boolean param0, dd[] param1) {
        RuntimeException var3 = null;
        te var4 = null;
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
                var4 = (te) null;
                this.a((te) null, 57);
                break L1;
              }
            }
            this.field_g = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("te.A(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (te) (this);
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            te.a(false);
        }
    }

    final void a(te param0, int param1, qa param2, hb param3, int param4, int param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_b) {
                param0.a(param3, param2, param5 + 2, param1, param4);
                param0.a(0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != this.field_c) {
                param0.field_c = this.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2147483648 == this.field_a) {
                break L3;
              } else {
                param0.field_a = this.field_a;
                break L3;
              }
            }
            L4: {
              if ((this.field_d ^ -1) > 0) {
                break L4;
              } else {
                param0.field_d = this.field_d;
                break L4;
              }
            }
            L5: {
              if ((this.field_e ^ -1) <= 0) {
                param0.field_e = this.field_e;
                break L5;
              } else {
                break L5;
              }
            }
            if (param5 == -2) {
              L6: {
                if (2147483647 == (this.field_h ^ -1)) {
                  break L6;
                } else {
                  param0.field_h = this.field_h;
                  break L6;
                }
              }
              L7: {
                if (this.field_g == null) {
                  break L7;
                } else {
                  param0.field_g = this.field_g;
                  break L7;
                }
              }
              if (-2147483648 != this.field_f) {
                param0.field_f = this.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("te.D(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final te a(boolean param0, byte param1) {
        this.field_b = param0 ? true : false;
        if (param1 > -101) {
            this.field_d = 76;
            return (te) (this);
        }
        return (te) (this);
    }

    final static void b(int param0, int param1) {
        fb.b(param0 ^ -92);
        if (param0 != 0) {
            field_i = (String) null;
        }
    }

    final te a(boolean param0, int param1) {
        if (!param0) {
            this.field_e = 73;
            this.field_h = param1;
            return (te) (this);
        }
        this.field_h = param1;
        return (te) (this);
    }

    final void a(te param0, int param1) {
        try {
            param0.field_e = this.field_e;
            param0.field_h = this.field_h;
            param0.field_a = this.field_a;
            param0.field_b = this.field_b;
            param0.field_f = this.field_f;
            if (param1 <= 22) {
                this.a(-120);
            }
            param0.field_g = this.field_g;
            param0.field_c = this.field_c;
            param0.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "te.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    te() {
        this.field_c = null;
        this.field_f = -2147483648;
        this.field_e = -2;
        this.field_a = -2147483648;
        this.field_h = -2147483648;
        this.field_b = false;
        this.field_g = null;
        this.field_d = -2;
    }

    static {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
