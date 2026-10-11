/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends vg {
    static ura field_h;
    static int field_i;
    od field_f;
    od field_g;
    long field_j;

    public static void b(int param0) {
        if (param0 != 0) {
          field_i = 103;
          field_h = null;
          return;
        }
        field_h = null;
    }

    final boolean d(int param0) {
        if (this.field_f == null) {
          return false;
        }
        if (param0 != 0) {
          uia var3 = (uia) null;
          od.a(-117, (uia) null);
          return true;
        }
        return true;
    }

    final void a(boolean param0, long param1) {
        if (param0) {
          od.b(-57);
          if (this.field_f == null) {
            this.field_j = param1;
            return;
          }
          throw new RuntimeException();
        }
        if (this.field_f == null) {
          this.field_j = param1;
          return;
        }
        throw new RuntimeException();
    }

    final void c(int param0) {
        if (this.field_f == null) {
          return;
        }
        if (param0 == -7975) {
          this.field_f.field_g = this.field_g;
          this.field_g.field_f = this.field_f;
          this.field_f = null;
          this.field_g = null;
          return;
        }
    }

    final static hc a(int param0, uia param1) {
        RuntimeException var2 = null;
        hc stackIn_2_0 = null;
        hc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = new hc(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(-32768), param1.h(255));
            return stackIn_4_0;
          }
          stackIn_2_0 = (hc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("od.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    protected od() {
    }

    final long e(int param0) {
        if (param0 != 0) {
          return -21L;
        }
        return this.field_j;
    }

    static {
        field_h = new ura();
        field_i = 0;
    }
}
