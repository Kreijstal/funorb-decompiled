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
        byte[] var4 = null;
        if (param1 != -11452) {
          return (tl) null;
        }
        tl var3 = (tl) (this.field_a.a((byte) 127, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_c.a(1, true, param0);
        } else {
          var4 = this.field_b.a(1, true, param0 & 32767);
        }
        tl var5 = new tl();
        if (var4 != null) {
          var5.a(new k(var4), (byte) 118);
          if (param0 >= 32768) {
            var5.c((byte) 100);
            this.field_a.a(var5, (long)param0, 1);
            return var5;
          }
          this.field_a.a(var5, (long)param0, 1);
          return var5;
        }
        if (param0 < 32768) {
          this.field_a.a(var5, (long)param0, 1);
          return var5;
        }
        var5.c((byte) 100);
        this.field_a.a(var5, (long)param0, 1);
        return var5;
    }

    final static void a(int param0, boolean param1) {
        oj var2 = null;
        dq.field_k.c(param1, -1);
        if (param0 == 1) {
          var2 = ra.field_f;
          if (var2 != null) {
            var2.a(param0 ^ -112, dq.field_k.field_qb, dq.field_k.field_w);
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
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = new io(64);
        try {
          this.field_c = param1;
          this.field_b = param2;
          if (this.field_c != null) {
            this.field_c.d(1, -2);
          }
          if (this.field_b == null) {
            return;
          }
          this.field_b.d(1, -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("an.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
