/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static bi field_b;
    private boolean field_a;
    static String field_d;
    private String field_c;

    final static short[] a(int param0, hb param1, short[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var4_int = param1.g(param3, 0);
          if (var4_int == 0) {
            return null;
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new short[var4_int];
          }
          var5 = param1.g(4, param0);
          var6 = (short)param1.g(16, param0 + 0);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (short)(var6 + param1.g(var5, param0 + 0));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (short)var6;
            }
          }
          stackIn_16_0 = (short[]) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("bn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 107 / ((param0 - 23) / 49);
        field_d = null;
        field_b = null;
    }

    final static void c(int param0) {
        vg.field_Z.g((byte) 127);
        if (ui.field_c == null) {
          ui.field_c = new jj(vg.field_Z, cb.field_b);
        }
        vg.field_Z.c(ui.field_c, param0);
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          short[] var3 = (short[]) null;
          bn.a(69, (hb) null, (short[]) null, 72);
        }
        return this.field_a;
    }

    final String a(int param0) {
        int var2 = -76 / ((param0 + 20) / 48);
        return this.field_c;
    }

    bn(String param0) {
        this(param0, false);
    }

    bn(String param0, boolean param1) {
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_c = param0;
          if (null == this.field_c) {
            this.field_c = "";
          }
          stackIn_6_1 = (param1);
          this.field_a = stackIn_6_1;
          if (this.field_c.length() == 0) {
            this.field_a = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bn.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "This game has been updated! Please reload this page.";
    }
}
