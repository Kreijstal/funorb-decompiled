/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends hg {
    bl field_k;
    int field_i;
    static String[] field_l;
    static int field_h;
    int field_n;
    int field_g;
    int field_j;
    int field_m;

    final static te[] a(int param0, int param1, mf param2, int param3) {
        RuntimeException var4 = null;
        mf var5 = null;
        te[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uc.a(param2, 100, param3, param0)) {
              L1: {
                if (param1 == 255) {
                  break L1;
                } else {
                  var5 = (mf) null;
                  bl.a(49, -40, (mf) null, 15);
                  break L1;
                }
              }
              stackIn_6_0 = fg.a(13029);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("bl.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 255) {
            bl.d(125);
        }
    }

    bl(int param0, int param1, int param2, int param3, int param4) {
        this.field_i = param1;
        this.field_g = param2;
        this.field_j = param3;
        this.field_m = param0;
        this.field_n = param4;
    }

    static {
        field_l = new String[255];
    }
}
