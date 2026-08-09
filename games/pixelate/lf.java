/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_b;
    tf[] field_k;
    private int field_g;
    private int field_h;
    static String[] field_i;
    tf field_j;
    private int field_e;
    private int field_d;
    private boolean field_c;
    private int field_a;
    static fm field_f;

    final void a(lf param0, int param1, w param2, byte param3, int param4, ng param5) {
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
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_c) {
                break L1;
              } else {
                param0.a(param4, param1, param5, (byte) 116, param2);
                param0.a(true);
                break L1;
              }
            }
            L2: {
              if (this.field_d != -2147483648) {
                param0.field_d = this.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (2147483647 == (this.field_a ^ -1)) {
                break L3;
              } else {
                param0.field_a = this.field_a;
                break L3;
              }
            }
            L4: {
              if (this.field_h != -2147483648) {
                param0.field_h = this.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == this.field_k) {
                break L5;
              } else {
                param0.field_k = this.field_k;
                break L5;
              }
            }
            L6: {
              var7_int = -122 % ((-27 - param3) / 39);
              if ((this.field_g ^ -1) <= 0) {
                param0.field_g = this.field_g;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((this.field_e ^ -1) > 0) {
                break L7;
              } else {
                param0.field_e = this.field_e;
                break L7;
              }
            }
            L8: {
              if (this.field_j != null) {
                param0.field_j = this.field_j;
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("lf.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
    }

    final static boolean a(byte param0) {
        aj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1 = (aj) ((Object) ma.field_o.c(1504642273));
            if (var1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2 = 0;
                if (param0 == -91) {
                  break L1;
                } else {
                  field_i = (String[]) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (var2 >= var1.field_s) {
                  stackIn_20_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (null != var1.field_l[var2]) {
                      if (var1.field_l[var2].field_b == 0) {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var1.field_v[var2] == null) {
                      break L4;
                    } else {
                      if (-1 != (var1.field_v[var2].field_b ^ -1)) {
                        break L4;
                      } else {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "lf.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final lf a(tf[] param0, byte param1) {
        RuntimeException var3 = null;
        lf stackIn_2_0 = null;
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
            this.field_k = param0;
            if (param1 == -65) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (lf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("lf.H(");

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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (lf) (this);
        }
    }

    final void a(int param0, int param1, ng param2, byte param3, w param4) {
        jl stackIn_18_0;
        String stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        jl stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              dk.a(param2.field_E, param1 - -param2.field_z, (byte) 75, param2.field_C, param0 - -param2.field_p, this.field_k);
              if (null == this.field_j) {
                break L1;
              } else {
                L2: {
                  var6_int = this.field_d + (param2.field_z + param1);
                  var7 = param2.field_p + param0 - -this.field_h;
                  if (param4.field_l != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_j.field_A + param2.field_E) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (1 == param4.field_d) {
                    var7 = var7 + (-this.field_j.field_B + param2.field_C) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-3 != (param4.field_l ^ -1)) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param2.field_E + -this.field_j.field_A);
                    break L4;
                  }
                }
                L5: {
                  if (2 != param4.field_d) {
                    break L5;
                  } else {
                    var7 = var7 + (-this.field_j.field_B + param2.field_C);
                    break L5;
                  }
                }
                this.field_j.b(var6_int, var7);
                break L1;
              }
            }
            var6 = param4.b(param2, -472248767);
            if (param3 >= 115) {
              L6: {
                if (var6 == null) {
                  break L6;
                } else {
                  if (param4.field_a == null) {
                    break L6;
                  } else {
                    if (-1 < (this.field_g ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_18_0 = param4.field_a;

                        stackIn_18_1 = (String) (var6);

                        stackIn_18_2 = param4.field_h;

                        stackIn_18_3 = param1 + param2.field_z;

                        if (this.field_d == -2147483648) {
                          stackIn_19_0 = (jl) ((Object) stackIn_18_0);
                          stackIn_19_1 = (String) ((Object) stackIn_18_1);
                          stackIn_19_2 = stackIn_18_2;
                          stackIn_19_3 = stackIn_18_3;
                          stackIn_19_4 = 0;
                          break L7;
                        } else {
                          stackIn_19_0 = (jl) ((Object) stackIn_18_0);
                          stackIn_19_1 = (String) ((Object) stackIn_18_1);
                          stackIn_19_2 = stackIn_18_2;
                          stackIn_19_3 = stackIn_18_3;
                          stackIn_19_4 = this.field_d;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_21_2 = stackIn_19_2 + (stackIn_19_3 + stackIn_19_4);

                        if (this.field_h == -2147483648) {
                          stackIn_19_0 = (jl) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = 0;
                          break L8;
                        } else {
                          stackIn_19_0 = (jl) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = this.field_h;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_24_3 = stackIn_22_3 + (param4.field_k + param0 + param2.field_p);

                        stackIn_24_4 = -param4.field_h + (param2.field_E - param4.field_c);

                        stackIn_24_5 = -param4.field_f + (param2.field_C - param4.field_k);

                        stackIn_24_6 = this.field_g;

                        stackIn_24_7 = this.field_e;

                        if (-2147483648 != this.field_a) {
                          stackIn_19_0 = (jl) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);

                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = stackIn_24_6;
                          stackIn_25_7 = stackIn_24_7;
                          stackIn_25_8 = this.field_a;
                          break L9;
                        } else {
                          stackIn_19_0 = (jl) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);

                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = stackIn_24_6;
                          stackIn_25_7 = stackIn_24_7;
                          stackIn_25_8 = 256;
                          break L9;
                        }
                      }
                      ((jl) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param4.field_l, param4.field_d, param4.field_j);
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
            stackIn_29_0 = (RuntimeException) (var6_ref);

            stackIn_29_1 = new StringBuilder().append("lf.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final lf a(int param0, byte param1) {
        if (param1 != -68) {
            this.field_a = 97;
        }
        this.field_e = param0;
        return (lf) (this);
    }

    final lf a(byte param0, int param1) {
        int var3 = -32 % ((56 - param0) / 46);
        this.field_d = param1;
        return (lf) (this);
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_g = 0;
        this.field_d = 0;
        this.field_e = -1;
        this.field_k = null;
        this.field_j = null;
        this.field_a = 256;
        this.field_h = 0;
    }

    final void a(lf param0, byte param1) {
        try {
            param0.field_h = this.field_h;
            param0.field_e = this.field_e;
            param0.field_d = this.field_d;
            param0.field_j = this.field_j;
            param0.field_a = this.field_a;
            int var3_int = 72 / ((param1 - -43) / 41);
            param0.field_g = this.field_g;
            param0.field_c = this.field_c;
            param0.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lf.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lf a(boolean param0, boolean param1) {
        if (!param0) {
            return (lf) null;
        }
        this.field_c = param1 ? true : false;
        return (lf) (this);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final lf a(int param0, boolean param1) {
        this.field_h = param0;
        if (param1) {
            this.field_g = 122;
        }
        return (lf) (this);
    }

    final lf a(int param0, int param1) {
        this.field_g = param0;
        if (param1 != 15115) {
            this.field_d = 118;
        }
        return (lf) (this);
    }

    lf() {
        this.field_j = null;
        this.field_k = null;
        this.field_e = -2;
        this.field_g = -2;
        this.field_h = -2147483648;
        this.field_c = false;
        this.field_d = -2147483648;
        this.field_a = -2147483648;
    }

    static {
        field_i = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
