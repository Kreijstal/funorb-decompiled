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
        dj var4 = null;
        if (param1 != null) {
          if (param1 instanceof byte[]) {
            var3 = (byte[]) param1;
            if (!param2) {
              return var3;
            } else {
              return vg.a(var3, -110);
            }
          } else {
            if (param0 >= 98) {
              if (param1 instanceof dj) {
                var4 = (dj) param1;
                return var4.a(-21);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static df a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
            int var4 = 0;
            Throwable var5 = null;
            Class var5_ref = null;
            cg var6 = null;
            df var6_ref = null;
            df stackIn_2_0 = null;
            Throwable decompiledCaughtException = null;
            df stackOut_1_0 = null;
            var4 = 63 / ((param1 - 14) / 40);
            try {
              L0: {
                var5_ref = Class.forName("fk");
                var6_ref = (df) var5_ref.newInstance();
                var6_ref.a((byte) 54, param3, param0, param2);
                stackOut_1_0 = (df) var6_ref;
                stackIn_2_0 = stackOut_1_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = decompiledCaughtException;
              var6 = new cg();
              ((df) (Object) var6).a((byte) -9, param3, param0, param2);
              return (df) (Object) var6;
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
