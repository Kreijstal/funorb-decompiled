/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends hh {
    private String field_e;
    private long field_g;
    static int field_i;
    static ge field_f;
    static int[] field_h;

    final static boolean a(int param0, ia param1) {
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
        int stackOut_3_0 = 0;
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
              if (param0 == -2) {
                break L1;
              } else {
                od.c((byte) -112);
                break L1;
              }
            }
            L2: {
              if (1 != param1.e(8, 1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("od.J(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static lk a(String param0, ue param1, String param2, int param3, ue param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                field_h = (int[]) null;
                break L1;
              }
            }
            var5_int = param1.a(param0, false);
            var6 = param1.a(param2, true, var5_int);
            stackOut_2_0 = jj.a(var5_int, param1, var6, (byte) -124, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("od.M(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, rb param1) {
        try {
            if (param0 != 69) {
                this.field_e = (String) null;
            }
            param1.a(true, this.field_g);
            param1.a((byte) -86, this.field_e);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "od.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 69) {
            return;
        }
        field_f = null;
        field_h = null;
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_14_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (param0 <= -97) {
          cd.field_c = 0;
          pa.field_L = param1;
          if (StarCannon.field_z != -1) {
            L0: {
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L1;
              } else {
                break L1;
              }
            }
            if ((param1 ^ -1) == -2) {
              L2: {
                if (-1 > (u.field_d ^ -1)) {
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  break L2;
                } else {
                  stackOut_57_0 = 7;
                  stackIn_59_0 = stackOut_57_0;
                  break L2;
                }
              }
              lf.field_cb = stackIn_59_0;
              if (7 == lf.field_cb) {
                ij.a(0, true);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              cd.field_c = 25;
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L4;
              } else {
                break L4;
              }
            }
            if ((param1 ^ -1) == -2) {
              L5: {
                if (-1 > (u.field_d ^ -1)) {
                  stackOut_44_0 = 0;
                  stackIn_45_0 = stackOut_44_0;
                  break L5;
                } else {
                  stackOut_43_0 = 7;
                  stackIn_45_0 = stackOut_43_0;
                  break L5;
                }
              }
              lf.field_cb = stackIn_45_0;
              if (7 == lf.field_cb) {
                ij.a(0, true);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_i = -12;
          cd.field_c = 0;
          pa.field_L = param1;
          if (StarCannon.field_z == -1) {
            L6: {
              cd.field_c = 25;
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L7;
              } else {
                break L7;
              }
            }
            if ((param1 ^ -1) == -2) {
              L8: {
                if (-1 > (u.field_d ^ -1)) {
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L8;
                } else {
                  stackOut_27_0 = 7;
                  stackIn_29_0 = stackOut_27_0;
                  break L8;
                }
              }
              lf.field_cb = stackIn_29_0;
              if (7 != lf.field_cb) {
                return;
              } else {
                ij.a(0, true);
                return;
              }
            } else {
              return;
            }
          } else {
            L9: {
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L10;
              } else {
                break L10;
              }
            }
            if ((param1 ^ -1) == -2) {
              L11: {
                if (-1 > (u.field_d ^ -1)) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L11;
                } else {
                  stackOut_12_0 = 7;
                  stackIn_14_0 = stackOut_12_0;
                  break L11;
                }
              }
              lf.field_cb = stackIn_14_0;
              if (7 != lf.field_cb) {
                return;
              } else {
                ij.a(0, true);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void c(byte param0) {
        fb.field_c = null;
        se.field_n = null;
        rd.field_q = null;
        m.field_c = false;
        ri.field_b = null;
        if (param0 != 104) {
            od.a(-82, 126, false);
        }
    }

    od(long param0, String param1) {
        try {
            this.field_e = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "od.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    s b(byte param0) {
        if (param0 != 1) {
            return (s) null;
        }
        return na.field_b;
    }

    static {
        field_f = new ge();
    }
}
