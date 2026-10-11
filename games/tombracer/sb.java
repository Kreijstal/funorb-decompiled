/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static boolean field_b;
    static int field_d;
    static upa field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
          int[] var2 = (int[]) null;
          sb.a(121, (int[]) null);
        }
    }

    final static int[] a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = new int[pd.a(param1, 2048)];
          var2 = var7;
          var3 = 0;
          for (var4 = param0; param1.length > var4; var4++) {
            if (param1[var4] != 0) {
              for (var5 = 0; 32 > var5; var5++) {
                if ((1 << var5 & param1[var4]) != 0) {
                  incrementValue$1 = var3;
                  var3++;
                  var7[incrementValue$1] = fh.a(var5, var4 << 5);
                }
              }
            }
          }
          stackIn_14_0 = var7;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("sb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, cn param1, cn param2, cn param3, cn param4) {
        try {
          bja.field_a = param4;
          qoa.field_b = param1;
          ua.field_a = param2;
          nj.field_v = param3;
          ns.field_j = new nda(qoa.field_b, nj.field_v);
          bia.field_J = new u[237];
          int var5_int = -51 % ((param0 - 32) / 59);
          fna.field_j = new qua[4];
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = null;
        field_c = "Accept <%0> into this game";
    }
}
