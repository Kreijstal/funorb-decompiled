/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lka {
    final static bs a(int param0, kh param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        bs stackIn_2_0 = null;
        gfa stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -8) {
            stackIn_2_0 = (bs) null;
            return stackIn_2_0;
          }
          var3_int = param1.b((byte) 44, 4);
          var4 = var3_int;
          if (var4 == 0) {
            stackIn_5_0 = new gfa(param2, param1);
            return (bs) ((Object) stackIn_5_0);
          }
          System.out.println("Event type unrecognised: " + var3_int);
          stackIn_7_0 = null;
          return (bs) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 >= -33) {
          lka.a((byte) 116);
          sua.r((byte) 63);
          return;
        }
        sua.r((byte) 63);
    }

    static {
    }
}
