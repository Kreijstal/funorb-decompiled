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
        rn var3;
        byte[] var4;
        rn var5;
        var3 = (rn) (this.field_c.b(0, (long)param1));
        if (var3 == null) {
          if (param0 == -72) {
            L0: {
              if (param1 < 32768) {
                var4 = this.field_a.a(0, param1, (byte) 13);
                break L0;
              } else {
                var4 = this.field_e.a(0, 32767 & param1, (byte) 13);
                break L0;
              }
            }
            var5 = new rn();
            if (var4 == null) {
              if (32768 <= param1) {
                var5.a(0);
                this.field_c.a(var5, (long)param1, (byte) -117);
                return var5;
              } else {
                this.field_c.a(var5, (long)param1, (byte) -117);
                return var5;
              }
            } else {
              var5.a(new ds(var4), param0 + 8524);
              if (32768 > param1) {
                this.field_c.a(var5, (long)param1, (byte) -117);
                return var5;
              } else {
                var5.a(0);
                this.field_c.a(var5, (long)param1, (byte) -117);
                return var5;
              }
            }
          } else {
            return (rn) null;
          }
        } else {
          return var3;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (!(dma.field_g < param3 + param1)) {
            return param1;
        }
        if (param0 != -109) {
            jv.a((byte) 16);
            if (!(0 > param2 + param1 - param3)) {
                return param2 + (param1 - param3);
            }
            return -param3 + dma.field_g;
        }
        if (!(0 > param2 + param1 - param3)) {
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new pfb(64);
        try {
          L0: {
            L1: {
              this.field_a = param1;
              this.field_e = param2;
              if (this.field_a == null) {
                break L1;
              } else {
                this.field_a.b(0, -6942);
                break L1;
              }
            }
            if (null == this.field_e) {
              break L0;
            } else {
              this.field_e.b(0, -6942);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("jv.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_d = (dja) ((Object) new efb());
        field_f = "Updates will sent to the email address you've given";
    }
}
