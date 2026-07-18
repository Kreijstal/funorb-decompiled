/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    private boolean field_g;
    static wb field_c;
    dl[] field_k;
    private int field_e;
    static am field_b;
    static int field_d;
    private int field_j;
    private int field_i;
    private int field_a;
    dl field_h;
    private int field_f;

    final pm c(int param0, int param1) {
        if (param0 >= -89) {
            ((pm) this).a(-37);
            ((pm) this).field_i = param1;
            return (pm) this;
        }
        ((pm) this).field_i = param1;
        return (pm) this;
    }

    final static void a(int param0, we param1, byte param2) {
        md var5 = tp.field_f;
        var5.d(8, 5);
        var5.field_f = var5.field_f + 1;
        int var4 = var5.field_f;
        var5.a(true, 1);
        var5.a(true, param1.field_j);
        var5.a(param1.field_g, (byte) 106);
        var5.a(param1.field_m, -16384);
        var5.a(param1.field_i, -16384);
        try {
            var5.a(param1.field_f, -16384);
            var5.a(param1.field_k, -16384);
            int discarded$0 = var5.b(var4, (byte) -58);
            var5.c((byte) 48, var5.field_f + -var4);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pm.L(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ',' + 71 + ')');
        }
    }

    final pm a(int param0, int param1) {
        if (param1 != 0) {
            field_b = null;
            ((pm) this).field_f = param0;
            return (pm) this;
        }
        ((pm) this).field_f = param0;
        return (pm) this;
    }

    final pm a(boolean param0, boolean param1) {
        ((pm) this).field_g = param1 ? true : false;
        if (param0) {
            return null;
        }
        return (pm) this;
    }

    final void a(int param0) {
        ((pm) this).field_i = param0;
        ((pm) this).field_e = 256;
        ((pm) this).field_a = 0;
        ((pm) this).field_f = -1;
        ((pm) this).field_h = null;
        ((pm) this).field_j = 0;
        ((pm) this).field_k = null;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 25) {
            pm.a((byte) -63);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final pm a(int param0, dl[] param1) {
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
            if (param0 > 6) {
              ((pm) this).field_k = param1;
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pm.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (pm) this;
    }

    final void a(fk param0, int param1, qm param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        vc stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        vc stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        vc stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        vc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        vc stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        vc stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        vc stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        vc stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        vc stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        vc stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        vc stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        vc stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        vc stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        vc stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        vc stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        vc stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        vc stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              oc.a(((pm) this).field_k, param2.field_f, param2.field_j + param3, param1 - -param2.field_r, param2.field_g, -67);
              if (null != ((pm) this).field_h) {
                L2: {
                  var6_int = ((pm) this).field_i + (param2.field_r + param1);
                  if (param0.field_i == 1) {
                    var6_int = var6_int + (-((pm) this).field_h.field_n + param2.field_g) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = ((pm) this).field_j + (param3 + param2.field_j);
                  if (1 == param0.field_a) {
                    var7 = var7 + (-((pm) this).field_h.field_o + param2.field_f) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_i == 2) {
                    var6_int = var6_int + (-((pm) this).field_h.field_n + param2.field_g);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_a != 2) {
                    break L5;
                  } else {
                    var7 = var7 + (param2.field_f + -((pm) this).field_h.field_o);
                    break L5;
                  }
                }
                ((pm) this).field_h.a(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var7 = -86 / ((param4 - -74) / 49);
              var6_ref = param0.d(param2, -1);
              if (var6_ref == null) {
                break L6;
              } else {
                if (null == param0.field_p) {
                  break L6;
                } else {
                  if (((pm) this).field_a >= 0) {
                    L7: {
                      stackOut_18_0 = param0.field_p;
                      stackOut_18_1 = (String) var6_ref;
                      stackOut_18_2 = param2.field_r;
                      stackOut_18_3 = param1 + param0.field_o;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      if (((pm) this).field_i == -2147483648) {
                        stackOut_20_0 = (vc) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        break L7;
                      } else {
                        stackOut_19_0 = (vc) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = stackIn_19_3;
                        stackOut_19_4 = ((pm) this).field_i;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        stackIn_21_4 = stackOut_19_4;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_21_0 = (vc) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2 + (stackIn_21_3 - -stackIn_21_4);
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      if (((pm) this).field_j == -2147483648) {
                        stackOut_23_0 = (vc) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        break L8;
                      } else {
                        stackOut_22_0 = (vc) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = ((pm) this).field_j;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_24_0 = (vc) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3 + (param2.field_j + (param3 + param0.field_n));
                      stackOut_24_4 = -param0.field_h + (param2.field_g - param0.field_o);
                      stackOut_24_5 = param2.field_f - (param0.field_n + param0.field_m);
                      stackOut_24_6 = ((pm) this).field_a;
                      stackOut_24_7 = ((pm) this).field_f;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackIn_26_3 = stackOut_24_3;
                      stackIn_26_4 = stackOut_24_4;
                      stackIn_26_5 = stackOut_24_5;
                      stackIn_26_6 = stackOut_24_6;
                      stackIn_26_7 = stackOut_24_7;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      if (-2147483648 != ((pm) this).field_e) {
                        stackOut_26_0 = (vc) (Object) stackIn_26_0;
                        stackOut_26_1 = (String) (Object) stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = stackIn_26_4;
                        stackOut_26_5 = stackIn_26_5;
                        stackOut_26_6 = stackIn_26_6;
                        stackOut_26_7 = stackIn_26_7;
                        stackOut_26_8 = ((pm) this).field_e;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        stackIn_27_3 = stackOut_26_3;
                        stackIn_27_4 = stackOut_26_4;
                        stackIn_27_5 = stackOut_26_5;
                        stackIn_27_6 = stackOut_26_6;
                        stackIn_27_7 = stackOut_26_7;
                        stackIn_27_8 = stackOut_26_8;
                        break L9;
                      } else {
                        stackOut_25_0 = (vc) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3;
                        stackOut_25_4 = stackIn_25_4;
                        stackOut_25_5 = stackIn_25_5;
                        stackOut_25_6 = stackIn_25_6;
                        stackOut_25_7 = stackIn_25_7;
                        stackOut_25_8 = 256;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        stackIn_27_3 = stackOut_25_3;
                        stackIn_27_4 = stackOut_25_4;
                        stackIn_27_5 = stackOut_25_5;
                        stackIn_27_6 = stackOut_25_6;
                        stackIn_27_7 = stackOut_25_7;
                        stackIn_27_8 = stackOut_25_8;
                        break L9;
                      }
                    }
                    int discarded$1 = ((vc) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param0.field_i, param0.field_a, param0.field_j);
                    break L6;
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
          L10: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("pm.J(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final pm d(int param0, int param1) {
        ((pm) this).field_j = param1;
        if (param0 > -44) {
            ((pm) this).field_h = null;
            return (pm) this;
        }
        return (pm) this;
    }

    final void a(pm param0, int param1) {
        try {
            param0.field_a = ((pm) this).field_a;
            param0.field_f = ((pm) this).field_f;
            param0.field_j = ((pm) this).field_j;
            if (param1 >= -46) {
                ((pm) this).field_i = -26;
            }
            param0.field_e = ((pm) this).field_e;
            param0.field_h = ((pm) this).field_h;
            param0.field_k = ((pm) this).field_k;
            param0.field_i = ((pm) this).field_i;
            param0.field_g = ((pm) this).field_g;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pm.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(fk param0, int param1, int param2, qm param3, int param4, pm param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              var7_int = 16 / ((72 - param2) / 54);
              if (((pm) this).field_g) {
                param5.a(param0, param4, param3, param1, 62);
                param5.a(0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 <= ((pm) this).field_f) {
                param5.field_f = ((pm) this).field_f;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2147483648 == ((pm) this).field_j) {
                break L3;
              } else {
                param5.field_j = ((pm) this).field_j;
                break L3;
              }
            }
            L4: {
              if (((pm) this).field_a >= -1) {
                param5.field_a = ((pm) this).field_a;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((pm) this).field_e != -2147483648) {
                param5.field_e = ((pm) this).field_e;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((pm) this).field_i == -2147483648) {
                break L6;
              } else {
                param5.field_i = ((pm) this).field_i;
                break L6;
              }
            }
            L7: {
              if (((pm) this).field_h != null) {
                param5.field_h = ((pm) this).field_h;
                break L7;
              } else {
                break L7;
              }
            }
            if (null != ((pm) this).field_k) {
              param5.field_k = ((pm) this).field_k;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("pm.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param4).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final pm b(int param0, int param1) {
        ((pm) this).field_a = param0;
        if (param1 > -19) {
            ((pm) this).field_g = true;
            return (pm) this;
        }
        return (pm) this;
    }

    pm() {
        ((pm) this).field_g = false;
        ((pm) this).field_e = -2147483648;
        ((pm) this).field_k = null;
        ((pm) this).field_j = -2147483648;
        ((pm) this).field_a = -2;
        ((pm) this).field_i = -2147483648;
        ((pm) this).field_h = null;
        ((pm) this).field_f = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new wb();
    }
}
