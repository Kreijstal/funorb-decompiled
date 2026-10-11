/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends mc {
    static faa field_w;
    static jra field_v;

    final void a(int param0) {
        int var2 = 43 / ((-80 - param0) / 42);
        this.field_t.a(false);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 == 0) {
          if (null == this.field_q) {
            if (param2 < 47) {
              return;
            }
            if (this.field_h == 0) {
              return;
            }
            if (this.field_f != 0) {
              msa.field_s.a(this.field_r + param3 + this.field_f, (byte) 123, this.field_h + this.field_g + param0, param3 + this.field_r, param0 + this.field_g);
              this.field_t.b(param0 + this.field_g, param1, 63, param3 + this.field_r);
              msa.field_s.a((byte) 92);
              return;
            }
            return;
          }
          this.field_q.a(92, (shb) (this), param0, param3, true);
        }
        if (param2 < 47) {
          return;
        }
        if (this.field_h == 0) {
          return;
        }
        if (this.field_f != 0) {
          msa.field_s.a(this.field_r + param3 + this.field_f, (byte) 123, this.field_h + this.field_g + param0, param3 + this.field_r, param0 + this.field_g);
          this.field_t.b(param0 + this.field_g, param1, 63, param3 + this.field_r);
          msa.field_s.a((byte) 92);
          return;
        }
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 <= 40) {
          bk.e(87);
          field_w = null;
          return;
        }
        field_w = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            this.b(90, -56, -39, 108);
          }
          stackIn_6_0 = (this.a(param2, param1, param0, param5, (byte) 22)) && (super.a(param0, param1, param2, param3, param4, param5, (byte) -123));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("bk.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    bk(int param0, int param1, int param2, int param3, wwa param4, shb param5) {
        super(param0, param1, param2, param3, param4, (sba) null);
        try {
          this.field_t = param5;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new faa(1048576);
        field_v = new jra();
    }
}
