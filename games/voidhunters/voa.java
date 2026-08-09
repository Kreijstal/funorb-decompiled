/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class voa {
    static int field_d;
    static int field_b;
    private pfb field_c;
    private asb field_e;
    private asb field_a;

    final pi a(int param0, int param1) {
        pi var3;
        byte[] var4;
        pi var5;
        pi var6;
        var3 = (pi) (this.field_c.b(0, (long)param0));
        if (var3 == null) {
          if (param1 < -99) {
            L0: {
              if (32768 > param0) {
                var4 = this.field_a.a(1, param0, (byte) 13);
                break L0;
              } else {
                var4 = this.field_e.a(1, param0 & 32767, (byte) 13);
                break L0;
              }
            }
            var6 = new pi();
            if (var4 != null) {
              L1: {
                var6.a(new ds(var4), -1);
                if ((param0 ^ -1) <= -32769) {
                  var6.e((byte) 97);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_c.a(var6, (long)param0, (byte) -117);
              return var6;
            } else {
              L2: {
                if ((param0 ^ -1) <= -32769) {
                  var6.e((byte) 97);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_c.a(var6, (long)param0, (byte) -117);
              return var6;
            }
          } else {
            L3: {
              this.field_c = (pfb) null;
              if (32768 > param0) {
                var4 = this.field_a.a(1, param0, (byte) 13);
                break L3;
              } else {
                var4 = this.field_e.a(1, param0 & 32767, (byte) 13);
                break L3;
              }
            }
            var5 = new pi();
            if (var4 == null) {
              L4: {
                if ((param0 ^ -1) <= -32769) {
                  var5.e((byte) 97);
                  break L4;
                } else {
                  break L4;
                }
              }
              this.field_c.a(var5, (long)param0, (byte) -117);
              return var5;
            } else {
              L5: {
                var5.a(new ds(var4), -1);
                if ((param0 ^ -1) <= -32769) {
                  var5.e((byte) 97);
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_c.a(var5, (long)param0, (byte) -117);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    voa(int param0, asb param1, asb param2, rs param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
                this.field_a.b(1, -6942);
                break L1;
              }
            }
            if (null != this.field_e) {
              this.field_e.b(1, -6942);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("voa.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_b = 1280;
        field_d = 0;
    }
}
