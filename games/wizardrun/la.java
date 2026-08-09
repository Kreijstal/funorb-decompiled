/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_e;
    o[] field_j;
    static long field_g;
    private int field_a;
    private int field_c;
    static boolean field_d;
    private boolean field_b;
    o field_i;
    private int field_h;
    private int field_f;

    final la a(int param0, boolean param1) {
        int var3 = 23 / ((param0 - 58) / 49);
        this.field_b = param1 ? true : false;
        return (la) (this);
    }

    final la b(byte param0, int param1) {
        this.field_e = param1;
        if (param0 >= -121) {
            this.a(116, 12);
            return (la) (this);
        }
        return (la) (this);
    }

    final la a(int param0, byte param1) {
        if (param1 != 105) {
            return (la) null;
        }
        this.field_a = param0;
        return (la) (this);
    }

    final la a(int param0, int param1) {
        this.field_f = param1;
        int var3 = -10 / ((param0 - 54) / 43);
        return (la) (this);
    }

    final la a(byte param0, int param1) {
        this.field_h = param1;
        if (param0 >= -83) {
            return (la) null;
        }
        return (la) (this);
    }

    final la a(int param0, o[] param1) {
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
              if (param0 >= 55) {
                break L1;
              } else {
                this.a((byte) -5, -10);
                break L1;
              }
            }
            this.field_j = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("la.B(").append(param0).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (la) (this);
    }

    final void a(int param0) {
        this.field_j = null;
        this.field_f = 0;
        this.field_i = null;
        this.field_h = 0;
        this.field_e = param0;
        this.field_a = -1;
        this.field_c = 256;
    }

    final void a(la param0, byte param1) {
        try {
            param0.field_c = this.field_c;
            param0.field_f = this.field_f;
            param0.field_a = this.field_a;
            param0.field_h = this.field_h;
            if (param1 >= -2) {
                o[] var4 = (o[]) null;
                this.a(-37, (o[]) null);
            }
            param0.field_i = this.field_i;
            param0.field_b = this.field_b;
            param0.field_j = this.field_j;
            param0.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "la.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ub param0, boolean param1, int param2, qa param3, int param4) {
        vd stackIn_20_0 = null;
        String stackIn_20_1 = null;
        vd stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
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
        qa var8 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var8 = (qa) null;
                this.a(41, 36, -40, (ub) null, (la) null, (qa) null);
                break L1;
              }
            }
            L2: {
              ig.a(this.field_j, param4 - -param0.field_o, (byte) -110, param0.field_n, param0.field_r, param2 + param0.field_l);
              if (this.field_i != null) {
                L3: {
                  var6_int = this.field_h + (param4 + param0.field_o);
                  if (-2 == (param3.field_l ^ -1)) {
                    var6_int = var6_int + (-this.field_i.field_x + param0.field_r) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var7 = param2 + (param0.field_l + this.field_e);
                  if (-3 != (param3.field_l ^ -1)) {
                    break L4;
                  } else {
                    var6_int = var6_int + (-this.field_i.field_x + param0.field_r);
                    break L4;
                  }
                }
                L5: {
                  if ((param3.field_a ^ -1) == -2) {
                    var7 = var7 + (-this.field_i.field_s + param0.field_n) / 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-3 != (param3.field_a ^ -1)) {
                    break L6;
                  } else {
                    var7 = var7 + (-this.field_i.field_s + param0.field_n);
                    break L6;
                  }
                }
                this.field_i.e(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6 = param3.b(param0, (byte) -57);
              if (var6 == null) {
                break L7;
              } else {
                if (param3.field_k == null) {
                  break L7;
                } else {
                  if ((this.field_f ^ -1) > -1) {
                    break L7;
                  } else {
                    L8: {
                      stackIn_20_0 = param3.field_k;

                      stackIn_20_1 = (String) (var6);

                      if (this.field_h != -2147483648) {
                        stackIn_21_0 = (vd) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = this.field_h;
                        break L8;
                      } else {
                        stackIn_21_0 = (vd) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = 0;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_23_2 = stackIn_21_2 + param3.field_n + (param4 + param0.field_o);

                      if ((this.field_e ^ -1) != 2147483647) {
                        stackIn_21_0 = (vd) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = this.field_e;
                        break L9;
                      } else {
                        stackIn_21_0 = (vd) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_26_3 = stackIn_24_3 + (param3.field_b + (param0.field_l + param2));

                      stackIn_26_4 = -param3.field_n + (param0.field_r - param3.field_h);

                      stackIn_26_5 = -param3.field_b + param0.field_n + -param3.field_j;

                      stackIn_26_6 = this.field_f;

                      stackIn_26_7 = this.field_a;

                      if (2147483647 != (this.field_c ^ -1)) {
                        stackIn_21_0 = (vd) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = this.field_c;
                        break L10;
                      } else {
                        stackIn_21_0 = (vd) ((Object) stackIn_21_0);
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
                    ((vd) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param3.field_l, param3.field_a, param3.field_d);
                    break L7;
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

            stackIn_31_1 = new StringBuilder().append("la.E(");

            if (param0 == null) {
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


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ub param3, la param4, qa param5) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_b) {
                break L1;
              } else {
                param4.a(param3, false, param0, param5, param2);
                param4.a(0);
                break L1;
              }
            }
            L2: {
              if (param1 >= 72) {
                break L2;
              } else {
                this.field_e = 76;
                break L2;
              }
            }
            L3: {
              if (this.field_i == null) {
                break L3;
              } else {
                param4.field_i = this.field_i;
                break L3;
              }
            }
            L4: {
              if (this.field_f < -1) {
                break L4;
              } else {
                param4.field_f = this.field_f;
                break L4;
              }
            }
            L5: {
              if (null != this.field_j) {
                param4.field_j = this.field_j;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_e == -2147483648) {
                break L6;
              } else {
                param4.field_e = this.field_e;
                break L6;
              }
            }
            L7: {
              if (0 >= (this.field_a ^ -1)) {
                param4.field_a = this.field_a;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((this.field_h ^ -1) != 2147483647) {
                param4.field_h = this.field_h;
                break L8;
              } else {
                break L8;
              }
            }
            if (this.field_c != -2147483648) {
              param4.field_c = this.field_c;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param4 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
    }

    la() {
        this.field_j = null;
        this.field_c = -2147483648;
        this.field_b = false;
        this.field_e = -2147483648;
        this.field_i = null;
        this.field_a = -2;
        this.field_h = -2147483648;
        this.field_f = -2;
    }

    static {
        field_d = true;
    }
}
