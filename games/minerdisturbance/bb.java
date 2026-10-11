/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_b;
    static ta field_a;

    final static void a(String param0, int param1, we param2, int param3, int param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = param2.a(param0);
          var6 = param2.field_N + param2.field_E;
          var7 = im.field_c;
          if (var5_int + (var7 - param4) > eh.field_g) {
            var7 = -6 + (eh.field_g - var5_int);
          }
          var8 = -param2.field_N + qd.field_P + 32;
          if (6 + (var8 + var6) > eh.field_c) {
            var8 = -var6 + (eh.field_c - 6);
          }
          eh.a(var7, var8, 6 + var5_int, var6 + 6, param1);
          eh.e(var7 + 1, 1 + var8, var5_int + 4, var6 + 4, param3);
          param2.a(param0, 3 + var7, var8 + 3 + param2.field_N, param1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bb.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -4) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static ea a(String param0, bj param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ea stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(-43, param3);
          var5 = param1.a(param0, var4_int, -81);
          if (param2 > -92) {
            field_a = (ta) null;
          }
          stackIn_3_0 = bl.a(var5, param1, (byte) -79, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bb.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        try {
          vl.h(param0 ^ -19932);
          mb.field_b.n(21974);
          if (param0 != 19931) {
            field_a = (ta) null;
          }
          di.field_D = new cl(pl.field_a, (String) null, gd.field_B, param1, param3);
          de.field_a = new rh(mb.field_b, di.field_D);
          mb.field_b.b(1, de.field_a);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = "to return to the normal view.";
        field_a = new ta();
    }
}
