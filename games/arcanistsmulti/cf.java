/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static int[] field_c;
    static String field_d;
    static wf[] field_h;
    static String field_e;
    static byte[][] field_g;
    static int[] field_a;
    static String[] field_b;
    static boolean field_f;

    final static bd a(String param0, String param1, byte param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        bd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -75) {
            cf.a(-43);
          }
          var4_long = 0L;
          var6 = null;
          if (param0.indexOf('@') != -1) {
            var6 = param0;
          } else {
            var7 = (CharSequence) ((Object) param0);
            var4_long = be.a(var7, false);
          }
          stackIn_6_0 = ci.a(param3, (String) (var6), -62, var4_long, param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cf.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
        int var1 = 28 % ((-33 - param0) / 34);
        field_e = null;
        field_h = null;
        field_g = (byte[][]) null;
    }

    final static void a(int param0) {
        mh.field_K = qj.b(-26572);
        int var1 = 27 % ((-47 - param0) / 44);
        ik.field_b = 0;
    }

    static {
        field_d = "Yes";
        field_g = new byte[1000][];
        field_e = "Balls:";
        field_h = new wf[228];
        field_a = new int[]{64, 65, 66};
        field_b = new String[3];
    }
}
