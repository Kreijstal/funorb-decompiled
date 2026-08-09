/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static nh field_e;
    private cn field_a;
    private dd field_c;
    private cn field_d;
    static int[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 44) {
            nc.a(-93);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final br a(byte param0, int param1) {
        br var3;
        byte[] var4;
        int var5;
        br var6;
        var3 = (br) (this.field_c.a((byte) 114, (long)param1));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if ((param1 ^ -1) > -32769) {
              var4 = this.field_a.a(false, 0, param1);
              break L0;
            } else {
              var4 = this.field_d.a(false, 0, 32767 & param1);
              break L0;
            }
          }
          var6 = new br();
          if (var4 != null) {
            L1: {
              var6.a(new uia(var4), -26706);
              if ((param1 ^ -1) <= -32769) {
                var6.a(10211);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = -55 / ((param0 - -25) / 35);
            this.field_c.a(29166, var6, (long)param1);
            return var6;
          } else {
            L2: {
              if ((param1 ^ -1) <= -32769) {
                var6.a(10211);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = -55 / ((param0 - -25) / 35);
            this.field_c.a(29166, var6, (long)param1);
            return var6;
          }
        }
    }

    nc(int param0, cn param1, cn param2) {
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
        this.field_c = new dd(64);
        try {
          L0: {
            L1: {
              this.field_a = param1;
              this.field_d = param2;
              if (this.field_a == null) {
                break L1;
              } else {
                this.field_a.a((byte) -88, 0);
                break L1;
              }
            }
            if (null == this.field_d) {
              break L0;
            } else {
              this.field_d.a((byte) -91, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("nc.<init>(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_b = new int[8192];
    }
}
