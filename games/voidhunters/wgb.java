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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_11_0 = lea.field_o;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_7_0 = cca.field_o;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = cca.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("wgb.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              if (this.a(param0, 16384) == cca.field_o) {
                stackIn_6_0 = gra.field_p;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("wgb.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
