/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ppb {
    static ri field_c;
    static String field_d;
    static asb field_a;
    static cda field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -52 / ((param0 + 64) / 39);
        field_b = null;
        field_d = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        ps var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0 instanceof byte[]) {
            var4 = (byte[]) (param0);
            stackIn_6_0 = qcb.a(param3, var4, param1, 31783);
            return stackIn_6_0;
          }
          if (!param2) {
            stackIn_9_0 = (byte[]) null;
            return stackIn_9_0;
          }
          if (!(param0 instanceof ps)) {
            throw new IllegalArgumentException();
          }
          var5 = (ps) (param0);
          stackIn_13_0 = var5.a(param3, -106, param1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("ppb.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static rb a(String param0, int param1, byte param2) {
        aqb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        aqb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -55) {
            var4 = (String) null;
            ppb.a((String) null, 112, (byte) 96);
          }
          var3 = new aqb();
          ((rb) ((Object) var3)).field_b = param1;
          ((rb) ((Object) var3)).field_a = param0;
          stackIn_3_0 = var3;
          return (rb) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ppb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = "Invisible";
        field_c = new ri(11, 0, 1, 2);
    }
}
