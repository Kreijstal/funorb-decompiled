/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kp extends ms {
    static int field_n;
    private String field_l;
    static String[] field_o;
    static int field_j;
    static int field_i;
    private long field_p;
    static int[] field_k;
    static bi field_m;

    public static void b(byte param0) {
        field_o = null;
        field_k = null;
        if (param0 > -44) {
            return;
        }
        field_m = null;
    }

    final static boolean a(byte param0, ln param1, ln param2, int param3, ln param4) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        ln var11 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_A + -param3 <= param4.field_A) {
                  break L2;
                } else {
                  if (param2.field_A < param1.field_A + -param3) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param4.field_A <= param3 + param1.field_A) {
                  break L3;
                } else {
                  if (param1.field_A + param3 < param2.field_A) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              var5_int = param2.field_A - param4.field_A;
              var6 = param2.field_S + -param4.field_S;
              if (var5_int == 0) {
                L4: {
                  if (-param4.field_A + param1.field_A <= param3) {
                    stackIn_13_0 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = 1;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (0 == var6) {
                  L5: {
                    if (param3 >= param1.field_S - param4.field_S) {
                      stackIn_19_0 = 0;
                      break L5;
                    } else {
                      stackIn_19_0 = 1;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L6: {
                    if (param0 >= 88) {
                      break L6;
                    } else {
                      var11 = (ln) null;
                      kp.a((byte) 115, (ln) null, (ln) null, -109, (ln) null);
                      break L6;
                    }
                  }
                  L7: {
                    var7 = Math.sqrt((double)(var6 * var6 + var5_int * var5_int));
                    var9 = (double)(-((param1.field_S - param4.field_S) * var5_int) + (param1.field_A + -param4.field_A) * var6) / var7;
                    if (param3 >= (int)var9) {
                      stackIn_25_0 = 0;
                      break L7;
                    } else {
                      stackIn_25_0 = 1;
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            stackIn_7_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("kp.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_25_0 != 0;
            }
          }
        }
    }

    final static void c(int param0) {
        ce.a(kq.f((byte) 126), true);
        if (param0 != -1) {
            field_n = 16;
        }
    }

    ds a(byte param0) {
        int var2 = 46 % ((param0 - -7) / 41);
        return oi.field_b;
    }

    final void a(ob param0, byte param1) {
        try {
            param0.b(-16426, this.field_p);
            param0.b((byte) -120, this.field_l);
            if (param1 <= 67) {
                kp.b((byte) -120);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    kp(long param0, String param1) {
        try {
            this.field_l = param1;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = -1;
    }
}
