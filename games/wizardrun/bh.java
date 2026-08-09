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
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1 instanceof byte[]) {
                var3 = (byte[]) (param1);
                if (param2) {
                  stackIn_9_0 = vg.a(var3, -110);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_7_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (param0 >= 98) {
                  if (!(param1 instanceof dj)) {
                    throw new IllegalArgumentException();
                  } else {
                    var4 = (dj) (param1);
                    stackIn_15_0 = var4.a(-21);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_12_0 = (byte[]) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("bh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_15_0;
            }
          }
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
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4_int = 63 / ((param1 - 14) / 40);
                try {
                  L1: {
                    var5 = Class.forName("fk");
                    var6 = (df) (var5.newInstance());
                    var6.a((byte) 54, param3, param0, param2);
                    stackIn_2_0 = (df) (var6);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5_ref = decompiledCaughtException;
                  var6_ref = new cg();
                  ((df) ((Object) var6_ref)).a((byte) -9, param3, param0, param2);
                  stackIn_4_0 = (cg) (var6_ref);
                  return (df) ((Object) stackIn_4_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var4);

                stackIn_7_1 = new StringBuilder().append("bh.A(");

                if (param0 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L2;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L2;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        int var1 = -75 / ((param0 - -25) / 37);
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_g = null;
    }

    bh(int param0, int param1, int param2, int param3) {
        this.field_h = param0;
        this.field_f = param3;
    }

    static {
        field_b = new oi();
        field_c = "Click";
        field_a = null;
        field_d = "Passwords must be between 5 and 20 characters long";
    }
}
