/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static fe field_a;
    static String field_d;
    static ed field_b;
    static boolean field_c;

    final static void a(int param0, aa param1) {
        if (param1 == null) {
            return;
        }
        try {
            ji.field_n = param1;
            ql.field_L.field_M.c(0);
            if (param0 >= -17) {
                hh.a(76, 115, true);
            }
            ql.field_L.b(ji.field_n, 121);
            pm.field_a = true;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "hh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -50) {
            field_b = (ed) null;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static String a(byte param0, int param1, ed param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        ed var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param0 < -63) {
                    break L2;
                  } else {
                    var6 = (ed) null;
                    hh.a((byte) 33, -101, (ed) null);
                    break L2;
                  }
                }
                L3: {
                  var3_int = param2.l(-1317721944);
                  if (var3_int <= param1) {
                    break L3;
                  } else {
                    var3_int = param1;
                    break L3;
                  }
                }
                var4 = new byte[var3_int];
                param2.field_u = param2.field_u + ko.field_M.a(25330, var4, var3_int, param2.field_u, 0, param2.field_p);
                var5 = mj.a(-125, var4, 0, var3_int);
                stackIn_5_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = "Cabbage";
              return stackIn_7_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("hh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_5_0;
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var3 = nf.a((byte) -28, param1);
        var4 = fk.a((byte) -118, param1);
        var5 = nf.a((byte) -28, param0);
        var6 = fk.a((byte) -118, param0);
        if (param2) {
          field_c = true;
          var7 = (int)((long)var5 * (long)var3 >> 380322960);
          var8 = (int)((long)var3 * (long)var6 >> 416876944);
          var9 = (int)((long)var4 * (long)var5 >> -2059283888);
          var10 = (int)((long)var4 * (long)var6 >> -937538928);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var7 = (int)((long)var5 * (long)var3 >> 380322960);
          var8 = (int)((long)var3 * (long)var6 >> 416876944);
          var9 = (int)((long)var4 * (long)var5 >> -2059283888);
          var10 = (int)((long)var4 * (long)var6 >> -937538928);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    static {
        field_d = "Send private Quick Chat to <%0>";
    }
}
