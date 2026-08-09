/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends bw {
    static sna field_g;
    int field_j;
    static String field_i;
    static int field_h;
    int field_f;

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -21) {
            field_g = (sna) null;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3 = lk.a(param1, param0, (byte) -53);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = param2;
              L1: while (true) {
                if (param1.length() > var4) {
                  if (vu.a((byte) 118, param1.charAt(var4))) {
                    var4++;
                    continue L1;
                  } else {
                    stackIn_10_0 = fha.field_k;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("mc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_10_0;
        }
    }

    mc(int param0, int param1) {
        this.field_f = param0;
        this.field_j = param1;
    }

    static {
        field_i = "Accept";
        field_h = 0;
    }
}
