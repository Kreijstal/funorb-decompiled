/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends vg {
    static jea field_g;
    private int field_i;
    private int field_h;
    private int field_f;

    private final boolean b(int param0) {
        if (param0 >= 96) {
          return this.field_f < 6 ? true : false;
        }
        this.d(-115);
        return this.field_f < 6 ? true : false;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 2907) {
          field_g = (jea) null;
        }
    }

    final void a(int param0, kh param1) {
        boolean discarded$0 = false;
        try {
          param1.a((byte) 2, this.field_f, 4);
          if (param0 != -29928) {
            discarded$0 = this.b(-112);
          }
          param1.a((byte) -5, this.field_h / 50, 6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != 100) {
          return;
        }
        this.field_i = this.field_h;
    }

    final int a(byte param0) {
        if (param0 != 91) {
          this.field_f = -58;
          return this.field_f;
        }
        return this.field_f;
    }

    final boolean b(byte param0) {
        int var2 = -122 % ((7 - param0) / 52);
        if (this.field_h <= 0) {
          return false;
        }
        if (this.field_i <= 0) {
          return true;
        }
        return false;
    }

    final void c(int param0) {
        this.field_i = this.field_i - 1;
        if (param0 != -9) {
          field_g = (jea) null;
        }
    }

    final wf e(int param0) {
        if (param0 == -1) {
          return new wf(this.field_f, this.field_h);
        }
        hca var3 = (hca) null;
        this.a((byte) -15, (hca) null);
        return new wf(this.field_f, this.field_h);
    }

    private wf(int param0, int param1) {
        this.field_h = 100;
        this.field_f = param0;
        this.field_h = param1;
        this.d(100);
    }

    final boolean a(byte param0, hca param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        try {
          if (this.b(97)) {
            return false;
          }
          var3_int = this.field_f;
          if (6 == var3_int) {
          }
          var3_intLifetime1 = -41 % ((param0 - 43) / 44);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    wf(la param0, kh param1) {
        this.field_h = 100;
        try {
          this.field_f = param1.b((byte) 44, 4);
          if (param0.field_E > 8) {
            this.field_h = 50 * param1.b((byte) 44, 6);
          } else {
            this.field_h = 100;
          }
          this.d(100);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
