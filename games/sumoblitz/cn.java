/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends dq {
    static String field_P;
    static dk field_ib;
    String field_gb;
    String field_jb;
    int field_kb;
    static String field_hb;

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              if (param2 != -103) {
                return;
              }
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = td.a((byte) 125, param1, var3);
              kj.a(param2 ^ 23067, param1, true, var3.toString());
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("cn.F(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
          field_P = (String) null;
          field_ib = null;
          field_hb = null;
          field_P = null;
          return;
        }
        field_ib = null;
        field_hb = null;
        field_P = null;
    }

    final static void a(float param0, ab param1, int param2, byte[] param3, int param4, float param5, float param6, float param7, int param8, float param9, int param10, int param11, int param12) {
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param8 != 24046) {
            return;
          }
          for (var13_int = 0; var13_int < param11; var13_int++) {
            ls.a(param0, param6, param2, param10, param3, var13_int, param7, param11, -95, param12, param4, param9, param1, param5);
            param2 = param2 + param10 * param12;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_9_0 = var13;
          stackIn_9_1 = new StringBuilder().append("cn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    cn() {
        super(0L, (dq) null);
    }

    final static String[] a(char param0, String param1, int param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param1);
          var3_int = vs.a((byte) -117, var10, param0);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          if (param2 != -27224) {
            cn.c(39, 126);
          }
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param0 != param1.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param1.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("cn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int c(int param0, int param1) {
        if (param0 != 0) {
          field_hb = (String) null;
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            return 6144 <= param1 ? ce.field_p[param1 - 6144] : -ce.field_p[-param1 + 6144];
          }
          return 2048 > param1 ? ce.field_p[-param1 + 2048] : -ce.field_p[-2048 + param1];
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return 6144 <= param1 ? ce.field_p[param1 - 6144] : -ce.field_p[-param1 + 6144];
        }
        return 2048 > param1 ? ce.field_p[-param1 + 2048] : -ce.field_p[-2048 + param1];
    }

    static {
        field_P = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_ib = new dk();
        field_hb = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
