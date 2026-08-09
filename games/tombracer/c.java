/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class c extends vg implements fo {
    static int[] field_g;
    static java.math.BigInteger field_f;
    static String field_h;

    int a(int param0, byte param1) {
        if (param1 != -39) {
            this.h(10);
            return param0;
        }
        return param0;
    }

    abstract boolean h(int param0);

    final static boolean[] a(int param0, boolean[] param1, byte param2, kh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        boolean[] stackIn_12_0 = null;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param3.b((byte) 44, param0);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int != param1.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new boolean[var4_int];
                break L1;
              }
              var5 = 0;
              var6 = 100 / ((16 - param2) / 40);
              L3: while (true) {
                if (var4_int <= var5) {
                  stackIn_12_0 = (boolean[]) (param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param1[var5] = uha.a(5907, param3);
                  var5++;
                  continue L3;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("c.GB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (boolean[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_12_0;
        }
    }

    abstract void a(uw param0, int param1);

    public static void m(int param0) {
        field_g = null;
        field_f = null;
        if (param0 <= 54) {
            return;
        }
        field_h = null;
    }

    abstract void a(int param0, byte param1, int param2, int param3);

    abstract void a(la param0, int param1);

    abstract void a(int param0, boolean param1);

    c() {
    }

    abstract c d(boolean param0);

    static {
        field_g = new int[1024];
        field_h = "Login: ";
        field_f = new java.math.BigInteger("65537");
    }
}
