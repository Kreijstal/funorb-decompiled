/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends gn {
    private boolean field_j;
    private int field_e;
    private int field_i;
    private String field_f;
    static int field_h;
    private int field_g;

    final static void a(int param0, int param1, ni param2) {
        ml var3 = null;
        try {
            var3 = or.field_d;
            var3.b(3, (byte) 73);
            var3.a(115, 5);
            var3.a(118, 0);
            var3.g(-1207444472, param2.field_o);
            var3.a(116, param2.field_g);
            var3.a(102, param2.field_j);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gv.B(" + 3 + 44 + 112 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1) {
        int var3 = -121 / ((37 - param0) / 47);
        if (((gv) this).field_g == 0) {
            return;
        }
        int var4 = al.a(true, (byte) -120);
        on.a(95, param1 - -1, ((gv) this).field_e, 17, 6, 0, var4 * ((gv) this).field_g >> 8);
        if (256 != ((gv) this).field_g) {
            cq.field_e.b(((gv) this).field_f, 107, -4 + (18 + param1), 16777215, -1, ((gv) this).field_g);
        } else {
            cq.field_e.a(((gv) this).field_f, 107, -4 + (param1 - -18), 16777215, -1);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 != 0) {
            ((gv) this).field_g = 22;
        }
        if (!(!((gv) this).field_j)) {
            ((gv) this).field_g = 256;
            return;
        }
        if (((gv) this).field_i >= 600) {
            ((gv) this).field_g = 0;
            return;
        }
        ((gv) this).field_i = ((gv) this).field_i + 1;
        if (500 >= ((gv) this).field_i) {
        } else {
            var2 = 100 - ((gv) this).field_i + 500;
            if (0 <= var2) {
                ((gv) this).field_g = (var2 << 8) / 100;
            } else {
                ((gv) this).field_g = 0;
            }
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (!hw.a(param1, -26200, false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.length()) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (!jw.a(param1.charAt(var3_int), 160)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("gv.D(").append(0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 41);
        }
        return stackIn_13_0 != 0;
    }

    gv(String param0, boolean param1) {
        int var3_int = 0;
        try {
            ((gv) this).field_g = 256;
            ((gv) this).field_j = param1 ? true : false;
            ((gv) this).field_f = param0;
            ((gv) this).field_i = ((gv) this).field_j ? 500 : 0;
            var3_int = 20 + cq.field_e.a(((gv) this).field_f);
            ((gv) this).field_e = Math.max(400, var3_int);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
