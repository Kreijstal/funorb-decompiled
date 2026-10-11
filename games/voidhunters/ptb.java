/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ptb extends dmb implements ntb {
    private int field_h;
    static String field_f;
    private int field_d;
    private int field_e;
    private int field_g;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ptb var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 122 / ((param0 - 22) / 59);
          var4 = (ptb) (param1);
          stackIn_8_0 = (super.a((byte) 113, param1)) || (this.field_h != var4.field_h) || (this.field_g != var4.field_g) || (this.field_e != var4.field_e) || (this.field_d != var4.field_d);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ptb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(pe param0, boolean param1) {
        try {
          if (!param1) {
            tv var4 = (tv) null;
            this.a((byte) -16, (tv) null);
          }
          param0.a(this.field_h + this.field_e / 2, this.field_g + this.field_d / 2, this.field_g, false, -124, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ptb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -107) {
            stackIn_2_0 = 63;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = boa.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = ssa.field_a.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ptb.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -124);
        param0.a(-632, this.field_h, 32);
        param0.a(-632, this.field_g, 32);
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.field_e, 32);
          param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ptb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 120) {
          field_f = (String) null;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_h = param0.i(0, 32);
          this.field_g = param0.i(0, 32);
          this.field_e = param0.i(0, 32);
          this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ptb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        ptb var5 = null;
        ptb var6 = null;
        try {
          super.b((byte) 58, param1);
          var5 = (ptb) (param1);
          var6 = var5;
          if (param0 <= 54) {
            field_f = (String) null;
          }
          var6.field_d = this.field_d;
          var6.field_h = this.field_h;
          var6.field_e = this.field_e;
          var6.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ptb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ptb() {
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ptb var5 = null;
        try {
          super.a(param0, -57);
          var5 = (ptb) (param0);
          var4 = 0;
          if (this.field_h != var5.field_h) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_h + ", now=" + this.field_h);
          }
          if (this.field_g != var5.field_g) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_g + ", now=" + this.field_g);
          }
          if (this.field_e != var5.field_e) {
            System.out.println("int width has changed. before=" + var5.field_e + ", now=" + this.field_e);
            var4 = 1;
          }
          if (var5.field_d != this.field_d) {
            System.out.println("int height has changed. before=" + var5.field_d + ", now=" + this.field_d);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MapClearanceRectangle has changed");
          }
          if (param1 < -19) {
            return;
          }
          this.field_e = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ptb.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    ptb(int param0, int param1, int param2, int param3) {
        this.field_h = param0;
        this.field_e = param2;
        this.field_d = param3;
        this.field_g = param1;
    }

    static {
        field_f = "New";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -107) {
            stackIn_2_0 = 63;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = boa.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = ssa.field_a.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ptb.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }
}
