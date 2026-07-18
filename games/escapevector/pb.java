/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static char[] field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_c;
    static wl field_e;

    final static int a(byte param0, dk[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = -2147483648;
            var3 = param1;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                if (var2_int == -2147483648) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  stackOut_15_0 = var2_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                }
              } else {
                L2: {
                  var5 = var3[var4];
                  var6 = var5.field_i + var5.field_l;
                  if (var2_int >= var6) {
                    var4++;
                    break L2;
                  } else {
                    var2_int = var6;
                    var4++;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("pb.B(").append(2).append(',');
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
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        ll.a(70, 8, param0 ^ 12, am.field_k);
        if (am.field_k < 95) {
          if (param0 != 4) {
            field_b = -65;
            return;
          } else {
            return;
          }
        } else {
          if (am.field_k >= 110) {
            dg.field_t.e((640 + -dg.field_t.field_A) / 2, fg.field_b);
            if (param0 == 4) {
              return;
            } else {
              field_b = -65;
              return;
            }
          } else {
            mf.a(fg.field_b, (-dg.field_t.field_A + 640) / 2, -(am.field_k * 4) + 440, dg.field_t, -122);
            if (param0 == 4) {
              return;
            } else {
              field_b = -65;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_b = 0;
    }
}
