/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(154, 85));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    sk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static le a(ds param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        le var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        le stackIn_3_0 = null;
        le stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 < 50) {
            stackIn_3_0 = (le) null;
            return stackIn_3_0;
          }
          param0.e((byte) -96);
          var2_int = param0.e((byte) -108);
          var3 = hr.a(false, var2_int);
          var3.field_h = param0.e((byte) -114);
          var4 = param0.e((byte) -117);
          for (var5 = 0; var5 < var4; var5++) {
            var6 = param0.e((byte) -118);
            var3.a(var6, -116, param0);
          }
          var3.c((byte) -67);
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("sk.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (param1 <= param3) {
            for (var5_int = param1; param3 > var5_int; var5_int++) {
              rba.field_b[var5_int][param2] = param4;
            }
          } else {
            var7 = param3;
            var5_int = var7;
            while (param1 > var7) {
              rba.field_b[var7][param2] = param4;
              var7++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "sk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
