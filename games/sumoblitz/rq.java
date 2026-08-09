/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rq {
    static String field_a;
    static boolean field_d;
    static ri field_c;
    aw field_b;

    void b(int param0) {
        int var2 = -35 / ((param0 - 41) / 46);
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == wd.field_e) {
          if (param0) {
            rq.c(106);
            return;
          } else {
            return;
          }
        } else {
          var1 = wd.field_e;
          synchronized (var1) {
            L0: {
              wd.field_e = null;
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              rq.c(106);
              break L1;
            }
          }
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void c(int param0) {
        field_c = null;
        field_a = null;
        if (param0 >= -99) {
            field_c = (ri) null;
        }
    }

    abstract void a(boolean param0, int param1);

    abstract void c(boolean param0);

    void c(byte param0) {
        if (param0 <= 0) {
            this.a((byte) -128);
        }
    }

    void a(int param0) {
        if (param0 != 260) {
            this.c((byte) -26);
        }
    }

    abstract void a(int param0, int param1, ed param2);

    void a(byte param0) {
        if (param0 >= -47) {
            this.c((byte) 119);
        }
    }

    rq(aw param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "rq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, tg param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -9267) {
                break L1;
              } else {
                rq.c(38);
                break L1;
              }
            }
            if (param1 != lf.field_e) {
              if (param1 == vi.field_v) {
                stackIn_16_0 = 8448;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                if (param1 != ua.field_n) {
                  if (cv.field_F == param1) {
                    stackIn_14_0 = 260;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (bj.field_c != param1) {
                      throw new IllegalArgumentException();
                    } else {
                      stackIn_12_0 = 34023;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = 34165;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = 7681;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("rq.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                return stackIn_16_0;
              }
            }
          }
        }
    }

    final static ne[] a(String param0, ki param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ne[] stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 28) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var4_int = param1.a(0, param3);
            var5 = param1.a(var4_int, param0, (byte) 127);
            stackIn_3_0 = kk.a(var4_int, -1, var5, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rq.S(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    void b(boolean param0) {
        if (param0) {
            field_c = (ri) null;
        }
    }

    abstract boolean b(byte param0);

    abstract void a(boolean param0, byte param1);

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
