/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_i;
    nh[] field_c;
    nh field_e;
    static int[] field_b;
    static int[][] field_f;
    static int field_a;
    private int field_d;
    private boolean field_j;
    private int field_k;
    static he[] field_g;
    private int field_l;
    private int field_h;

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < ni.field_t) {
                  break L1;
                } else {
                  if (param0.length() > uk.field_g) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("kj.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 59 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final kj a(int param0, int param1) {
        ((kj) this).field_l = param1;
        if (param0 != -4130) {
            Object var4 = null;
            ((kj) this).a((byte) 61, (kj) null);
            return (kj) this;
        }
        return (kj) this;
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 14970) {
            kj.a(89);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(byte param0, kj param1) {
        try {
            param1.field_h = ((kj) this).field_h;
            if (param0 != -7) {
                field_a = -35;
            }
            param1.field_j = ((kj) this).field_j;
            param1.field_l = ((kj) this).field_l;
            param1.field_k = ((kj) this).field_k;
            param1.field_c = ((kj) this).field_c;
            param1.field_i = ((kj) this).field_i;
            param1.field_d = ((kj) this).field_d;
            param1.field_e = ((kj) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "kj.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final kj b(int param0, int param1) {
        if (param0 != 256) {
            return null;
        }
        ((kj) this).field_h = param1;
        return (kj) this;
    }

    final kj a(nh[] param0, int param1) {
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
            if (param1 < -47) {
              ((kj) this).field_c = param0;
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kj.F(");
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
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return (kj) this;
    }

    final kj a(byte param0, int param1) {
        ((kj) this).field_i = param1;
        if (param0 < 65) {
            return null;
        }
        return (kj) this;
    }

    final kj a(byte param0, boolean param1) {
        Object var4 = null;
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
        if (param0 <= 84) {
          L0: {
            var4 = null;
            og discarded$6 = kj.a(13, 21, (String) null);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
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
          ((kj) this).field_j = stackIn_8_1 != 0;
          return (kj) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
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
          ((kj) this).field_j = stackIn_4_1 != 0;
          return (kj) this;
        }
    }

    final void a(int param0, ch param1, boolean param2, int param3, vg param4, kj param5) {
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
              if (!((kj) this).field_j) {
                break L1;
              } else {
                param5.a(param1, param4, true, param3, param0);
                param5.b(0);
                break L1;
              }
            }
            L2: {
              if (((kj) this).field_c == null) {
                break L2;
              } else {
                param5.field_c = ((kj) this).field_c;
                break L2;
              }
            }
            L3: {
              if (((kj) this).field_l == -2147483648) {
                break L3;
              } else {
                param5.field_l = ((kj) this).field_l;
                break L3;
              }
            }
            L4: {
              if (((kj) this).field_i == -2147483648) {
                break L4;
              } else {
                param5.field_i = ((kj) this).field_i;
                break L4;
              }
            }
            L5: {
              if (((kj) this).field_d != -2147483648) {
                param5.field_d = ((kj) this).field_d;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((kj) this).field_e != null) {
                param5.field_e = ((kj) this).field_e;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param2) {
                break L7;
              } else {
                kj.a(13);
                break L7;
              }
            }
            L8: {
              if (((kj) this).field_k < -1) {
                break L8;
              } else {
                param5.field_k = ((kj) this).field_k;
                break L8;
              }
            }
            if (((kj) this).field_h < -1) {
              break L0;
            } else {
              param5.field_h = ((kj) this).field_h;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("kj.J(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
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
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
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
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final static og a(int param0, int param1, String param2) {
        og var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        og stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        og stackOut_3_0 = null;
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
            if (param1 == 4) {
              var3 = new og(false);
              var3.field_g = param2;
              var3.field_a = param0;
              stackOut_3_0 = (og) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (og) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("kj.K(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final void b(int param0) {
        ((kj) this).field_k = -1;
        ((kj) this).field_c = null;
        ((kj) this).field_h = param0;
        ((kj) this).field_d = 256;
        ((kj) this).field_e = null;
        ((kj) this).field_l = 0;
        ((kj) this).field_i = 0;
    }

    final kj c(int param0, int param1) {
        ((kj) this).field_k = param0;
        if (param1 < 13) {
            return null;
        }
        return (kj) this;
    }

    final void a(ch param0, vg param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        rf stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        rf stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        rf stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        rf stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        rf stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        rf stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        rf stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        rf stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        rf stackIn_27_0 = null;
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
        rf stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        rf stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        rf stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        rf stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        rf stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        rf stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        rf stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        rf stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        rf stackOut_25_0 = null;
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
              am.a(param1.field_m + param3, param1.field_k, param1.field_w, ((kj) this).field_c, 14673, param4 - -param1.field_o);
              if (null != ((kj) this).field_e) {
                L2: {
                  var6_int = param1.field_o + param4 - -((kj) this).field_i;
                  var7 = param3 + (param1.field_m + ((kj) this).field_l);
                  if (param0.field_p != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param1.field_w + -((kj) this).field_e.field_z) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (-3 == param0.field_p) {
                    var6_int = var6_int + (-((kj) this).field_e.field_z + param1.field_w);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-2 != param0.field_c) {
                    break L4;
                  } else {
                    var7 = var7 + (param1.field_k + -((kj) this).field_e.field_C) / 2;
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_c != 2) {
                    break L5;
                  } else {
                    var7 = var7 + (param1.field_k + -((kj) this).field_e.field_C);
                    break L5;
                  }
                }
                ((kj) this).field_e.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param2) {
                break L6;
              } else {
                ((kj) this).field_e = null;
                break L6;
              }
            }
            L7: {
              var6_ref = param0.b(-121, param1);
              if (var6_ref == null) {
                break L7;
              } else {
                if (param0.field_g == null) {
                  break L7;
                } else {
                  if (((kj) this).field_h >= 0) {
                    L8: {
                      stackOut_18_0 = param0.field_g;
                      stackOut_18_1 = (String) var6_ref;
                      stackOut_18_2 = param0.field_j + param4;
                      stackOut_18_3 = param1.field_o;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      if (((kj) this).field_i == -2147483648) {
                        stackOut_20_0 = (rf) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        break L8;
                      } else {
                        stackOut_19_0 = (rf) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = stackIn_19_3;
                        stackOut_19_4 = ((kj) this).field_i;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        stackIn_21_4 = stackOut_19_4;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_21_0 = (rf) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2 + (stackIn_21_3 - -stackIn_21_4);
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      if (((kj) this).field_l != -2147483648) {
                        stackOut_23_0 = (rf) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = ((kj) this).field_l;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        break L9;
                      } else {
                        stackOut_22_0 = (rf) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = 0;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_24_0 = (rf) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3 + (param1.field_m + param3) + param0.field_d;
                      stackOut_24_4 = -param0.field_j + param1.field_w - param0.field_k;
                      stackOut_24_5 = -param0.field_m + (param1.field_k + -param0.field_d);
                      stackOut_24_6 = ((kj) this).field_h;
                      stackOut_24_7 = ((kj) this).field_k;
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
                      if (((kj) this).field_d != -2147483648) {
                        stackOut_26_0 = (rf) (Object) stackIn_26_0;
                        stackOut_26_1 = (String) (Object) stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = stackIn_26_4;
                        stackOut_26_5 = stackIn_26_5;
                        stackOut_26_6 = stackIn_26_6;
                        stackOut_26_7 = stackIn_26_7;
                        stackOut_26_8 = ((kj) this).field_d;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        stackIn_27_3 = stackOut_26_3;
                        stackIn_27_4 = stackOut_26_4;
                        stackIn_27_5 = stackOut_26_5;
                        stackIn_27_6 = stackOut_26_6;
                        stackIn_27_7 = stackOut_26_7;
                        stackIn_27_8 = stackOut_26_8;
                        break L10;
                      } else {
                        stackOut_25_0 = (rf) (Object) stackIn_25_0;
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
                        break L10;
                      }
                    }
                    int discarded$1 = ((rf) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param0.field_p, param0.field_c, param0.field_a);
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
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("kj.G(");
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
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kj() {
        ((kj) this).field_i = -2147483648;
        ((kj) this).field_e = null;
        ((kj) this).field_k = -2;
        ((kj) this).field_j = false;
        ((kj) this).field_d = -2147483648;
        ((kj) this).field_c = null;
        ((kj) this).field_l = -2147483648;
        ((kj) this).field_h = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[13];
        field_f = new int[][]{new int[9], new int[1], new int[1], new int[3], new int[1], new int[1], new int[3], new int[1], new int[1]};
        field_b[7] = 200;
        field_b[0] = 200;
        field_b[5] = 200;
        field_b[8] = 200;
        field_b[1] = 200;
        field_b[2] = 180;
        field_b[3] = 80;
        field_b[9] = 100;
        field_b[11] = 200;
        field_b[4] = 200;
        field_b[6] = 200;
        field_b[10] = 200;
    }
}
