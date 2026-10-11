/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    private static String[] field_b;

    final static int[] a(int param0, int param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int var3 = cr.a(true, param1);
        int var4 = pla.b(61, param1);
        int var5 = cr.a(true, param0);
        int var6 = pla.b(52, param0);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        if (param2 == 0) {
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        field_a = (String) null;
        var9 = (int)((long)var4 * (long)var5 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1088536016) {
          return;
        }
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 > -46) {
          jl.a(-79, 78, -90);
          if (bl.field_a != null) {
            bl.field_a.b(40, param1);
            return;
          }
          return;
        }
        if (bl.field_a == null) {
          return;
        }
        bl.field_a.b(40, param1);
    }

    final static roa a(la param0, boolean param1, kh param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kh var4 = null;
        roa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var4 = (kh) null;
            jl.a((la) null, false, (kh) null);
          }
          var3_int = param2.b((byte) 44, 5);
          stackIn_3_0 = ci.a(var3_int, -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jl.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_a = "Only show game chat from my friends";
        field_b = new String[4];
        field_b[3] = "On Tremor";
        field_b[1] = "On Move";
        field_b[0] = "On Finish";
        field_b[2] = "On Darkness";
    }
}
