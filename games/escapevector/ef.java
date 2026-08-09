/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    ed field_g;
    private boolean field_j;
    static String[] field_c;
    private int field_f;
    private int field_e;
    ed[] field_i;
    static String field_k;
    static int field_d;
    private int field_a;
    private int field_b;
    private int field_h;

    final ef b(int param0, int param1) {
        if (param0 >= -47) {
            return (ef) null;
        }
        this.field_b = param1;
        return (ef) (this);
    }

    final ef a(int param0, byte param1) {
        this.field_f = param0;
        int var3 = 120 % ((param1 - -8) / 39);
        return (ef) (this);
    }

    final void a(int param0, ef param1) {
        try {
            param1.field_b = this.field_b;
            param1.field_a = this.field_a;
            param1.field_g = this.field_g;
            param1.field_j = this.field_j;
            param1.field_e = this.field_e;
            param1.field_h = this.field_h;
            param1.field_i = this.field_i;
            if (param0 != -2) {
                this.field_f = -16;
            }
            param1.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ef.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ef c(int param0, int param1) {
        this.field_h = param1;
        int var3 = -70 / ((param0 - 39) / 35);
        return (ef) (this);
    }

    final ef a(int param0, int param1) {
        this.field_a = param0;
        if (param1 != -22572) {
            this.b(-42, 116);
            return (ef) (this);
        }
        return (ef) (this);
    }

    final void a(int param0, ef param1, hm param2, int param3, int param4, he param5) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              var7_int = -58 / ((param4 - -32) / 47);
              if (this.field_j) {
                param1.a(param5, param2, param0, param3, (byte) 124);
                param1.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_a < -1) {
                break L2;
              } else {
                param1.field_a = this.field_a;
                break L2;
              }
            }
            L3: {
              if (null == this.field_g) {
                break L3;
              } else {
                param1.field_g = this.field_g;
                break L3;
              }
            }
            L4: {
              if (this.field_f == -2147483648) {
                break L4;
              } else {
                param1.field_f = this.field_f;
                break L4;
              }
            }
            L5: {
              if (this.field_h == -2147483648) {
                break L5;
              } else {
                param1.field_h = this.field_h;
                break L5;
              }
            }
            L6: {
              if (this.field_i == null) {
                break L6;
              } else {
                param1.field_i = this.field_i;
                break L6;
              }
            }
            L7: {
              if (0 < (this.field_b ^ -1)) {
                break L7;
              } else {
                param1.field_b = this.field_b;
                break L7;
              }
            }
            if (2147483647 == (this.field_e ^ -1)) {
              break L0;
            } else {
              param1.field_e = this.field_e;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var7);

            stackIn_20_1 = new StringBuilder().append("ef.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 <= 38) {
            return;
        }
        field_k = null;
    }

    final ef a(int param0, boolean param1) {
        this.field_j = param1 ? true : false;
        if (param0 > -100) {
            this.field_g = (ed) null;
            return (ef) (this);
        }
        return (ef) (this);
    }

    final void a(he param0, hm param1, int param2, int param3, byte param4) {
        wl stackIn_20_0 = null;
        String stackIn_20_1 = null;
        wl stackIn_21_0 = null;
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
        try {
          L0: {
            L1: {
              if (param4 >= 0) {
                break L1;
              } else {
                this.field_g = (ed) null;
                break L1;
              }
            }
            L2: {
              ld.a(param1.field_x, this.field_i, 4, param3 + param1.field_j, param2 - -param1.field_k, param1.field_g);
              if (null != this.field_g) {
                L3: {
                  var6_int = param2 - (-param1.field_k + -this.field_h);
                  if ((param0.field_m ^ -1) != -2) {
                    break L3;
                  } else {
                    var6_int = var6_int + (param1.field_g + -this.field_g.field_A) / 2;
                    break L3;
                  }
                }
                L4: {
                  var7 = this.field_f + param1.field_j + param3;
                  if ((param0.field_c ^ -1) == -2) {
                    var7 = var7 + (-this.field_g.field_z + param1.field_x) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((param0.field_m ^ -1) != -3) {
                    break L5;
                  } else {
                    var6_int = var6_int + (param1.field_g + -this.field_g.field_A);
                    break L5;
                  }
                }
                L6: {
                  if ((param0.field_c ^ -1) != -3) {
                    break L6;
                  } else {
                    var7 = var7 + (-this.field_g.field_z + param1.field_x);
                    break L6;
                  }
                }
                this.field_g.e(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6 = param0.b((byte) 39, param1);
              if (var6 == null) {
                break L7;
              } else {
                if (param0.field_l == null) {
                  break L7;
                } else {
                  if ((this.field_a ^ -1) <= -1) {
                    L8: {
                      stackIn_20_0 = param0.field_l;

                      stackIn_20_1 = (String) (var6);

                      if (2147483647 == (this.field_h ^ -1)) {
                        stackIn_21_0 = (wl) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = 0;
                        break L8;
                      } else {
                        stackIn_21_0 = (wl) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = this.field_h;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_23_2 = stackIn_21_2 + (param2 - -param1.field_k - -param0.field_n);

                      if ((this.field_f ^ -1) != 2147483647) {
                        stackIn_21_0 = (wl) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = this.field_f;
                        break L9;
                      } else {
                        stackIn_21_0 = (wl) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_26_3 = stackIn_24_3 + param0.field_f + (param1.field_j + param3);

                      stackIn_26_4 = -param0.field_n + param1.field_g - param0.field_b;

                      stackIn_26_5 = -param0.field_o + -param0.field_f + param1.field_x;

                      stackIn_26_6 = this.field_a;

                      stackIn_26_7 = this.field_b;

                      if (this.field_e != -2147483648) {
                        stackIn_21_0 = (wl) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = this.field_e;
                        break L10;
                      } else {
                        stackIn_21_0 = (wl) ((Object) stackIn_21_0);
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
                    ((wl) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param0.field_m, param0.field_c, param0.field_k);
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

            stackIn_31_1 = new StringBuilder().append("ef.H(");

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


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final ef a(int param0, ed[] param1) {
        RuntimeException var3 = null;
        ef stackIn_2_0 = null;
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
              stackIn_2_0 = (ef) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ef.B(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ef) (this);
        }
    }

    final void a(boolean param0) {
        this.field_b = -1;
        this.field_g = null;
        if (!param0) {
          field_c = (String[]) null;
          this.field_i = null;
          this.field_e = 256;
          this.field_h = 0;
          this.field_f = 0;
          this.field_a = 0;
          return;
        } else {
          this.field_i = null;
          this.field_e = 256;
          this.field_h = 0;
          this.field_f = 0;
          this.field_a = 0;
          return;
        }
    }

    ef() {
        this.field_g = null;
        this.field_j = false;
        this.field_f = -2147483648;
        this.field_a = -2;
        this.field_i = null;
        this.field_e = -2147483648;
        this.field_b = -2;
        this.field_h = -2147483648;
    }

    static {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_k = "Rock buster - 'ENTER' or 'R' or 'ALT' to fire";
        field_d = 50;
    }
}
