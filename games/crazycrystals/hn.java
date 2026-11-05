/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends se {
    hn(ga param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, ng param3, int param4) {
        try {
          param3.a(true, param2);
          param3.c(-161478600, 17);
          param3.c(-161478600, param0);
          param3.c(-161478600, param4);
          param3.a(true, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -118 / ((41 - param1) / 49);
          if (this.a(param0, (byte) -122) != rk.field_c) {
            stackIn_4_0 = rl.field_f;
            return stackIn_4_0;
          }
          stackIn_2_0 = mg.field_f;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hn.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final oi a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        oi stackIn_6_0 = null;
        oi stackIn_9_0 = null;
        oi stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (ab.a(param0, (byte) -114) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_6_0 = rk.field_c;
            return stackIn_6_0;
          }
          if (param1 == -122) {
            stackIn_11_0 = ih.field_b;
            return stackIn_11_0;
          }
          stackIn_9_0 = (oi) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hn.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String b(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return kd.field_n.i(114);
    }

    static {
    }
}
