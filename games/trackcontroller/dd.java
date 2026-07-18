/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dd extends ic {
    static int field_o;
    static String field_p;

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                fc.a(param1.field_x, param2 + param1.field_m, param1.field_u, (byte) -22, param1.field_p + param4);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, param3, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("dd.L(").append(param0).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    dd(oh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static boolean c(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 >= 6) {
                break L1;
              } else {
                dd.b(30);
                break L1;
              }
            }
            stackOut_3_0 = ij.field_d.a(-119);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "dd.K(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static nj d(byte param0) {
        RuntimeException var1 = null;
        Object stackIn_6_0 = null;
        nj stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        nj stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        try {
          L0: {
            if (hf.field_f == fd.field_h) {
              throw new IllegalStateException();
            } else {
              if (param0 > 82) {
                if (fd.field_h != cj.field_e) {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  fd.field_h = hf.field_f;
                  stackOut_8_0 = h.field_c;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (nj) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "dd.N(" + param0 + ')');
        }
        return (nj) (Object) stackIn_11_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -3674) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "dd.M(" + param0 + ')');
        }
    }

    dd(int param0) {
        this(gk.field_c, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
