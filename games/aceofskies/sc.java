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
            sc discarded$0 = ((sc) this).b(-40, (byte) -33);
            ((sc) this).field_g = param0;
            return (sc) this;
        }
        ((sc) this).field_g = param0;
        return (sc) this;
    }

    final void a(int param0) {
        ((sc) this).field_a = -1;
        ((sc) this).field_g = 0;
        ((sc) this).field_h = 256;
        ((sc) this).field_d = null;
        ((sc) this).field_f = null;
        ((sc) this).field_i = 0;
        int var2 = -110 / ((param0 - 52) / 60);
        ((sc) this).field_e = 0;
    }

    public static void b() {
        field_b = null;
    }

    final static eh a() {
        eh var2 = new eh();
        wu.field_w.a(117, (wf) (Object) var2);
        lb.a(4, 0);
        return var2;
    }

    final sc b(int param0, byte param1) {
        if (param1 != -125) {
            return null;
        }
        ((sc) this).field_i = param0;
        return (sc) this;
    }

    final sc c(int param0, byte param1) {
        if (param1 != -79) {
            ((sc) this).a(-72);
            ((sc) this).field_a = param0;
            return (sc) this;
        }
        ((sc) this).field_a = param0;
        return (sc) this;
    }

    final void a(sc param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.field_g = ((sc) this).field_g;
              param0.field_h = ((sc) this).field_h;
              param0.field_f = ((sc) this).field_f;
              param0.field_i = ((sc) this).field_i;
              param0.field_e = ((sc) this).field_e;
              param0.field_a = ((sc) this).field_a;
              param0.field_c = ((sc) this).field_c;
              param0.field_d = ((sc) this).field_d;
              if (param1 == -22) {
                break L1;
              } else {
                sc discarded$2 = ((sc) this).a(39, (byte) 68);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sc.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(ea param0, boolean param1, int param2, vi param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        hc stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        hc stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        hc stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        hc stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        hc stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        hc stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        hc stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        hc stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        hc stackIn_31_0 = null;
        String stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        int stackIn_31_8 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        hc stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        hc stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        hc stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        hc stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        hc stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        hc stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        hc stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        hc stackOut_30_0 = null;
        String stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        int stackOut_30_8 = 0;
        hc stackOut_29_0 = null;
        String stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        int stackOut_29_8 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = param0.field_n;
              stackOut_0_1 = param0.field_q;
              stackOut_0_2 = param2 + param0.field_p;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (param1) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                break L1;
              }
            }
            L2: {
              we.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0, param0.field_h + param4, ((sc) this).field_d);
              if (((sc) this).field_f != null) {
                L3: {
                  var6_int = ((sc) this).field_e + param0.field_p + param2;
                  if (param3.field_e == 1) {
                    var6_int = var6_int + (param0.field_q + -((sc) this).field_f.field_v) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var7 = ((sc) this).field_i + param0.field_h + param4;
                  if (param3.field_f == 1) {
                    var7 = var7 + (-((sc) this).field_f.field_q + param0.field_n) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param3.field_e == 2) {
                    var6_int = var6_int + (param0.field_q + -((sc) this).field_f.field_v);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param3.field_f != 2) {
                    break L6;
                  } else {
                    var7 = var7 + (-((sc) this).field_f.field_q + param0.field_n);
                    break L6;
                  }
                }
                ((sc) this).field_f.b(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6_ref = param3.d(param0, -91);
              if (param1) {
                break L7;
              } else {
                ((sc) this).field_c = false;
                break L7;
              }
            }
            L8: {
              if (var6_ref == null) {
                break L8;
              } else {
                if (null == param3.field_i) {
                  break L8;
                } else {
                  if (((sc) this).field_g < 0) {
                    break L8;
                  } else {
                    L9: {
                      stackOut_22_0 = param3.field_i;
                      stackOut_22_1 = (String) var6_ref;
                      stackOut_22_2 = param2;
                      stackOut_22_3 = -param0.field_p;
                      stackOut_22_4 = param3.field_b;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_24_3 = stackOut_22_3;
                      stackIn_24_4 = stackOut_22_4;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      if (((sc) this).field_e != -2147483648) {
                        stackOut_24_0 = (hc) (Object) stackIn_24_0;
                        stackOut_24_1 = (String) (Object) stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = ((sc) this).field_e;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        stackIn_25_4 = stackOut_24_4;
                        stackIn_25_5 = stackOut_24_5;
                        break L9;
                      } else {
                        stackOut_23_0 = (hc) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = 0;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_25_4 = stackOut_23_4;
                        stackIn_25_5 = stackOut_23_5;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_25_0 = (hc) (Object) stackIn_25_0;
                      stackOut_25_1 = (String) (Object) stackIn_25_1;
                      stackOut_25_2 = stackIn_25_2 - (stackIn_25_3 - (stackIn_25_4 - -stackIn_25_5));
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      if (-2147483648 == ((sc) this).field_i) {
                        stackOut_27_0 = (hc) (Object) stackIn_27_0;
                        stackOut_27_1 = (String) (Object) stackIn_27_1;
                        stackOut_27_2 = stackIn_27_2;
                        stackOut_27_3 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        stackIn_28_3 = stackOut_27_3;
                        break L10;
                      } else {
                        stackOut_26_0 = (hc) (Object) stackIn_26_0;
                        stackOut_26_1 = (String) (Object) stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = ((sc) this).field_i;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        stackIn_28_2 = stackOut_26_2;
                        stackIn_28_3 = stackOut_26_3;
                        break L10;
                      }
                    }
                    L11: {
                      stackOut_28_0 = (hc) (Object) stackIn_28_0;
                      stackOut_28_1 = (String) (Object) stackIn_28_1;
                      stackOut_28_2 = stackIn_28_2;
                      stackOut_28_3 = stackIn_28_3 + (param3.field_a + param0.field_h) + param4;
                      stackOut_28_4 = -param3.field_l + -param3.field_b + param0.field_q;
                      stackOut_28_5 = -param3.field_g + (-param3.field_a + param0.field_n);
                      stackOut_28_6 = ((sc) this).field_g;
                      stackOut_28_7 = ((sc) this).field_a;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_30_2 = stackOut_28_2;
                      stackIn_30_3 = stackOut_28_3;
                      stackIn_30_4 = stackOut_28_4;
                      stackIn_30_5 = stackOut_28_5;
                      stackIn_30_6 = stackOut_28_6;
                      stackIn_30_7 = stackOut_28_7;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      stackIn_29_4 = stackOut_28_4;
                      stackIn_29_5 = stackOut_28_5;
                      stackIn_29_6 = stackOut_28_6;
                      stackIn_29_7 = stackOut_28_7;
                      if (((sc) this).field_h == -2147483648) {
                        stackOut_30_0 = (hc) (Object) stackIn_30_0;
                        stackOut_30_1 = (String) (Object) stackIn_30_1;
                        stackOut_30_2 = stackIn_30_2;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = stackIn_30_4;
                        stackOut_30_5 = stackIn_30_5;
                        stackOut_30_6 = stackIn_30_6;
                        stackOut_30_7 = stackIn_30_7;
                        stackOut_30_8 = 256;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        stackIn_31_3 = stackOut_30_3;
                        stackIn_31_4 = stackOut_30_4;
                        stackIn_31_5 = stackOut_30_5;
                        stackIn_31_6 = stackOut_30_6;
                        stackIn_31_7 = stackOut_30_7;
                        stackIn_31_8 = stackOut_30_8;
                        break L11;
                      } else {
                        stackOut_29_0 = (hc) (Object) stackIn_29_0;
                        stackOut_29_1 = (String) (Object) stackIn_29_1;
                        stackOut_29_2 = stackIn_29_2;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = stackIn_29_4;
                        stackOut_29_5 = stackIn_29_5;
                        stackOut_29_6 = stackIn_29_6;
                        stackOut_29_7 = stackIn_29_7;
                        stackOut_29_8 = ((sc) this).field_h;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        stackIn_31_5 = stackOut_29_5;
                        stackIn_31_6 = stackOut_29_6;
                        stackIn_31_7 = stackOut_29_7;
                        stackIn_31_8 = stackOut_29_8;
                        break L11;
                      }
                    }
                    int discarded$1 = ((hc) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_31_6, stackIn_31_7, stackIn_31_8, param3.field_e, param3.field_f, param3.field_k);
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
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("sc.J(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          L13: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param4 + ')');
        }
    }

    final void a(vi param0, int param1, byte param2, int param3, ea param4, sc param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (((sc) this).field_c) {
                param5.a(param4, true, param3, param0, param1);
                param5.a(116);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == ((sc) this).field_f) {
                break L2;
              } else {
                param5.field_f = ((sc) this).field_f;
                break L2;
              }
            }
            if (param2 == -107) {
              L3: {
                if (-1 > ((sc) this).field_g) {
                  break L3;
                } else {
                  param5.field_g = ((sc) this).field_g;
                  break L3;
                }
              }
              L4: {
                if (null == ((sc) this).field_d) {
                  break L4;
                } else {
                  param5.field_d = ((sc) this).field_d;
                  break L4;
                }
              }
              L5: {
                if (((sc) this).field_a < -1) {
                  break L5;
                } else {
                  param5.field_a = ((sc) this).field_a;
                  break L5;
                }
              }
              L6: {
                if (-2147483648 != ((sc) this).field_e) {
                  param5.field_e = ((sc) this).field_e;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (((sc) this).field_h == -2147483648) {
                  break L7;
                } else {
                  param5.field_h = ((sc) this).field_h;
                  break L7;
                }
              }
              if (((sc) this).field_i == -2147483648) {
                break L0;
              } else {
                param5.field_i = ((sc) this).field_i;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("sc.L(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final sc a(ll[] param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((sc) this).field_d = param0;
            if (!param1) {
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sc.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return (sc) this;
    }

    final sc a(int param0, byte param1) {
        int var3 = 23 / ((param1 - 27) / 35);
        ((sc) this).field_e = param0;
        return (sc) this;
    }

    final sc a(byte param0, boolean param1) {
        Object var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((sc) this).field_c = stackIn_3_1 != 0;
        if (param0 != -50) {
          var4 = null;
          ((sc) this).a((ea) null, false, -68, (vi) null, 7);
          return (sc) this;
        } else {
          return (sc) this;
        }
    }

    sc() {
        ((sc) this).field_i = -2147483648;
        ((sc) this).field_c = false;
        ((sc) this).field_h = -2147483648;
        ((sc) this).field_e = -2147483648;
        ((sc) this).field_f = null;
        ((sc) this).field_a = -2;
        ((sc) this).field_g = -2;
        ((sc) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
    }
}
