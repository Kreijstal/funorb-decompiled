/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wgb extends eca {
    static boolean field_g;
    static String field_h;
    static anb field_i;
    static int field_f;

    final qrb a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        qrb stackIn_2_0 = null;
        qrb stackIn_7_0 = null;
        qrb stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qrb stackOut_10_0 = null;
        qrb stackOut_6_0 = null;
        qrb stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (hwa.a(var4, param1 ^ 16394)) {
              L1: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = lob.a(-73, var5);
                if (var3_int <= 0) {
                  break L1;
                } else {
                  if (-131 <= (var3_int ^ -1)) {
                    L2: {
                      if (param1 == 16384) {
                        break L2;
                      } else {
                        wgb.a(-0.8688769340515137f, 0.8470385074615479f, 1.5502856969833374f, 23, 0.4921734631061554f, 0.5438073873519897f, -1.1896488666534424f);
                        break L2;
                      }
                    }
                    stackOut_10_0 = lea.field_o;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_6_0 = cca.field_o;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = cca.field_o;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("wgb.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void f(int param0) {
        if (param0 <= 64) {
            wgb.f(53);
            field_i = null;
            field_h = null;
            return;
        }
        field_i = null;
        field_h = null;
    }

    wgb(uf param0) {
        super(param0);
    }

    final String b(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
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
            if (param1 == -1) {
              if (this.a(param0, 16384) == cca.field_o) {
                stackOut_5_0 = gra.field_p;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("wgb.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(float param0, float param1, float param2, int param3, float param4, float param5, float param6) {
        if (vjb.field_b != null) {
          vjb.field_b.d(param0);
          vjb.field_b.c(param4);
          vjb.field_b.b(param2);
          if (param3 != -131) {
            field_h = (String) null;
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          } else {
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          }
        } else {
          vjb.field_b = new sfb(kpb.field_q);
          aaa.field_b.a(vjb.field_b);
          vjb.field_b.d(param0);
          vjb.field_b.c(param4);
          vjb.field_b.b(param2);
          if (param3 == -131) {
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          } else {
            field_h = (String) null;
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          }
        }
    }

    static {
        field_h = "Butterfly chassis";
        field_g = false;
        field_i = null;
    }
}
