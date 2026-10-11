/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oha {
    private int field_p;
    static int field_m;
    private int field_o;
    private int field_n;
    static String field_r;
    int field_q;

    final boolean e(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -2) {
          this.field_p = -128;
        }
        stackIn_6_0 = (this.field_n >= 1) && (0 <= this.field_p);
        return stackIn_6_0;
    }

    hd(int param0, int param1, int param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        super(4, param0, param1, param2, 0, param11);
        try {
          this.field_p = param8;
          this.field_f = param3;
          this.field_o = param6;
          this.field_q = param5;
          this.field_k = param4;
          this.field_n = param9;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
          field_r = (String) null;
        }
        if (this.field_o == 17) {
          return 3;
        }
        if (this.field_p == 0 &&
          this.field_n == 0) {
          return 1;
        }
        if (this.field_p != 1 ||
          1 != this.field_n) {
          if (this.c((byte) -96)) {
            return 0;
          }
          throw new IllegalStateException("This special doesn't have a defined range. Fix it.");
        }
        return 2;
    }

    final static byte[] a(byte[] param0, pf param1, byte param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BachelorFridge.field_y;
        try {
          var4_int = param1.d(param3, (byte) -108);
          if (0 == var4_int) {
            return null;
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new byte[var4_int];
          }
          var5 = param1.d(3, (byte) 87);
          var6 = (byte)param1.d(8, (byte) -117);
          if (param2 <= 89) {
            stackIn_10_0 = (byte[]) null;
            return stackIn_10_0;
          }
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)(param1.d(var5, (byte) 48) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)var6;
            }
          }
          stackIn_19_0 = (byte[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("hd.J(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 != 1) {
          field_m = 97;
        }
    }

    private final boolean c(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -96) {
          field_r = (String) null;
        }
        stackIn_6_0 = (this.field_p == 0) && (this.field_n == 7);
        return stackIn_6_0;
    }

    static {
        field_r = "Play free version";
        field_m = -1;
    }
}
