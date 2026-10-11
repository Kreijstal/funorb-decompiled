/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static lc[] field_b;
    static String field_e;
    static int field_d;
    static ld field_c;
    static ea field_a;

    final static byte[] a(byte[] param0, ld param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          var4_int = param1.c((byte) -110, param2);
          if (var4_int == 0) {
            return null;
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new byte[var4_int];
          }
          if (param3 >= -78) {
            sn.a((byte) 80);
          }
          var5 = param1.c((byte) -114, 3);
          var6 = (byte)param1.c((byte) -96, 8);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)(param1.c((byte) -115, var5) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("sn.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 81) {
          return false;
        }
        return ke.field_U.a((byte) 16);
    }

    public static void b(byte param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -18) {
          sn.b((byte) 110);
        }
    }

    static {
        field_b = new lc[2];
        field_e = "PER MONTH";
    }
}
