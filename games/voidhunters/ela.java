/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ela extends rqa {
    static int field_o;
    static int field_q;
    static int field_p;

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
            stackIn_4_0 = new nc(frb.a(156, 98));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ela.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var3 = 0;
        int[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = VoidHunters.field_G;
        try {
          var10 = new int[4];
          var9 = var10;
          var8 = var9;
          var2 = var8;
          var10[1] = -2147483648;
          var10[0] = 2147483647;
          var10[2] = 2147483647;
          var10[3] = -2147483648;
          if (param0 > -93) {
            var7 = (int[]) null;
            ela.a((byte) -43, (int[]) null);
          }
          for (var3 = 0; var3 < param1.length; var3 += 2) {
            var4 = param1[var3];
            var5 = param1[1 + var3];
            if (var4 < var10[0]) {
              var10[0] = var4;
            }
            if (var10[2] > var5) {
              var10[2] = var5;
            }
            if (var5 > var10[3]) {
              var10[3] = var5;
            }
            if (var10[1] < var4) {
              var10[1] = var4;
            }
          }
          stackIn_20_0 = var8;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("ela.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    ela(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = -1;
        field_q = 256;
        field_p = 50;
    }
}
