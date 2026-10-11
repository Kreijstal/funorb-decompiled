/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static llb field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0, byte param1, int param2) {
        faa var3 = null;
        faa var3Lifetime1;
        if (param1 < -82) {
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        }
        asb var4 = (asb) null;
        pa.a(-92, -5, (asb) null, 15);
        var3Lifetime1 = dpa.field_p;
        var3Lifetime1.h(24335, param0);
        var3Lifetime1.c(0, 3);
        var3Lifetime1.c(0, 8);
        var3Lifetime1.a(param2, true);
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + sh.a("\n", "%0a", param0, 0));
        if (param1 != 3) {
          pa.a(111);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 2) {
          field_a = (llb) null;
        }
    }

    final static boolean a(int param0, int param1, asb param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            pa.a(36);
          }
          var5 = param2.a(param0, param3, (byte) 13);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          wab.a(0, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        lob discarded$0 = new lob();
        field_c = "Hull piece";
    }
}
