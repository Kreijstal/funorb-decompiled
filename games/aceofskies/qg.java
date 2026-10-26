/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg {
    static int rendererCurrentTextColor;
    static String field_b;
    static int[] field_e;
    static float[] field_a;
    static mg field_d;

    final static Sprite[] a(byte param0, ResourceArchive param1, String param2, String param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param0 != 3) {
            qg.a((byte) -15, -89, 51);
          }
          int var4_int = param1.b(param2, param0 ^ 3);
          int var5 = param1.a(-101, var4_int, param3);
          Sprite[] stackIn_3_0 = hf.a(1, param1, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int b(int param0);

    public static void a(int param0) {
        int var1 = 124 % ((param0 + 53) / 40);
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    abstract void a(java.awt.Component param0, int param1);

    final static int a(byte param0, int param1, int param2) {
        int var3 = param2 >> 31 & -1 + param1;
        int var4 = -80 % ((param0 - 34) / 57);
        return ((param2 >>> 31) + param2) % param1 + var3;
    }

    static {
        rendererCurrentTextColor = 0;
        field_b = "Click";
        field_a = new float[16];
        field_e = new int[12];
    }
}
