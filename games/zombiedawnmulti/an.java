/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private io field_a;
    private ul field_b;
    private ul field_c;

    final static void a(byte param0, ld param1) {
        try {
            rp.field_l.a((byte) 50, param1);
            if (param0 < 42) {
                ld var3 = (ld) null;
                an.a((byte) 16, (ld) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "an.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tl a(int param0, int param1) {
        tl var3;
        byte[] var4;
        tl var5;
        if (param1 == -11452) {
          var3 = (tl) (this.field_a.a((byte) 127, (long)param0));
          if (var3 == null) {
            L0: {
              if ((param0 ^ -1) <= -32769) {
                var4 = this.field_b.a(1, true, param0 & 32767);
                break L0;
              } else {
                var4 = this.field_c.a(1, true, param0);
                break L0;
              }
            }
            var5 = new tl();
            if (var4 == null) {
              if (param0 >= 32768) {
                var5.c((byte) 100);
                this.field_a.a(var5, (long)param0, 1);
                return var5;
              } else {
                this.field_a.a(var5, (long)param0, 1);
                return var5;
              }
            } else {
              var5.a(new k(var4), (byte) 118);
              if (param0 < 32768) {
                this.field_a.a(var5, (long)param0, 1);
                return var5;
              } else {
                var5.c((byte) 100);
                this.field_a.a(var5, (long)param0, 1);
                return var5;
              }
            }
          } else {
            return var3;
          }
        } else {
          return (tl) null;
        }
    }

    final static void a(int param0, boolean param1) {
        oj var2;
        dq.field_k.c(param1, -1);
        if (param0 != 1) {
          return;
        } else {
          L0: {
            var2 = ra.field_f;
            if (var2 != null) {
              var2.a(param0 ^ -112, dq.field_k.field_qb, dq.field_k.field_w);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static hf a(int param0) {
        if (param0 != 1) {
            return (hf) null;
        }
        return new hf(gg.a(91), po.c(128));
    }

    an(int param0, ul param1, ul param2, dr param3) {
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
        this.field_a = new io(64);
        try {
          L0: {
            L1: {
              this.field_c = param1;
              this.field_b = param2;
              if (this.field_c == null) {
                break L1;
              } else {
                this.field_c.d(1, -2);
                break L1;
              }
            }
            if (this.field_b != null) {
              this.field_b.d(1, -2);
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

            stackIn_9_1 = new StringBuilder().append("an.<init>(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    static {
    }
}
