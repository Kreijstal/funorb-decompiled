/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static int field_a;
    static le field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 != -1962602524) {
          field_a = 6;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        if (param1 != -59) {
          field_c = (String) null;
        }
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param0 & ~var2;
    }

    final static void b(int param0) {
        km var1 = null;
        km var2 = null;
        int var3 = 0;
        int var4 = Chess.field_G;
        try {
          var1 = new km(param0, 140);
          tl.a((byte) -67, var1);
          nh.a();
          wb.b();
          sl.field_a = 0;
          di.k(9);
          var2 = var1.c();
          for (var3 = 0; var3 < 15; var3++) {
            var2.c(-2, -2, 16777215);
            wb.e(4, 4, 0, 0, 540, 140);
          }
          tg.field_u.e();
          var1.c(0, 0);
          fd.a(28773);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ie.C(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          var3_int = 0;
          if (param1 != -1) {
            stackIn_3_0 = 77;
            return stackIn_3_0;
          }
          while (param0 > 0) {
            var3_int = param2 & 1 | var3_int << 1;
            param2 = param2 >>> 1;
            param0--;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "ie.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static sa a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        sa stackIn_3_0 = null;
        sa stackIn_7_0 = null;
        sa stackIn_10_0 = null;
        sa stackIn_20_0 = null;
        sa stackIn_23_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Chess.field_G;
        try {
          if (param1 != -55) {
            stackIn_3_0 = (sa) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_7_0 = ef.field_j;
            return stackIn_7_0;
          }
          if (63 < var2_int) {
            stackIn_10_0 = ok.field_Ob;
            return stackIn_10_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                stackIn_20_0 = wh.field_b;
                return stackIn_20_0;
              }
            } else {
              if (-1 == oc.field_m.indexOf(var4)) {
                stackIn_23_0 = wh.field_b;
                return stackIn_23_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ie.D(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, int param2) {
        dh var4_ref_dh = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        ve var3 = ca.a(param0, param2, -128);
        dh var4_ref_dhLifetime1;
        if (var3 != null) {
          pi.field_d.a(0, false);
          var4_ref_dh = pi.field_d;
          var5_ref_String = ef.field_m;
          var4_ref_dh.field_b.a((byte) -12, var5_ref_String, 5);
          var4_ref_dhLifetime1 = pi.field_d;
          var5 = re.field_m;
          var6 = ag.field_f;
          var4_ref_dhLifetime1.field_b.a(true, var5, 0, var6, 0);
        }
        int var4 = 89 / ((param1 + 25) / 46);
        vc.a((byte) 68, param0, param2);
    }

    static {
        field_c = "Email is valid";
        field_a = 0;
    }
}
