/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static int[] field_a;
    static int field_c;
    static long field_b;

    final static StringBuilder a(StringBuilder param0, char param1, boolean param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          var4_int = param0.length();
          param0.setLength(param3);
          for (var5 = var4_int; param3 > var5; var5++) {
            param0.setCharAt(var5, param1);
          }
          if (!param2) {
            stackIn_8_0 = (StringBuilder) (param0);
            return stackIn_8_0;
          }
          stackIn_6_0 = (StringBuilder) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ke.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        var2 = 0;
        if (param1 >= -86) {
          field_a = (int[]) null;
        }
        if (param0 < 0) {
          var2 += 16;
          param0 = param0 >>> 16;
        } else {
          if (param0 >= 65536) {
            var2 += 16;
            param0 = param0 >>> 16;
          }
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    public static void a(int param0) {
        if (param0 != -18242) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, fj param1) {
        qc.field_bb = param1.i(7088) << 5;
        int var2_int = param1.i((byte) -101);
        if (param0 != 225225318) {
          return;
        }
        try {
          um.field_p = 1835008 & var2_int << 18;
          qc.field_bb = qc.field_bb + (var2_int >> 3);
          um.field_p = um.field_p + (param1.i(param0 ^ 225227222) << 2);
          var2_int = param1.i((byte) -101);
          um.field_p = um.field_p + (var2_int >> 6);
          bf.field_c = (var2_int & 63) << 15;
          bf.field_c = bf.field_c + (param1.i((byte) -101) << 7);
          var2_int = param1.i((byte) -101);
          bf.field_c = bf.field_c + (var2_int >> 1);
          eg.field_w = (1 & var2_int) << 16;
          eg.field_w = eg.field_w + param1.i(7088);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ke.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
    }
}
