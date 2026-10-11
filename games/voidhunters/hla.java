/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla {
    static int[] field_a;
    static String field_b;

    final static tv[] a(Class[] param0, tv[] param1, dja[] param2, int param3, tv[] param4, int param5, dja param6) {
        int var8 = 0;
        tv dupTemp$0 = null;
        Object stackIn_3_0 = null;
        tv[] stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        tv var9 = null;
        Class var10 = null;
        tv var11 = null;
        int var12 = 0;
        tv var13 = null;
        tv var14 = null;
        int var15 = 0;
        tv var16 = null;
        var15 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (tv[]) (stackIn_3_0);
          }
          if (param4 == null ||
            param4.length != param1.length) {
            param4 = param6.a(11995, param1.length);
          }
          var7_int = 97 / ((param3 + 68) / 42);
          for (var8 = 0; param1.length > var8; var8++) {
            var9 = param1[var8];
            if (var9 == null) {
              param4[var8] = null;
            } else {
              var10 = param1[var8].getClass();
              var16 = param4[var8];
              var11 = var16;
              if (var16 == null ||
                var16.getClass() != var10) {
                dupTemp$0 = udb.a(param0, param2, var10, -82);
                param4[var8] = dupTemp$0;
                var11 = dupTemp$0;
              }
              var12 = param5;
              var13 = var9;
              var14 = var11;
              if (var12 == 1) {
                var13.b((byte) 114, var14);
              } else {
                if (2 != var12) {
                  if (var12 == 3) {
                    ((sjb) (var13)).a(var14, (byte) 39);
                  }
                } else {
                  ((tva) (var13)).a(var14, 29106);
                }
              }
            }
          }
          stackIn_25_0 = (tv[]) (param4);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("hla.A(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 39) {
          field_a = (int[]) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Repair";
    }
}
