/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int field_f;
    int field_d;
    boolean field_a;
    int field_g;
    int field_e;
    boolean field_c;
    int field_b;

    final void a(int param0, ds param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        ds var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param2 != 11) {
            var6 = (ds) null;
            this.a(-11, (ds) null, -118, true);
          }
          while (true) {
            var4_int = param1.e((byte) -127);
            if (var4_int == 0) {
              return;
            }
            this.a(param0, param1, var4_int, false);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("sr.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, ds param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param3) {
            this.field_b = 77;
          }
          if (1 == param2) {
            this.field_e = param1.e(1869);
            if (this.field_e != 65535) {
              return;
            }
            this.field_e = -1;
            return;
          }
          if (param2 == 2) {
            this.field_g = param1.e(1869) + 1;
            this.field_b = param1.e(1869) + 1;
            return;
          }
          if (param2 == 3) {
            param1.d((byte) -114);
            return;
          }
          if (param2 == 4) {
            this.field_f = param1.e((byte) -108);
            return;
          }
          if (param2 == 5) {
            this.field_d = param1.e((byte) -126);
            return;
          }
          if (6 == param2) {
            this.field_c = true;
            return;
          }
          if (param2 != 7) {
            return;
          }
          this.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("sr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    sr() {
        this.field_a = false;
        this.field_d = 1;
        this.field_f = 2;
        this.field_e = -1;
        this.field_c = false;
        this.field_g = 64;
        this.field_b = 64;
    }

    static {
    }
}
