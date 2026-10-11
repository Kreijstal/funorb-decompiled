/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends ml {
    static int field_B;
    static int field_D;
    static String field_C;

    om(int param0) {
        this(qc.field_x, param0);
    }

    private om(cc param0, int param1) {
        super(param0, param1);
    }

    final static void a(String param0, byte param1) {
        try {
          int var2_int = -48 / ((-83 - param1) / 39);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "om.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final String a(byte param0, iq param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -90) {
            field_D = -38;
          }
          stackIn_3_0 = rh.a((byte) -95, param1.field_w.length(), '*');
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("om.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param1; var5 < param0; var5++) {
            var4_int = var4_int >>> 8 ^ hn.field_r[(param2[var5] ^ var4_int) & 255];
          }
          if (param3 != 255) {
            om.c((byte) 93);
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("om.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 < 76) {
          String var2 = (String) null;
          om.a((String) null, (byte) -77);
        }
        field_C = null;
    }

    static {
        field_C = "Unable to connect to the data server. Please check any firewall you are using.";
        field_B = 84;
    }
}
