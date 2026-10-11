/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends pp {
    static String field_i;

    public static void e(byte param0) {
        field_i = null;
        if (param0 != -7) {
          o.e((byte) -68);
        }
    }

    final void a(lu param0, byte param1) {
        try {
          int var3_int = 33 / ((param1 - 34) / 58);
          super.a(param0, (byte) 95);
          param0.b(this.field_f, -115);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "o.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    o(int param0) {
        this.field_f = param0;
    }

    final static boolean d(byte param0) {
        if (param0 < 44) {
          field_i = (String) null;
        }
        return wca.field_n >= 11 ? true : false;
    }

    final void a(aga param0, op param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param2 != 12) {
            o.d((byte) 28);
          }
          for (var4_int = 0; var4_int < param1.field_z; var4_int++) {
            for (var5 = 0; var5 < param1.field_B; var5++) {
              var6 = param1.field_a[var4_int][var5].field_l;
              if (var6 != null) {
                var6.g(-116, this.field_f);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("o.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_i = "Join <%0>'s game";
    }
}
