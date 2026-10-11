/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ok {
    static int field_Gb;

    private aj() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    final static short[] a(wj param0, short[] param1, byte param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] var9 = null;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = DungeonAssault.field_K;
        try {
          var4_int = param0.j(param2 ^ 116, param3);
          if (0 == var4_int) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param0.j(84, 4);
          if (param2 != 31) {
            var9 = (short[]) null;
            aj.a((wj) null, (short[]) null, (byte) 18, -27);
          }
          var6 = (short)param0.j(-93, 16);
          if (0 >= var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(param0.j(87, var5) + var6);
            }
          }
          stackIn_18_0 = (short[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("aj.A(");
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
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_Gb = 0;
    }
}
