/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    String field_a;
    String field_b;
    boolean field_e;
    static ph field_g;
    static tg[] field_c;
    static int field_d;
    static int[] field_f;

    final static ef a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ef var5 = null;
            ib var5_ref = null;
            Object stackIn_2_0 = null;
            ef stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            ef stackOut_3_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                var4 = Class.forName("gb");
                var5 = (ef) var4.newInstance();
                if (param3 == 41) {
                  var5.a(param0, (byte) -102, param1, param2);
                  stackOut_3_0 = (ef) var5;
                  stackIn_4_0 = stackOut_3_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (ef) (Object) stackIn_2_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ib();
              ((ef) (Object) var5_ref).a(param0, (byte) -126, param1, param2);
              return (ef) (Object) var5_ref;
            }
            return stackIn_4_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Bounce.field_N;
        int var2 = 70 % ((37 - param0) / 51);
        int var1 = ja.field_c[0];
        for (var3 = 1; ja.field_c.length > var3; var3++) {
            var4 = ja.field_c[var3];
            cb.a(lb.field_c, var3 << 62771140, lb.field_c, var1, var4);
            var1 = var1 + var4;
        }
    }

    public static void b(int param0) {
        if (param0 != 62771140) {
          field_d = -128;
          field_f = null;
          field_g = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ph("usename");
    }
}
