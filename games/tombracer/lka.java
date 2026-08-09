/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lka {
    final static bs a(int param0, kh param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        bs stackIn_2_0 = null;
        gfa stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -8) {
              var3_int = param1.b((byte) 44, 4);
              var4 = var3_int;
              if (-1 != (var4 ^ -1)) {
                System.out.println("Event type unrecognised: " + var3_int);
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = new gfa(param2, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (bs) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lka.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bs) ((Object) stackIn_5_0);
          } else {
            return (bs) ((Object) stackIn_7_0);
          }
        }
    }

    final static void a(byte param0) {
        if (param0 >= -33) {
            lka.a((byte) 116);
            sua.r((byte) 63);
            return;
        }
        sua.r((byte) 63);
    }

    static {
    }
}
