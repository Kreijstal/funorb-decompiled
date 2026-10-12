/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static boolean field_a;
    static int field_c;
    static int[][] field_d;
    static wk[] field_b;
    static String field_e;

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0) {
            stackIn_3_0 = -40;
            return stackIn_3_0;
          }
          for (var2_int = 0; var2_int < wp.field_H.length; var2_int++) {
            for (var3 = 0; var3 < wp.field_H[var2_int].length; var3++) {
              if (wp.field_H[var2_int][var3] == param1) {
                stackIn_11_0 = var2_int;
                return stackIn_11_0;
              }
            }
          }
          stackIn_15_0 = 0;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "jv.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = (int[][]) null;
        field_e = null;
        if (param0 != 36) {
          sn var2 = (sn) null;
          jv.a((sn) null, -72, 76, (byte) 115);
        }
    }

    final static te a(sn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        te stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 26) {
            field_b = (wk[]) null;
          }
          stackIn_3_0 = ne.a(-92, aa.a(param0, 100, param2, param1));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jv.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = false;
        field_e = "The cannon cannot be built on a structure";
    }
}
