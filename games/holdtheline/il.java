/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_c;
    static String field_a;
    static String field_b;
    static float[] field_d;

    public static void a(int param0) {
        int var1 = -102 % ((param0 + 9) / 36);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static bm[] a(byte param0, gn param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bm[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 115 / ((-67 - param0) / 52);
          if (qg.a(param2, param3, (byte) -27, param1)) {
            stackIn_4_0 = eg.b(false);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (bm[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("il.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static jg a(int param0, int param1, int param2, int param3, byte param4) {
        jg var10 = null;
        int var6 = HoldTheLine.field_D;
        jg var5 = (jg) (pc.field_e.b((byte) 120));
        while (var5 != null) {
          if (var5.field_i == param2) {
            return var5;
          }
          var5 = (jg) (pc.field_e.c((byte) -45));
        }
        if (param4 == -66) {
          var10 = new jg();
          var10.field_n = param0;
          var10.field_l = param3;
          var10.field_i = param2;
          pc.field_e.a((byte) -114, var10);
          gd.a(var10, (byte) 86, param1);
          return var10;
        }
        il.a(-18);
        jg var9 = new jg();
        var9.field_n = param0;
        var9.field_l = param3;
        var9.field_i = param2;
        pc.field_e.a((byte) -114, var9);
        gd.a(var9, (byte) 86, param1);
        return var9;
    }

    static {
        field_c = 9;
        field_b = "Go!";
        field_d = new float[]{1.0f, 0.75f, 0.5f, 0.0f};
    }
}
