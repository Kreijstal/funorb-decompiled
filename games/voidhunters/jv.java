/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static dja field_d;
    private asb field_e;
    private asb field_a;
    private pfb field_c;
    static int field_b;
    static String field_f;

    final rn a(byte param0, int param1) {
        byte[] var4 = null;
        rn var3 = (rn) (this.field_c.b(0, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param0 != -72) {
          return (rn) null;
        }
        if (param1 >= 32768) {
          var4 = this.field_e.a(0, 32767 & param1, (byte) 13);
        } else {
          var4 = this.field_a.a(0, param1, (byte) 13);
        }
        rn var5 = new rn();
        if (var4 != null) {
          var5.a(new ds(var4), param0 + 8524);
          if (32768 <= param1) {
            var5.a(0);
            this.field_c.a(var5, (long)param1, (byte) -117);
            return var5;
          }
          this.field_c.a(var5, (long)param1, (byte) -117);
          return var5;
        }
        if (32768 > param1) {
          this.field_c.a(var5, (long)param1, (byte) -117);
          return var5;
        }
        var5.a(0);
        this.field_c.a(var5, (long)param1, (byte) -117);
        return var5;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (!(dma.field_g < param3 + param1)) {
          return param1;
        }
        if (param0 != -109) {
          jv.a((byte) 16);
          if (0 <= param2 + param1 - param3) {
            return param2 + (param1 - param3);
          }
          return -param3 + dma.field_g;
        }
        if (0 <= param2 + param1 - param3) {
          return param2 + (param1 - param3);
        }
        return -param3 + dma.field_g;
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != -33) {
          field_b = -56;
        }
    }

    jv(int param0, asb param1, asb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new pfb(64);
        try {
          this.field_a = param1;
          this.field_e = param2;
          if (this.field_a != null) {
            this.field_a.b(0, -6942);
          }
          if (null == this.field_e) {
            return;
          }
          this.field_e.b(0, -6942);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jv.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_d = (dja) ((Object) new efb());
        field_f = "Updates will sent to the email address you've given";
    }
}
