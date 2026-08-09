/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static String field_a;
    static boolean field_c;
    static int field_e;
    static ci field_d;

    final static void a(int param0, hh param1, byte param2) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = qn.field_U;
            var3.f(param0, -94);
            var3.c(param1.field_l, (byte) -88);
            var3.b(param1.field_n, 109);
            if (param2 >= 9) {
              break L0;
            } else {
              field_e = -102;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("ue.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static void a(long param0, int param1, int param2) {
        nk var4;
        int var5;
        var4 = qn.field_U;
        var4.f(param2, -75);
        var4.field_l = var4.field_l + 1;
        var5 = var4.field_l;
        var4.c(6, (byte) 92);
        if (param1 != 16581) {
          field_c = true;
          var4.a(-99, param0);
          var4.a(var4.field_l - var5, -1);
          return;
        } else {
          var4.a(-99, param0);
          var4.a(var4.field_l - var5, -1);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 6) {
            field_b = (String) null;
        }
    }

    static {
        field_b = "Cancel";
        field_a = "You are offering to draw.";
    }
}
