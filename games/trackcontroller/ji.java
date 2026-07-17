/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    int field_c;
    int field_b;
    int field_g;
    int field_f;
    static nh field_a;
    static String field_e;
    static String field_d;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -64) {
            ji.a((byte) 111);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (10 > gl.field_I) {
                L2: {
                  var3_int = 0;
                  if (vh.field_q) {
                    vh.field_q = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                int discarded$5 = 116;
                int discarded$6 = -103;
                fb.a(var3_int != 0, ie.a(122), dg.field_E, ei.a());
                break L1;
              } else {
                if (!ic.a(false)) {
                  ll.a();
                  int discarded$7 = 240;
                  int discarded$8 = -122;
                  int discarded$9 = 320;
                  hi.b();
                  qd.a(param2, 0, 0, 2901);
                  break L1;
                } else {
                  if (rl.field_N == 0) {
                    ki.a(false, 0, param1);
                    qd.a(param2, 0, 0, 2901);
                    break L1;
                  } else {
                    l.a((byte) 85, param2);
                    break L1;
                  }
                }
              }
            }
            var3_int = -49;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ji.B(").append(-128).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nh(2);
        field_e = "Unpacking music";
        field_d = "to keep fullscreen or";
    }
}
