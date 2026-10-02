/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static int field_a;
    static qi field_b;
    static dm[] field_e;
    static hi field_d;
    static int[] field_c;

    abstract void a(java.awt.Component param0, byte param1);

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(boolean param0);

    final static byte[] a(byte[] param0, pk param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Geoblox.field_C;
        try {
          var4_int = param1.e((byte) -17, param2);
          if (var4_int != 0) {
            L0: {
              if (param0 != null) {
                if (param0.length == var4_int) {
                  break L0;
                }
              }
              param0 = new byte[var4_int];
            }
            L2: {
              var5 = param1.e((byte) -17, 3);
              var6 = (byte)param1.e((byte) -17, param3);
              if (0 >= var5) {
                for (var7 = 0; var4_int > var7; var7++) {
                  param0[var7] = (byte)var6;
                }
                break L2;
              } else {
                for (var7 = 0; var4_int > var7; var7++) {
                  param0[var7] = (byte)(param1.e((byte) -17, var5) + var6);
                }
                break L2;
              }
            }
            stackIn_16_0 = (byte[]) (param0);
            return stackIn_16_0;
          } else {
            stackIn_3_0 = null;
            return (byte[]) ((Object) stackIn_3_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var4);

          stackIn_19_1 = new StringBuilder().append("vk.E(");

          if (param0 == null) {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "{...}";
          }


          stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

          if (param1 == null) {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
            stackIn_23_2 = "null";
          } else {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 >= -9) {
            return;
        }
        field_d = null;
    }

    static {
        field_c = new int[8192];
    }
}
