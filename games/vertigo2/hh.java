/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static fe field_a;
    static String field_d;
    static ed field_b;
    static boolean field_c;

    final static void a(int param0, aa param1) {
        if (param1 != null) {
          ji.field_n = param1;
          ql.field_L.field_M.c(0);
          if (param0 >= -17) {
            int[] discarded$2 = hh.a(76, 115, true);
            ql.field_L.b((cr) (Object) ji.field_n, 121);
            pm.field_a = true;
            return;
          } else {
            ql.field_L.b((cr) (Object) ji.field_n, 121);
            pm.field_a = true;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -50) {
            field_b = null;
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
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            if (param0 < -63) {
              break L0;
            } else {
              var6 = null;
              String discarded$2 = hh.a((byte) 33, -101, (ed) null);
              break L0;
            }
          }
          L1: {
            var3_int = param2.l(-1317721944);
            if (var3_int <= param1) {
              break L1;
            } else {
              var3_int = param1;
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param2.field_u = param2.field_u + ko.field_M.a(25330, var4, var3_int, param2.field_u, 0, param2.field_p);
          var5 = mj.a(-125, var4, 0, var3_int);
          stackOut_4_0 = (String) var5;
          stackIn_5_0 = stackOut_4_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_5_0;
        }
        return null;
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Send private Quick Chat to <%0>";
    }
}
