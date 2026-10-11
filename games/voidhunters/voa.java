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
        byte[] var4Lifetime1;
        var3 = (pi) (this.field_c.b(0, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (param1 < -99) {
          if (32768 > param0) {
            var4 = this.field_a.a(1, param0, (byte) 13);
          } else {
            var4 = this.field_e.a(1, param0 & 32767, (byte) 13);
          }
          var6 = new pi();
          if (var4 != null) {
            var6.a(new ds(var4), -1);
          }
          if (param0 >= 32768) {
            var6.e((byte) 97);
          }
          this.field_c.a(var6, (long)param0, (byte) -117);
          return var6;
        }
        this.field_c = (pfb) null;
        if (32768 > param0) {
          var4Lifetime1 = this.field_a.a(1, param0, (byte) 13);
        } else {
          var4Lifetime1 = this.field_e.a(1, param0 & 32767, (byte) 13);
        }
        var5 = new pi();
        if (var4Lifetime1 != null) {
          var5.a(new ds(var4Lifetime1), -1);
        }
        if (param0 >= 32768) {
          var5.e((byte) 97);
        }
        this.field_c.a(var5, (long)param0, (byte) -117);
        return var5;
    }

    voa(int param0, asb param1, asb param2, rs param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new pfb(64);
        try {
          this.field_a = param1;
          this.field_e = param2;
          if (this.field_a != null) {
            this.field_a.b(1, -6942);
          }
          if (null == this.field_e) {
            return;
          }
          this.field_e.b(1, -6942);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("voa.<init>(").append(param0).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = 1280;
        field_d = 0;
    }
}
