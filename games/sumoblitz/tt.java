/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tt extends ms {
    static String field_k;
    static int field_l;

    final static wb[] a(byte param0, int param1, ki param2, int param3) {
        RuntimeException var4 = null;
        wb[] stackIn_5_0 = null;
        wb[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param2, param1, param3, -23046)) {
            return null;
          }
          if (param0 <= -79) {
            stackIn_7_0 = ul.a(255);
            return stackIn_7_0;
          }
          stackIn_5_0 = (wb[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tt.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 == 30692) {
          ki.field_f = c.field_u[0];
          iv.field_i = c.field_u[1];
          hc.field_f = c.field_u[2];
          return;
        }
        field_k = (String) null;
        ki.field_f = c.field_u[0];
        iv.field_i = c.field_u[1];
        hc.field_f = c.field_u[2];
    }

    public static void c(boolean param0) {
        field_k = null;
        if (!param0) {
          field_k = (String) null;
        }
    }

    tt(int param0, boolean param1) {
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var2Lifetime4;
        if (param0 >= -127) {
          field_l = -86;
          var3 = param1;
          if (var3 != 6) {
            if (var3 == 7) {
              var2 = dp.a(-26346, 0);
            } else {
              var2 = dp.a(-26346, param1);
            }
            return ((8388607 ^ var2 >> 1) & 8355711) + var2;
          }
          var2Lifetime4 = dp.a(-26346, 0);
          return ((8388607 ^ var2Lifetime4 >> 1) & 8355711) + var2Lifetime4;
        }
        var3Lifetime1 = param1;
        if (var3Lifetime1 == 6) {
          var2Lifetime1 = dp.a(-26346, 0);
          return ((8388607 ^ var2Lifetime1 >> 1) & 8355711) + var2Lifetime1;
        }
        if (var3Lifetime1 != 7) {
          var2Lifetime2 = dp.a(-26346, param1);
          return ((8388607 ^ var2Lifetime2 >> 1) & 8355711) + var2Lifetime2;
        }
        var2Lifetime3 = dp.a(-26346, 0);
        return ((8388607 ^ var2Lifetime3 >> 1) & 8355711) + var2Lifetime3;
    }

    static {
        field_k = "DEFEAT.";
        field_l = 256;
    }
}
