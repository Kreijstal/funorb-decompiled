/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends af {
    static int[] field_e;
    static String field_c;
    private sm field_d;

    final static void a(int param0, byte param1, int param2, int[] param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          param0--;
          param4--;
          var5_int = param4 - 7;
          while (var5_int > param0) {
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
          }
          while (param0 < param4) {
            param0++;
            param3[param0] = param2;
          }
          var6 = -59 / ((-50 - param1) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("di.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_e = null;
        if (param0 == -7) {
          return;
        }
        int[] var2 = (int[]) null;
        di.a(-29, (byte) -24, 121, (int[]) null, -98);
    }

    final void b(int param0) {
        if (param0 != 6) {
          this.b(77);
          this.field_d.a(0, 0);
          return;
        }
        this.field_d.a(0, 0);
    }

    final static dn a(int param0, String[] param1) {
        dn var2 = null;
        RuntimeException var2_ref = null;
        dn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new dn(false);
          var2.field_d = param1;
          if (param0 != 0) {
            field_c = (String) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("di.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    di(sm param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "OVER <%0>";
    }
}
