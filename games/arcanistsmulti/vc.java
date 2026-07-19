/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    private int field_a;
    static dj field_e;
    private int field_m;
    private boolean field_k;
    qb[] field_b;
    static kc field_c;
    static kc field_j;
    static String field_l;
    static String field_f;
    private int field_g;
    qb field_d;
    private int field_i;
    private int field_h;

    final void a(vc param0, boolean param1) {
        try {
            if (param1) {
                this.field_m = -107;
            }
            param0.field_b = this.field_b;
            param0.field_d = this.field_d;
            param0.field_i = this.field_i;
            param0.field_a = this.field_a;
            param0.field_m = this.field_m;
            param0.field_k = this.field_k;
            param0.field_g = this.field_g;
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final vc a(int param0, byte param1) {
        this.field_a = param0;
        if (param1 <= 114) {
            return (vc) null;
        }
        return (vc) (this);
    }

    public static void b(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 202) {
          vc.b(58);
          field_e = null;
          field_c = null;
          field_l = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_l = null;
          return;
        }
    }

    final vc a(boolean param0, int param1) {
        vc discarded$13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != -5859) {
          L0: {
            discarded$13 = this.b(21, 109);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((vc) (this)).field_k = stackIn_8_1 != 0;
          return (vc) (this);
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((vc) (this)).field_k = stackIn_4_1 != 0;
          return (vc) (this);
        }
    }

    final vc a(int param0, int param1) {
        this.field_h = param1;
        int var3 = 122 % ((38 - param0) / 46);
        return (vc) (this);
    }

    final vc a(byte param0, qb[] param1) {
        vc discarded$2 = null;
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              this.field_b = param1;
              if (param0 == -71) {
                break L1;
              } else {
                discarded$2 = this.a(3, 17);
                break L1;
              }
            }
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vc.J(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (vc) (this);
    }

    final void a(int param0) {
        this.field_g = 0;
        this.field_i = 256;
        this.field_a = 0;
        if (param0 != -17238) {
          return;
        } else {
          this.field_b = null;
          this.field_m = 0;
          this.field_d = null;
          this.field_h = -1;
          return;
        }
    }

    final void a(int param0, mj param1, byte param2, qm param3, int param4) {
        int discarded$1 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        String var7 = null;
        int var7_int = 0;
        int var8 = 0;
        dj stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        dj stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        dj stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        dj stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        dj stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        dj stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        dj stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        dj stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        dj stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        dj stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        dj stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        dj stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        dj stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        dj stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        dj stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        dj stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        dj stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              gl.a(param3.field_k, param4 - -param3.field_n, -27327, param3.field_v, this.field_b, param3.field_j + param0);
              var6_int = -37 / ((38 - param2) / 59);
              if (null == this.field_d) {
                break L1;
              } else {
                L2: {
                  var7_int = param3.field_n + param4 - -this.field_g;
                  if (param1.field_i == 1) {
                    var7_int = var7_int + (-this.field_d.field_n + param3.field_v) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var8 = param0 + (param3.field_j + this.field_a);
                  if (2 == param1.field_i) {
                    var7_int = var7_int + (param3.field_v - this.field_d.field_n);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_a == 1) {
                    var8 = var8 + (-this.field_d.field_w + param3.field_k) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_a != 2) {
                    break L5;
                  } else {
                    var8 = var8 + (-this.field_d.field_w + param3.field_k);
                    break L5;
                  }
                }
                this.field_d.c(var7_int, var8);
                break L1;
              }
            }
            L6: {
              var7 = param1.a(false, param3);
              if (var7 == null) {
                break L6;
              } else {
                if (null == param1.field_g) {
                  break L6;
                } else {
                  if ((this.field_m ^ -1) <= -1) {
                    L7: {
                      stackOut_17_0 = param1.field_g;
                      stackOut_17_1 = (String) (var7);
                      stackOut_17_2 = param1.field_m + (param4 - -param3.field_n);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      if ((this.field_g ^ -1) != 2147483647) {
                        stackOut_19_0 = (dj) ((Object) stackIn_19_0);
                        stackOut_19_1 = (String) ((Object) stackIn_19_1);
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = this.field_g;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        stackIn_20_3 = stackOut_19_3;
                        break L7;
                      } else {
                        stackOut_18_0 = (dj) ((Object) stackIn_18_0);
                        stackOut_18_1 = (String) ((Object) stackIn_18_1);
                        stackOut_18_2 = stackIn_18_2;
                        stackOut_18_3 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        stackIn_20_3 = stackOut_18_3;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_20_0 = (dj) ((Object) stackIn_20_0);
                      stackOut_20_1 = (String) ((Object) stackIn_20_1);
                      stackOut_20_2 = stackIn_20_2 + stackIn_20_3;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      if (-2147483648 != this.field_a) {
                        stackOut_22_0 = (dj) ((Object) stackIn_22_0);
                        stackOut_22_1 = (String) ((Object) stackIn_22_1);
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = this.field_a;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        break L8;
                      } else {
                        stackOut_21_0 = (dj) ((Object) stackIn_21_0);
                        stackOut_21_1 = (String) ((Object) stackIn_21_1);
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = 0;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_23_3 = stackOut_21_3;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_23_0 = (dj) ((Object) stackIn_23_0);
                      stackOut_23_1 = (String) ((Object) stackIn_23_1);
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3 + param1.field_f + (param0 + param3.field_j);
                      stackOut_23_4 = -param1.field_l + (-param1.field_m + param3.field_v);
                      stackOut_23_5 = -param1.field_f + param3.field_k + -param1.field_d;
                      stackOut_23_6 = this.field_m;
                      stackOut_23_7 = this.field_h;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      stackIn_25_7 = stackOut_23_7;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      stackIn_24_3 = stackOut_23_3;
                      stackIn_24_4 = stackOut_23_4;
                      stackIn_24_5 = stackOut_23_5;
                      stackIn_24_6 = stackOut_23_6;
                      stackIn_24_7 = stackOut_23_7;
                      if (2147483647 != (this.field_i ^ -1)) {
                        stackOut_25_0 = (dj) ((Object) stackIn_25_0);
                        stackOut_25_1 = (String) ((Object) stackIn_25_1);
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3;
                        stackOut_25_4 = stackIn_25_4;
                        stackOut_25_5 = stackIn_25_5;
                        stackOut_25_6 = stackIn_25_6;
                        stackOut_25_7 = stackIn_25_7;
                        stackOut_25_8 = this.field_i;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        stackIn_26_4 = stackOut_25_4;
                        stackIn_26_5 = stackOut_25_5;
                        stackIn_26_6 = stackOut_25_6;
                        stackIn_26_7 = stackOut_25_7;
                        stackIn_26_8 = stackOut_25_8;
                        break L9;
                      } else {
                        stackOut_24_0 = (dj) ((Object) stackIn_24_0);
                        stackOut_24_1 = (String) ((Object) stackIn_24_1);
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = 256;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        stackIn_26_4 = stackOut_24_4;
                        stackIn_26_5 = stackOut_24_5;
                        stackIn_26_6 = stackOut_24_6;
                        stackIn_26_7 = stackOut_24_7;
                        stackIn_26_8 = stackOut_24_8;
                        break L9;
                      }
                    }
                    discarded$1 = ((dj) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param1.field_i, param1.field_a, param1.field_h);
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
            stackOut_28_0 = (RuntimeException) (var6);
            stackOut_28_1 = new StringBuilder().append("vc.C(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param4 + ')');
        }
    }

    final vc c(int param0, int param1) {
        vc discarded$0 = null;
        if (param0 != -1) {
            discarded$0 = this.a(35, -108);
            this.field_g = param1;
            return (vc) (this);
        }
        this.field_g = param1;
        return (vc) (this);
    }

    final vc b(int param0, int param1) {
        vc discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = this.a(-22, -123);
            this.field_m = param1;
            return (vc) (this);
        }
        this.field_m = param1;
        return (vc) (this);
    }

    final static void a(byte param0) {
        int var1 = (fh.field_g - 640) / 2;
        int var3 = -12 % ((-49 - param0) / 62);
        int var2 = ea.field_F * ea.field_F;
        int var4 = -(ce.field_h * ce.field_h) + var2;
        k.field_d.a(199, -(199 * var4 / var2) + var1, 90, -94 + (-120 + de.field_j), (byte) -120);
        fn.field_e.a(438, 202 + (var1 + 438 * var4 / var2), 0, -120 + de.field_j - 4, (byte) -120);
    }

    final void a(qm param0, int param1, vc param2, mj param3, int param4, int param5) {
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
              if (this.field_k) {
                param2.a(param1, param3, (byte) -62, param0, param5);
                param2.a(-17238);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((this.field_m ^ -1) <= 0) {
                param2.field_m = this.field_m;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_g ^ -1) == 2147483647) {
                break L3;
              } else {
                param2.field_g = this.field_g;
                break L3;
              }
            }
            L4: {
              if ((this.field_h ^ -1) <= 0) {
                param2.field_h = this.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_i ^ -1) != 2147483647) {
                param2.field_i = this.field_i;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == this.field_d) {
                break L6;
              } else {
                param2.field_d = this.field_d;
                break L6;
              }
            }
            L7: {
              if (param4 == this.field_a) {
                break L7;
              } else {
                param2.field_a = this.field_a;
                break L7;
              }
            }
            if (null == this.field_b) {
              break L0;
            } else {
              param2.field_b = this.field_b;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var7);
            stackOut_21_1 = new StringBuilder().append("vc.F(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    vc() {
        this.field_m = -2;
        this.field_k = false;
        this.field_g = -2147483648;
        this.field_a = -2147483648;
        this.field_i = -2147483648;
        this.field_h = -2;
        this.field_d = null;
        this.field_b = null;
    }

    static {
        field_f = "Welcome, young apprentice, to the Grassy Hills training area. Here you will learn the basics of arcane combat for use in the tournament.";
        field_l = "FROM ONLY";
    }
}
