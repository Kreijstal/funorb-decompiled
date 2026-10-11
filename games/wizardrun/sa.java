/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    kl field_a;
    String field_f;
    String field_h;
    static String field_b;
    static java.awt.Color field_e;
    String field_d;
    static kd field_g;
    int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 != -118) {
          field_g = (kd) null;
        }
        field_g = null;
    }

    final static short[] a(int param0, byte param1, mg param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = wizardrun.field_H;
        try {
          var4_int = param2.g(param0, -11719);
          if (var4_int == 0) {
            return null;
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param2.g(4, -11719);
          var6 = (short)param2.g(16, -11719);
          if (param1 != -48) {
            stackIn_10_0 = (short[]) null;
            return stackIn_10_0;
          }
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)(param2.g(var5, -11719) + var6);
            }
          }
          stackIn_19_0 = (short[]) (param3);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("sa.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
        field_e = new java.awt.Color(10040319);
        field_g = new kd();
    }
}
