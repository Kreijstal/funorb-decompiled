/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static o field_d;
    static String[] field_c;
    static String field_f;
    static String field_a;
    static si field_e;
    static int[] field_b;
    static vh field_g;

    public static void a(byte param0) {
        field_g = null;
        field_c = null;
        if (param0 == -122) {
          field_b = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
        ld.a((byte) 91);
        field_b = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static h a(int param0, int param1, kl param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        kl var4 = null;
        byte[] var5 = null;
        Object stackIn_4_0 = null;
        h stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 26) {
            var4 = (kl) null;
            ld.a(91, -108, (kl) null);
          }
          var5 = param2.a((byte) -128, param1);
          var3 = var5;
          if (var5 != null) {
            stackIn_6_0 = new h(var5);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (h) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ld.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, sc param1, int param2) {
        mg var3 = null;
        try {
          var3 = n.field_b;
          var3.c((byte) 87, param0);
          var3.b((byte) 11, 2);
          var3.b((byte) 11, param2);
          var3.b((byte) 11, param1.field_k);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ld.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_a = "when the last enemy is killed.";
        field_b = new int[4];
        field_c = new String[255];
    }
}
