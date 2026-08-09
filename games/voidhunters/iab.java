/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iab implements nka {
    static oe field_a;

    public static void a(int param0) {
        if (param0 != 2) {
            field_a = (oe) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2) {
        int var4 = 103 / ((22 - param0) / 42);
        pab.a(param2, param1, (byte) -95);
    }

    final static String a(int param0, String param1, String param2, byte param3) {
        RuntimeException var4 = null;
        faa var5 = null;
        int var6 = 0;
        vu var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = (CharSequence) ((Object) param2);
            if (!mn.a(var8, (byte) -114)) {
              stackIn_3_0 = tjb.field_Cb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (2 == iwa.field_b) {
                var7 = nf.a(param1, false);
                if (var7 == null) {
                  stackIn_10_0 = isa.a(mr.field_L, new String[]{param1}, 122);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    var7.b(param3 ^ 3918);
                    var7.d((byte) -35);
                    mq.field_k = mq.field_k - 1;
                    var5 = dpa.field_p;
                    if (param3 == -76) {
                      break L1;
                    } else {
                      iab.a(76);
                      break L1;
                    }
                  }
                  var5.h(24335, param0);
                  var5.field_e = var5.field_e + 1;
                  var6 = var5.field_e;
                  var5.c(param3 ^ -76, 3);
                  var5.a(true, param2);
                  var5.e(var5.field_e + -var6, param3 + -53);
                  stackIn_14_0 = null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = nf.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("iab.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (String) ((Object) stackIn_14_0);
            }
          }
        }
    }

    static {
        field_a = new oe();
    }
}
