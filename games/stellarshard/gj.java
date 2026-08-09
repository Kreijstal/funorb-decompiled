/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gj extends ah {
    static int field_v;
    int field_u;
    static gd field_r;
    static int[] field_w;
    static String field_s;
    static int field_t;

    public static void d(byte param0) {
        int var1 = 82 / ((param0 - 55) / 58);
        field_r = null;
        field_w = null;
        field_s = null;
    }

    final static ml a(boolean param0, String[] param1) {
        ml var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        ml stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var3 = (String[]) null;
                gj.a(false, (String[]) null);
                break L1;
              }
            }
            var2 = new ml(false);
            var2.field_d = param1;
            stackIn_3_0 = (ml) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("gj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(qe param0, int param1, boolean param2, qe param3) {
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              var4_int = param3.c((byte) 48);
              if (param1 == 0) {
                break L1;
              } else {
                gj.d((byte) -22);
                break L1;
              }
            }
            L2: {
              var5 = param0.c((byte) 39);
              if (param0.field_a + (double)var5 <= param3.field_a - (double)var4_int) {
                break L2;
              } else {
                if (param3.field_a + (double)var4_int <= param0.field_a - (double)var5) {
                  break L2;
                } else {
                  if (param3.field_l - (double)var4_int >= (double)var5 + param0.field_l) {
                    break L2;
                  } else {
                    if (param0.field_l - (double)var5 >= param3.field_l + (double)var4_int) {
                      break L2;
                    } else {
                      if (param2) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (!dk.a(param3.b(640), (int)param3.field_a, (int)param3.field_l, param0.b(640), (int)param0.field_a, (int)param0.field_l)) {
                          break L2;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_12_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("gj.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    abstract boolean f(int param0);

    abstract Object e(int param0);

    gj(int param0) {
        this.field_u = param0;
    }

    static {
        field_v = 0;
        field_s = "Reload game";
    }
}
