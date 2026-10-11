/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqa implements ntb {
    String field_b;
    int field_a;

    public final void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.b((faa) null, 29);
          }
          param0.a(-632, this.field_a, 32);
          param0.r(32712);
          param0.b((byte) 0, this.field_b);
          param0.q(-110);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gqa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.field_a = param0.i(0, 32);
          param0.f((byte) -118);
          this.field_b = param0.g(-1609246200);
          param0.p(-23497);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gqa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        gqa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        faa var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (gqa) (param0);
          var4 = 0;
          if (this.field_a != var3.field_a) {
            iva.a(-6940, "int playerid has changed. before=" + var3.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (!var3.field_b.equals(this.field_b)) {
            iva.a(-6940, "String displayname has changed. ");
            var4 = 1;
          }
          if (param1 >= -19) {
            var5 = (faa) null;
            this.a((faa) null, false);
          }
          if (var4 == 0) {
            return;
          }
          tfb.a((byte) -58, "This instance of PlayerJoin has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("gqa.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        gqa var5 = null;
        gqa var6 = null;
        try {
          var5 = (gqa) (param1);
          var6 = var5;
          if (param0 <= 54) {
            this.field_b = (String) null;
          }
          var6.field_a = this.field_a;
          var6.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gqa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        gqa var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 36 / ((22 - param0) / 59);
          var3 = (gqa) (param1);
          stackIn_5_0 = (this.field_a != var3.field_a) || !(var3.field_b.equals(this.field_b));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gqa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
