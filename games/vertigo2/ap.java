/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static int field_e;
    static String field_f;
    static bl field_d;
    static int field_c;
    static go[] field_b;
    static String field_g;
    static t field_a;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vm.a((java.awt.Component) ((Object) param0), 11631);
          if (param1 != -8228) {
            ap.a((byte) -14);
          }
          hk.a(3, (java.awt.Component) ((Object) param0));
          if (null == th.field_g) {
            return;
          }
          th.field_g.a((java.awt.Component) ((Object) param0), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ap.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static al a(int param0, r param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        al stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -118 % ((param2 + 61) / 52);
          var5 = param1.a(true, param0);
          var3 = var5;
          if (var5 != null) {
            stackIn_4_0 = new al(var5);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (al) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ap.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != 25) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          ap.a((java.awt.Canvas) null, 94);
        }
    }

    static {
        field_e = 0;
        field_f = "Back";
        field_b = new go[28];
    }
}
