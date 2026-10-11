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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!uc.a(param2, 100, param3, param0)) {
            return null;
          }
          if (param1 != 255) {
            var5 = (mf) null;
            bl.a(49, -40, (mf) null, 15);
          }
          stackIn_6_0 = fg.a(13029);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bl.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
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
