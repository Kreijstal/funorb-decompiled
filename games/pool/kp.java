/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_c;
    byte[] field_l;
    static int[][] field_i;
    int field_g;
    int field_b;
    int field_k;
    static int field_f;
    byte[] field_a;
    static int field_d;
    int field_o;
    int field_e;
    int field_n;
    int field_j;
    static int field_m;
    static eg field_h;

    final static void a(rk param0, byte param1) {
        try {
          int var2_int = 75 % ((0 - param1) / 57);
          Pool.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "kp.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_i = (int[][]) null;
        int var1 = 9 % ((-61 - param0) / 35);
        field_h = null;
    }

    final static kf a(int param0, jg param1, int param2, int param3) {
        RuntimeException var4 = null;
        kf stackIn_2_0 = null;
        kf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 100) {
            stackIn_4_0 = mn.a(-24296, nb.a(param1, 100, param3, param2));
            return stackIn_4_0;
          }
          stackIn_2_0 = (kf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.a(param0, false);
        var2.a(2, false);
    }

    static {
        field_c = "Show all private chat";
        field_m = 128;
    }
}
