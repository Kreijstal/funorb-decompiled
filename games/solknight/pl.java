/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static da field_d;
    static int field_a;
    static kb field_b;
    static int[] field_c;

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              if (param1 != -15071) {
                return;
              }
              param0.getAppletContext().showDocument(kk.a(param1 ^ -15030, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pl.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -5045) {
          field_d = (da) null;
          field_b = null;
          field_d = null;
          return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          mi.b(param4, param3, 1 + param2, 10000536);
          mi.b(param4, param1 + param3, 1 + param2, 12105912);
          var5_int = 1;
          var6 = param1;
          if (param3 + var5_int < mi.field_l) {
            var5_int = -param3 + mi.field_l;
          }
          if (param3 + var6 > mi.field_e) {
            var6 = mi.field_e - param3;
          }
          if (!param0) {
            field_b = (kb) null;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + var7 * 48 / param1;
            var9 = var8 << 8 | var8 << 16 | var8;
            mi.field_f[param4 + mi.field_a * (param3 + var7)] = var9;
            mi.field_f[param2 + (param4 + mi.field_a * (var7 + param3))] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var5), "pl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = new kb();
        field_c = new int[8192];
    }
}
