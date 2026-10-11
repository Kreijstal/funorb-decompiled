/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static int field_c;
    static String field_b;
    static nh field_d;
    static String field_a;

    final static byte[] a(se param0, byte[] param1, int param2, int param3) {
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          var4_int = param0.h(param2, 8);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new byte[var4_int];
          }
          if (param3 != 20783) {
            field_b = (String) null;
          }
          var5 = param0.h(3, 8);
          var6 = (byte)param0.h(8, param3 ^ 20775);
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(param0.h(var5, 8) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("aa.K(");
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
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void b(int param0);

    abstract int a(int param0, long param1);

    abstract long a(int param0);

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -13) {
          aa.a((byte) 34);
        }
        field_b = null;
    }

    final int b(int param0, long param1) {
        long var4 = this.a(17990);
        if (var4 > 0L) {
          hb.a(var4, param0 + 108);
        }
        if (param0 != 0) {
          field_b = (String) null;
        }
        return this.a(param0 ^ -21342, param1);
    }

    static {
        field_b = "Members' Benefits";
        field_a = "You must build in an empty gridded area";
    }
}
