/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends pe {
    static String field_q;
    private Object field_s;
    static hb[] field_p;
    static int[] field_r;

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          int discarded$2 = 44;
          ei.a(param1);
          nf.a(false, ab.field_p, -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("tk.D(").append(-15).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        rk var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_13_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param2 != null) {
            L0: {
              if (param0 <= -39) {
                break L0;
              } else {
                tk.i(92);
                break L0;
              }
            }
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (param1) {
                stackOut_10_0 = na.a(-12, var3);
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_8_0 = (byte[]) var3;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              if (!(param2 instanceof rk)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (rk) param2;
                stackOut_13_0 = var4.a(31);
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("tk.E(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final static boolean c(boolean param0) {
        if (param0) {
            return false;
        }
        return d.field_b.a((byte) -127);
    }

    tk(Object param0, int param1) {
        super(param1);
        try {
            ((tk) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "tk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static qc a(int param0, int param1, int[] param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        qc var9 = null;
        RuntimeException var9_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var9 = new qc(15, 65520, param0, param7, param5, param8, param2);
          sb.field_c.a((gg) (Object) var9, -7044);
          ah.a(false, 3, var9);
          return var9;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("tk.B(").append(param0).append(44).append(15).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 65520 + 44 + 3 + 44 + param5 + 44 + -115 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void i(int param0) {
        field_p = null;
        field_r = null;
        if (param0 <= 107) {
            boolean discarded$0 = tk.c(true);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final boolean g(int param0) {
        if (param0 < 110) {
            Object discarded$0 = ((tk) this).h(-105);
            return false;
        }
        return false;
    }

    final Object h(int param0) {
        if (param0 != 31476) {
            ((tk) this).field_s = null;
            return ((tk) this).field_s;
        }
        return ((tk) this).field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_q = "From only <%0>/month";
    }
}
