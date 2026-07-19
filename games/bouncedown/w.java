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
            RuntimeException var4_ref2 = null;
            ef var5 = null;
            ib var5_ref = null;
            ef stackIn_2_0 = null;
            ef stackIn_4_0 = null;
            ib stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            ef stackOut_3_0 = null;
            ef stackOut_1_0 = null;
            ib stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("gb");
                    var5 = (ef) (var4.newInstance());
                    if (param3 == 41) {
                      var5.a(param0, (byte) -102, param1, param2);
                      stackOut_3_0 = (ef) (var5);
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_1_0 = (ef) null;
                      stackIn_2_0 = stackOut_1_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new ib();
                  ((ef) ((Object) var5_ref)).a(param0, (byte) -126, param1, param2);
                  stackOut_5_0 = (ib) (var5_ref);
                  stackIn_6_0 = stackOut_5_0;
                  return (ef) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var4_ref2);
                stackOut_7_1 = new StringBuilder().append("w.B(").append(param0).append(',');
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
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var2 = 70 % ((37 - param0) / 51);
            var1_int = ja.field_c[0];
            var3 = 1;
            L1: while (true) {
              if (ja.field_c.length <= var3) {
                break L0;
              } else {
                var4 = ja.field_c[var3];
                cb.a(lb.field_c, var3 << 62771140, lb.field_c, var1_int, var4);
                var1_int = var1_int + var4;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "w.C(" + param0 + ')');
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
        field_g = new ph("usename");
    }
}
