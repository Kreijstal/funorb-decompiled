/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private boolean field_i;
    private int field_h;
    static ao field_g;
    private int field_m;
    private int field_f;
    static String[] field_c;
    private int field_a;
    ja field_k;
    private int field_j;
    ja[] field_e;
    static String field_n;
    static int field_d;
    static ul field_b;
    static String field_l;

    final mk a(int param0, int param1) {
        this.field_f = param0;
        if (param1 != 2147483647) {
            this.field_a = 30;
            return (mk) (this);
        }
        return (mk) (this);
    }

    final mk a(boolean param0, int param1) {
        this.field_i = param0 ? true : false;
        if (param1 != 2521) {
            return (mk) null;
        }
        return (mk) (this);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_l = null;
        field_g = null;
        field_n = null;
        int var1 = 9 % ((param0 - -74) / 48);
    }

    final mk a(ja[] param0, int param1) {
        RuntimeException var3 = null;
        mk stackIn_2_0 = null;
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
            this.field_e = param0;
            if (param1 == 2147483647) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("mk.A(");

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (mk) (this);
        }
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            var3_int = ro.a(-125, param0, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    field_b = (ul) null;
                    break L2;
                  }
                }
                var4[var3_int] = param2.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2.charAt(var8) == param0) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param2.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("mk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final void a(byte param0) {
        cf var3;
        if (param0 != 11) {
          var3 = (cf) null;
          this.a(14, true, (jl) null, (cf) null, -114);
          this.field_f = 0;
          this.field_j = 0;
          this.field_m = 0;
          this.field_e = null;
          this.field_a = 256;
          this.field_k = null;
          this.field_h = -1;
          return;
        } else {
          this.field_f = 0;
          this.field_j = 0;
          this.field_m = 0;
          this.field_e = null;
          this.field_a = 256;
          this.field_k = null;
          this.field_h = -1;
          return;
        }
    }

    final mk a(byte param0, int param1) {
        this.field_h = param1;
        int var3 = 73 / ((param0 - -40) / 34);
        return (mk) (this);
    }

    final void a(int param0, boolean param1, jl param2, cf param3, int param4) {
        fm stackIn_22_0;
        String stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        fm stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_29_3;
        int stackIn_29_4;
        int stackIn_29_5;
        int stackIn_29_6;
        int stackIn_29_7;
        int stackIn_29_8;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              s.a(param3.field_i + param4, 0, this.field_e, param3.field_y + param0, param3.field_w, param3.field_n);
              if (!param1) {
                break L1;
              } else {
                this.field_m = -63;
                break L1;
              }
            }
            L2: {
              if (this.field_k != null) {
                L3: {
                  var6_int = param3.field_y + (param0 - -this.field_f);
                  if ((param2.field_d ^ -1) != -2) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_k.field_z + param3.field_n) / 2;
                    break L3;
                  }
                }
                L4: {
                  var7 = this.field_j + (param3.field_i + param4);
                  if (param2.field_a == 1) {
                    var7 = var7 + (param3.field_w - this.field_k.field_u) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param2.field_d ^ -1)) {
                    var6_int = var6_int + (param3.field_n - this.field_k.field_z);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((param2.field_a ^ -1) == -3) {
                    var7 = var7 + (-this.field_k.field_u + param3.field_w);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_k.g(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6 = param2.d(param3, -9327);
              if (var6 == null) {
                break L7;
              } else {
                if (param2.field_j == null) {
                  break L7;
                } else {
                  if (-1 >= (this.field_m ^ -1)) {
                    L8: {
                      stackIn_22_0 = param2.field_j;

                      stackIn_22_1 = (String) (var6);

                      stackIn_22_2 = param0 - -param3.field_y;

                      stackIn_22_3 = param2.field_r;

                      if ((this.field_f ^ -1) == 2147483647) {
                        stackIn_23_0 = (fm) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) ((Object) stackIn_22_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = stackIn_22_3;
                        stackIn_23_4 = 0;
                        break L8;
                      } else {
                        stackIn_23_0 = (fm) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) ((Object) stackIn_22_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = stackIn_22_3;
                        stackIn_23_4 = this.field_f;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_25_2 = stackIn_23_2 + (stackIn_23_3 - -stackIn_23_4);

                      if ((this.field_j ^ -1) != 2147483647) {
                        stackIn_23_0 = (fm) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);
                        stackIn_26_2 = stackIn_25_2;
                        stackIn_26_3 = this.field_j;
                        break L9;
                      } else {
                        stackIn_23_0 = (fm) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);
                        stackIn_26_2 = stackIn_25_2;
                        stackIn_26_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_28_3 = stackIn_26_3 + (param2.field_g + (param3.field_i + param4));

                      stackIn_28_4 = -param2.field_r + param3.field_n - param2.field_n;

                      stackIn_28_5 = param3.field_w - param2.field_g - param2.field_p;

                      stackIn_28_6 = this.field_m;

                      stackIn_28_7 = this.field_h;

                      if ((this.field_a ^ -1) != 2147483647) {
                        stackIn_23_0 = (fm) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);

                        stackIn_29_3 = stackIn_28_3;
                        stackIn_29_4 = stackIn_28_4;
                        stackIn_29_5 = stackIn_28_5;
                        stackIn_29_6 = stackIn_28_6;
                        stackIn_29_7 = stackIn_28_7;
                        stackIn_29_8 = this.field_a;
                        break L10;
                      } else {
                        stackIn_23_0 = (fm) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);

                        stackIn_29_3 = stackIn_28_3;
                        stackIn_29_4 = stackIn_28_4;
                        stackIn_29_5 = stackIn_28_5;
                        stackIn_29_6 = stackIn_28_6;
                        stackIn_29_7 = stackIn_28_7;
                        stackIn_29_8 = 256;
                        break L10;
                      }
                    }
                    ((fm) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_26_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param2.field_d, param2.field_a, param2.field_f);
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
            stackIn_33_0 = (RuntimeException) (var6_ref);

            stackIn_33_1 = new StringBuilder().append("mk.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, jl param3, cf param4, mk param5) {
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
              if (this.field_i) {
                param5.a(param1, false, param3, param4, param2);
                param5.a((byte) 11);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_h < -1) {
                break L2;
              } else {
                param5.field_h = this.field_h;
                break L2;
              }
            }
            L3: {
              if (this.field_k == null) {
                break L3;
              } else {
                param5.field_k = this.field_k;
                break L3;
              }
            }
            L4: {
              if (2147483647 != (this.field_j ^ -1)) {
                param5.field_j = this.field_j;
                break L4;
              } else {
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
              if (-2147483648 == this.field_f) {
                break L6;
              } else {
                param5.field_f = this.field_f;
                break L6;
              }
            }
            L7: {
              if (param0 == -11108) {
                break L7;
              } else {
                this.b(-59, -41);
                break L7;
              }
            }
            L8: {
              if (null == this.field_e) {
                break L8;
              } else {
                param5.field_e = this.field_e;
                break L8;
              }
            }
            if (-1 <= this.field_m) {
              param5.field_m = this.field_m;
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

            stackIn_25_1 = new StringBuilder().append("mk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
    }

    final void a(int param0, mk param1) {
        param1.field_m = this.field_m;
        param1.field_h = this.field_h;
        param1.field_i = this.field_i;
        if (param0 <= 72) {
            return;
        }
        try {
            param1.field_a = this.field_a;
            param1.field_j = this.field_j;
            param1.field_f = this.field_f;
            param1.field_k = this.field_k;
            param1.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final mk b(int param0, int param1) {
        if (param1 != 0) {
            this.b(92, -13);
            this.field_m = param0;
            return (mk) (this);
        }
        this.field_m = param0;
        return (mk) (this);
    }

    final mk a(int param0, byte param1) {
        this.field_j = param0;
        if (param1 != 47) {
            return (mk) null;
        }
        return (mk) (this);
    }

    mk() {
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_i = false;
        this.field_m = -2;
        this.field_k = null;
        this.field_j = -2147483648;
        this.field_f = -2147483648;
        this.field_e = null;
    }

    static {
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = new ao(6, 0, 4, 2);
        field_n = "Tips";
        field_d = 64;
        field_l = "Rated game";
    }
}
