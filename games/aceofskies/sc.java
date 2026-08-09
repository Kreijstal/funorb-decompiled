/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private boolean field_c;
    private int field_i;
    private int field_g;
    private int field_h;
    static String field_b;
    private int field_a;
    private int field_e;
    ll field_f;
    ll[] field_d;

    final sc a(int param0, int param1) {
        if (param1 != -2) {
            this.b(-40, (byte) -33);
            this.field_g = param0;
            return (sc) (this);
        }
        this.field_g = param0;
        return (sc) (this);
    }

    final void a(int param0) {
        this.field_a = -1;
        this.field_g = 0;
        this.field_h = 256;
        this.field_d = null;
        this.field_f = null;
        this.field_i = 0;
        int var2 = -110 / ((param0 - 52) / 60);
        this.field_e = 0;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 <= 100) {
            field_b = (String) null;
        }
    }

    final static eh a(boolean param0, int param1) {
        if (param0) {
            return (eh) null;
        }
        eh var2 = new eh();
        wu.field_w.a(117, var2);
        lb.a(param1, 0);
        return var2;
    }

    final sc b(int param0, byte param1) {
        if (param1 != -125) {
            return (sc) null;
        }
        this.field_i = param0;
        return (sc) (this);
    }

    final sc c(int param0, byte param1) {
        if (param1 != -79) {
            this.a(-72);
            this.field_a = param0;
            return (sc) (this);
        }
        this.field_a = param0;
        return (sc) (this);
    }

    final void a(sc param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.field_g = this.field_g;
              param0.field_h = this.field_h;
              param0.field_f = this.field_f;
              param0.field_i = this.field_i;
              param0.field_e = this.field_e;
              param0.field_a = this.field_a;
              param0.field_c = this.field_c;
              param0.field_d = this.field_d;
              if (param1 == -22) {
                break L1;
              } else {
                this.a(39, (byte) 68);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sc.I(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(ea param0, boolean param1, int param2, vi param3, int param4) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        hc stackIn_24_0;
        String stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        hc stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_30_3;
        int stackIn_30_4;
        int stackIn_30_5;
        int stackIn_30_6;
        int stackIn_30_7;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_31_5;
        int stackIn_31_6;
        int stackIn_31_7;
        int stackIn_31_8;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0.field_n;

              stackIn_2_1 = param0.field_q;

              stackIn_2_2 = param2 + param0.field_p;

              if (param1) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 1;
                break L1;
              }
            }
            L2: {
              we.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0, param0.field_h + param4, this.field_d);
              if (this.field_f != null) {
                L3: {
                  var6_int = this.field_e + param0.field_p + param2;
                  if (param3.field_e == 1) {
                    var6_int = var6_int + (param0.field_q + -this.field_f.field_v) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var7 = this.field_i + param0.field_h + param4;
                  if (param3.field_f == 1) {
                    var7 = var7 + (-this.field_f.field_q + param0.field_n) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param3.field_e == 2) {
                    var6_int = var6_int + (param0.field_q + -this.field_f.field_v);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param3.field_f != 2) {
                    break L6;
                  } else {
                    var7 = var7 + (-this.field_f.field_q + param0.field_n);
                    break L6;
                  }
                }
                this.field_f.b(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6 = param3.d(param0, -91);
              if (param1) {
                break L7;
              } else {
                this.field_c = false;
                break L7;
              }
            }
            L8: {
              if (var6 == null) {
                break L8;
              } else {
                if (null == param3.field_i) {
                  break L8;
                } else {
                  if (this.field_g < 0) {
                    break L8;
                  } else {
                    L9: {
                      stackIn_24_0 = param3.field_i;

                      stackIn_24_1 = (String) (var6);

                      stackIn_24_2 = param2;

                      stackIn_24_3 = -param0.field_p;

                      stackIn_24_4 = param3.field_b;

                      if (2147483647 != (this.field_e ^ -1)) {
                        stackIn_25_0 = (hc) ((Object) stackIn_24_0);
                        stackIn_25_1 = (String) ((Object) stackIn_24_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = this.field_e;
                        break L9;
                      } else {
                        stackIn_25_0 = (hc) ((Object) stackIn_24_0);
                        stackIn_25_1 = (String) ((Object) stackIn_24_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = 0;
                        break L9;
                      }
                    }
                    L10: {




                      stackIn_27_2 = stackIn_25_2 - (stackIn_25_3 - (stackIn_25_4 - -stackIn_25_5));

                      if (-2147483648 == this.field_i) {
                        stackIn_25_0 = (hc) ((Object) stackIn_25_0);
                        stackIn_25_1 = (String) ((Object) stackIn_25_1);
                        stackIn_28_2 = stackIn_27_2;
                        stackIn_28_3 = 0;
                        break L10;
                      } else {
                        stackIn_25_0 = (hc) ((Object) stackIn_25_0);
                        stackIn_25_1 = (String) ((Object) stackIn_25_1);
                        stackIn_28_2 = stackIn_27_2;
                        stackIn_28_3 = this.field_i;
                        break L10;
                      }
                    }
                    L11: {






                      stackIn_30_3 = stackIn_28_3 + (param3.field_a + param0.field_h) + param4;

                      stackIn_30_4 = -param3.field_l + -param3.field_b + param0.field_q;

                      stackIn_30_5 = -param3.field_g + (-param3.field_a + param0.field_n);

                      stackIn_30_6 = this.field_g;

                      stackIn_30_7 = this.field_a;

                      if (this.field_h == -2147483648) {
                        stackIn_25_0 = (hc) ((Object) stackIn_25_0);
                        stackIn_25_1 = (String) ((Object) stackIn_25_1);

                        stackIn_31_3 = stackIn_30_3;
                        stackIn_31_4 = stackIn_30_4;
                        stackIn_31_5 = stackIn_30_5;
                        stackIn_31_6 = stackIn_30_6;
                        stackIn_31_7 = stackIn_30_7;
                        stackIn_31_8 = 256;
                        break L11;
                      } else {
                        stackIn_25_0 = (hc) ((Object) stackIn_25_0);
                        stackIn_25_1 = (String) ((Object) stackIn_25_1);

                        stackIn_31_3 = stackIn_30_3;
                        stackIn_31_4 = stackIn_30_4;
                        stackIn_31_5 = stackIn_30_5;
                        stackIn_31_6 = stackIn_30_6;
                        stackIn_31_7 = stackIn_30_7;
                        stackIn_31_8 = this.field_h;
                        break L11;
                      }
                    }
                    ((hc) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_28_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_31_6, stackIn_31_7, stackIn_31_8, param3.field_e, param3.field_f, param3.field_k);
                    break L8;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6_ref = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var6_ref);

            stackIn_35_1 = new StringBuilder().append("sc.J(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ',' + param4 + ')');
        }
    }

    final void a(vi param0, int param1, byte param2, int param3, ea param4, sc param5) {
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
              if (this.field_c) {
                param5.a(param4, true, param3, param0, param1);
                param5.a(116);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == this.field_f) {
                break L2;
              } else {
                param5.field_f = this.field_f;
                break L2;
              }
            }
            if (param2 == -107) {
              L3: {
                if (-1 > this.field_g) {
                  break L3;
                } else {
                  param5.field_g = this.field_g;
                  break L3;
                }
              }
              L4: {
                if (null == this.field_d) {
                  break L4;
                } else {
                  param5.field_d = this.field_d;
                  break L4;
                }
              }
              L5: {
                if (0 < (this.field_a ^ -1)) {
                  break L5;
                } else {
                  param5.field_a = this.field_a;
                  break L5;
                }
              }
              L6: {
                if (-2147483648 != this.field_e) {
                  param5.field_e = this.field_e;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (this.field_h == -2147483648) {
                  break L7;
                } else {
                  param5.field_h = this.field_h;
                  break L7;
                }
              }
              if ((this.field_i ^ -1) == 2147483647) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param5.field_i = this.field_i;
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

            stackIn_23_1 = new StringBuilder().append("sc.L(");

            if (param0 == null) {
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


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

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
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final sc a(ll[] param0, boolean param1) {
        RuntimeException var3 = null;
        sc stackIn_2_0 = null;
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
            this.field_d = param0;
            if (!param1) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sc.C(");

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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (sc) (this);
        }
    }

    final sc a(int param0, byte param1) {
        int var3 = 23 / ((param1 - 27) / 35);
        this.field_e = param0;
        return (sc) (this);
    }

    final sc a(byte param0, boolean param1) {
        vi var4;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((sc) (this)).field_c = stackIn_3_1 != 0;
        if (param0 != -50) {
          var4 = (vi) null;
          this.a((ea) null, false, -68, (vi) null, 7);
          return (sc) (this);
        } else {
          return (sc) (this);
        }
    }

    sc() {
        this.field_i = -2147483648;
        this.field_c = false;
        this.field_h = -2147483648;
        this.field_e = -2147483648;
        this.field_f = null;
        this.field_a = -2;
        this.field_g = -2;
        this.field_d = null;
    }

    static {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
    }
}
