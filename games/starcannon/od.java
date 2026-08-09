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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("od.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = jj.a(var5_int, param1, var6, (byte) -124, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("od.M(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
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
                  stackIn_59_0 = 0;
                  break L2;
                } else {
                  stackIn_59_0 = 7;
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
                  stackIn_45_0 = 0;
                  break L5;
                } else {
                  stackIn_45_0 = 7;
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
                  stackIn_29_0 = 0;
                  break L8;
                } else {
                  stackIn_29_0 = 7;
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
                  stackIn_14_0 = 0;
                  break L11;
                } else {
                  stackIn_14_0 = 7;
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
