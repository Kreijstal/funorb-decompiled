/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class goa {
    static String field_c;
    private String field_a;
    private boolean field_b;

    final String a(int param0) {
        if (param0 != -12851) {
          field_c = (String) null;
          return this.field_a;
        }
        return this.field_a;
    }

    goa(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 != 29) {
          return false;
        }
        return this.field_b;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          goa.a(107, -79, (kh) null, (byte[]) null);
        }
    }

    goa(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          if (this.field_a == null) {
            this.field_a = "";
          }
          stackIn_6_1 = (param1);
          this.field_b = stackIn_6_1;
          if (this.field_a.length() != 0) {
            return;
          }
          this.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("goa.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte[] a(int param0, int param1, kh param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2.b((byte) 44, param0);
          if (param1 != -4854) {
            field_c = (String) null;
          }
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new byte[var4_int];
          }
          var5 = param2.b((byte) 44, 3);
          var6 = (byte)param2.b((byte) 44, 8);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)(param2.b((byte) 44, var5) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("goa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_c = "Log in";
    }
}
