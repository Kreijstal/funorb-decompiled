/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    dm[] field_a;
    private int field_k;
    static lh field_n;
    private int field_d;
    private boolean field_h;
    private int field_e;
    private int field_f;
    static String[] field_i;
    dm field_l;
    private int field_b;
    static boolean field_c;
    static lh field_m;
    static int field_j;
    static al field_g;

    final static String a(String param0, int param1, String param2, rh param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3.a(param1 ^ param1)) {
              stackIn_4_0 = param2 + " - " + param3.b((byte) 110) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("si.A(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final si a(int param0, int param1) {
        this.field_f = param1;
        if (param0 != 0) {
            return (si) null;
        }
        return (si) (this);
    }

    final si b(int param0, int param1) {
        this.field_e = param1;
        if (param0 != 256) {
            return (si) null;
        }
        return (si) (this);
    }

    final si a(boolean param0, byte param1) {
        this.field_h = param0 ? true : false;
        if (param1 != 73) {
            si.a(false);
            return (si) (this);
        }
        return (si) (this);
    }

    final void a(rd param0, int param1, int param2, el param3, int param4) {
        m stackIn_20_0 = null;
        String stackIn_20_1 = null;
        m stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
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
              ma.a(param3.field_m + param2, param1 - -param3.field_v, param3.field_h, (byte) -92, param3.field_r, this.field_a);
              if (this.field_l == null) {
                break L1;
              } else {
                L2: {
                  var6_int = this.field_b + (param3.field_v + param1);
                  var7 = this.field_f + param2 + param3.field_m;
                  if (param0.field_g != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_l.field_s + param3.field_r) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (2 != param0.field_g) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_l.field_s + param3.field_r);
                    break L3;
                  }
                }
                L4: {
                  if (-2 == (param0.field_i ^ -1)) {
                    var7 = var7 + (param3.field_h - this.field_l.field_o) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param0.field_i) {
                    var7 = var7 + (-this.field_l.field_o + param3.field_h);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_l.b(var6_int, var7);
                break L1;
              }
            }
            L6: {
              if (param4 == 0) {
                break L6;
              } else {
                field_n = (lh) null;
                break L6;
              }
            }
            L7: {
              var6 = param0.c(120, param3);
              if (var6 == null) {
                break L7;
              } else {
                if (null == param0.field_n) {
                  break L7;
                } else {
                  if (-1 >= (this.field_e ^ -1)) {
                    L8: {
                      stackIn_20_0 = param0.field_n;

                      stackIn_20_1 = (String) (var6);

                      if (this.field_b != -2147483648) {
                        stackIn_21_0 = (m) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = this.field_b;
                        break L8;
                      } else {
                        stackIn_21_0 = (m) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = 0;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_23_2 = stackIn_21_2 + param0.field_e + param3.field_v + param1;

                      stackIn_23_3 = param0.field_m;

                      stackIn_23_4 = param3.field_m + param2;

                      if (2147483647 == (this.field_f ^ -1)) {
                        stackIn_21_0 = (m) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = 0;
                        break L9;
                      } else {
                        stackIn_21_0 = (m) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = this.field_f;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_26_3 = stackIn_24_3 + (stackIn_24_4 + stackIn_24_5);

                      stackIn_26_4 = -param0.field_e + param3.field_r - param0.field_j;

                      stackIn_26_5 = -param0.field_b + (-param0.field_m + param3.field_h);

                      stackIn_26_6 = this.field_e;

                      stackIn_26_7 = this.field_d;

                      if (this.field_k != -2147483648) {
                        stackIn_21_0 = (m) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = this.field_k;
                        break L10;
                      } else {
                        stackIn_21_0 = (m) ((Object) stackIn_21_0);
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
                    ((m) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param0.field_g, param0.field_i, param0.field_f);
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

            stackIn_31_1 = new StringBuilder().append("si.B(");

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
          throw t.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final si a(byte param0, int param1) {
        this.field_d = param1;
        if (param0 != 16) {
            return (si) null;
        }
        return (si) (this);
    }

    final si b(byte param0, int param1) {
        this.field_b = param1;
        if (param0 != -53) {
            this.field_h = true;
            return (si) (this);
        }
        return (si) (this);
    }

    public static void a(boolean param0) {
        field_i = null;
        field_m = null;
        field_g = null;
        if (param0) {
            field_c = true;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, si param2, rd param3, int param4, el param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_h) {
                param2.a(param3, param0, param1, param5, 0);
                param2.a((byte) -8);
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 == -16566) {
              L2: {
                if (this.field_f == -2147483648) {
                  break L2;
                } else {
                  param2.field_f = this.field_f;
                  break L2;
                }
              }
              L3: {
                if (this.field_d < -1) {
                  break L3;
                } else {
                  param2.field_d = this.field_d;
                  break L3;
                }
              }
              L4: {
                if ((this.field_k ^ -1) != 2147483647) {
                  param2.field_k = this.field_k;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (null == this.field_a) {
                  break L5;
                } else {
                  param2.field_a = this.field_a;
                  break L5;
                }
              }
              L6: {
                if (null == this.field_l) {
                  break L6;
                } else {
                  param2.field_l = this.field_l;
                  break L6;
                }
              }
              L7: {
                if ((this.field_e ^ -1) > 0) {
                  break L7;
                } else {
                  param2.field_e = this.field_e;
                  break L7;
                }
              }
              if (this.field_b == -2147483648) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param2.field_b = this.field_b;
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
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("si.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, si param1) {
        try {
            param1.field_e = this.field_e;
            if (param0 != 2) {
                dm[] var4 = (dm[]) null;
                this.a((dm[]) null, true);
            }
            param1.field_k = this.field_k;
            param1.field_b = this.field_b;
            param1.field_a = this.field_a;
            param1.field_l = this.field_l;
            param1.field_h = this.field_h;
            param1.field_f = this.field_f;
            param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "si.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final si a(dm[] param0, boolean param1) {
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
              if (param1) {
                break L1;
              } else {
                this.a((byte) 66, -18);
                break L1;
              }
            }
            this.field_a = param0;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("si.L(");

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (si) (this);
    }

    final void a(byte param0) {
        this.field_a = null;
        this.field_l = null;
        this.field_d = -1;
        this.field_b = 0;
        this.field_k = 256;
        int var2 = 108 / ((57 - param0) / 46);
        this.field_f = 0;
        this.field_e = 0;
    }

    si() {
        this.field_a = null;
        this.field_d = -2;
        this.field_k = -2147483648;
        this.field_h = false;
        this.field_e = -2;
        this.field_f = -2147483648;
        this.field_l = null;
        this.field_b = -2147483648;
    }

    static {
        field_n = new lh();
        field_m = new lh();
        field_j = 5167632;
    }
}
