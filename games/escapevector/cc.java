/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends IntrusiveNode {
    static String field_k;
    int field_m;
    int field_g;
    int field_n;
    int field_o;
    int field_i;
    static Sprite field_j;
    int field_h;
    static String field_l;

    final static Sprite[] a(int param0, mf param1, int param2, byte param3) {
        String stackIn_8_2 = null;
        try {
          int var4_int = -48 % ((param3 + 38) / 33);
          if (uc.a(param1, 120, param0, param2)) {
            Sprite[] stackIn_4_0 = hf.b(121);
            return stackIn_4_0;
          }
          Object stackIn_2_0 = null;
          return (Sprite[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("cc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 <= 26) {
          field_k = (String) null;
          field_l = null;
          field_j = null;
          return;
        }
        field_l = null;
        field_j = null;
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param2;
        this.field_g = param5;
        this.field_m = param1;
        this.field_h = param3;
        this.field_i = param0;
        this.field_o = param4;
    }

    static {
        field_l = "The Achievements system is currently unavailable.";
    }
}
