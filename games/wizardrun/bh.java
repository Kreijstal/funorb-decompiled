/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    int field_h;
    int field_f;
    static oi field_b;
    static String field_a;
    static String field_c;
    static String field_g;
    static String field_d;
    static ji field_e;

    final static byte[] a(byte param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_14_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          if (param1 != null) {
            if (param1 instanceof byte[]) {
              var3 = (byte[]) param1;
              if (param2) {
                stackOut_8_0 = vg.a(var3, -110);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_6_0 = (byte[]) var3;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              if (param0 >= 98) {
                if (!(param1 instanceof dj)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (dj) param1;
                  stackOut_14_0 = var4.a(-21);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("bh.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L0;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L0;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static df a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
            int var4_int = 0;
            RuntimeException var4 = null;
            Class var5 = null;
            Throwable var5_ref = null;
            df var6 = null;
            cg var6_ref = null;
            df stackIn_2_0 = null;
            cg stackIn_4_0 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            df stackOut_1_0 = null;
            cg stackOut_3_0 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              var4_int = 63 / ((param1 - 14) / 40);
              try {
                L0: {
                  var5 = Class.forName("fk");
                  var6 = (df) var5.newInstance();
                  var6.a((byte) 54, param3, param0, param2);
                  stackOut_1_0 = (df) var6;
                  stackIn_2_0 = stackOut_1_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref = decompiledCaughtException;
                var6_ref = new cg();
                ((df) (Object) var6_ref).a((byte) -9, param3, param0, param2);
                stackOut_3_0 = (cg) var6_ref;
                stackIn_4_0 = stackOut_3_0;
                return (df) (Object) stackIn_4_0;
              }
              return stackIn_2_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var4;
                stackOut_5_1 = new StringBuilder().append("bh.A(");
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
              throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        int var1 = -75;
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_g = null;
    }

    bh(int param0, int param1, int param2, int param3) {
        ((bh) this).field_h = param0;
        ((bh) this).field_f = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new oi();
        field_c = "Click";
        field_a = null;
        field_d = "Passwords must be between 5 and 20 characters long";
    }
}
