/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw {
    static vn field_b;
    static qr field_c;
    static hr field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        kc.j(125);
        lk.e(param3, param1, param4, param0);
        if (param2 != 1) {
          field_b = (vn) null;
        }
    }

    final static void a(byte param0, tk param1, int param2, vn param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 90) {
            field_b = (vn) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param4.length() > var7; var7++) {
            var8 = param4.charAt(var7);
            if (60 == var8) {
              var6 = (var5_int >> 8) + param1.field_b[0] + param3.a(param4.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param1.field_b[var7] = param1.field_b[0] + ((var5_int >> 8) + (param3.a(param4.substring(0, 1 + var7)) - param3.a((char) var8)));
            } else {
              param1.field_b[var7] = var6;
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("kw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -86) {
          field_b = (vn) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$62b8cf4125f9(int param0, tk param1, int param2, vn param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 90) {
            field_b = (vn) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param4.length() > var7; var7++) {
            var8 = param4.charAt(var7);
            if (60 == var8) {
              var6 = (var5_int >> 8) + param1.field_b[0] + param3.a(param4.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param1.field_b[var7] = param1.field_b[0] + ((var5_int >> 8) + (param3.a(param4.substring(0, 1 + var7)) - param3.a((char) var8)));
            } else {
              param1.field_b[var7] = var6;
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("kw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }
}
