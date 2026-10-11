/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ova {
    private int field_a;
    private byte[] field_c;
    private int field_e;
    private int field_d;
    private int field_b;
    private int field_f;

    final boolean a(int param0) {
        if (param0 == 0) {
          return this.field_c == null ? true : false;
        }
        byte[] var3 = (byte[]) null;
        this.a((byte[]) null, 29);
        return this.field_c == null ? true : false;
    }

    final void a(byte[] param0, int param1) {
        try {
          this.field_c = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ova.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(faa param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          if (null == this.field_c) {
            return;
          }
          fieldTemp$0 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_a = this.field_a + this.field_f;
          if (param1) {
            System.out.println("updating datasender, total " + this.field_c.length);
          }
          var4_int = param0.field_h.length - param0.field_e;
          if (param2 <= 121) {
            this.field_e = 8;
          }
          var5 = -this.field_d + var4_int;
          if (param1) {
            System.out.println("sendable_now " + var5);
          }
          if (var5 <= 0) {
            return;
          }
          param0.h(24335, this.field_e);
          param0.field_e = param0.field_e + 2;
          var6 = param0.field_e;
          param0.d(this.field_c.length, 332614536);
          param0.d(this.field_b, 332614536);
          if (var5 > this.field_c.length - this.field_b) {
            var5 = -this.field_b + this.field_c.length;
          }
          param0.a(var5, true);
          param0.a(this.field_b, this.field_c, -1, var5);
          param0.a(param0.field_e - var6, -124);
          this.field_b = this.field_b + var5;
          if (this.field_b >= this.field_c.length) {
            this.field_c = null;
            if (!param1) {
              return;
            }
            System.out.println("done sending this data.");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ova.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ova(int param0) {
        this.field_d = 1024;
        this.field_f = 8;
        this.field_a = 0;
        this.field_e = param0;
    }

    static {
    }
}
