/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static qe field_a;
    static String field_b;
    static he field_c;

    final static void a(int param0, vj param1) {
        nh var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new nh(param1.a("final_frame.jpg", "", 24874), (java.awt.Component) ((Object) n.field_g));
          var3 = var2.field_y;
          var4 = var2.field_w;
          aj.a(true);
          ji.field_b = new nh(var3, 3 * var4 / 4);
          ji.field_b.c();
          var2.a(param0, 0);
          vb.field_s = new nh(var3, -ji.field_b.field_w + var4);
          vb.field_s.c();
          var2.a(0, -ji.field_b.field_w);
          vb.field_s.field_v = ji.field_b.field_w;
          cl.d((byte) -99);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ea.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 0) {
          field_b = (String) null;
        }
    }

    final static nh[] a(String param0, String param1, int param2, vj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nh[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_b = (String) null;
          }
          var4_int = param3.a(param1, (byte) -115);
          var5 = param3.a((byte) -63, param0, var4_int);
          stackIn_3_0 = ob.a(var5, -13339, param3, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ea.C(");
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
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(bl param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = param0.a(param1 ^ -20);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ea.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Graphics: ";
    }
}
