/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class imb implements ntb, utb {
    int field_c;
    static int field_a;
    int field_e;
    int field_d;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 54) {
          imb.a(64);
        }
    }

    public final void a(faa param0, byte param1) {
        param0.a(-632, this.field_c + 1, 5);
        param0.a(-632, this.field_e, 32);
        if (param1 > -91) {
          return;
        }
        try {
          param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "imb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, int param1) {
        try {
          this.field_c = param0.i(0, 5) - 1;
          this.field_e = param0.i(0, param1);
          this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "imb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        imb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -41 % ((param0 - 22) / 59);
          var3 = (imb) (param1);
          stackIn_3_0 = (var3.field_c != this.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("imb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        imb var5 = null;
        imb var6 = null;
        try {
          var5 = (imb) (param1);
          var6 = var5;
          if (param0 <= 54) {
            this.field_d = -122;
          }
          var6.field_e = this.field_e;
          var6.field_d = this.field_d;
          var6.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "imb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    imb() {
        this.field_c = -1;
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, 1 + this.field_c, 5);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "imb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.field_e = -38;
          }
          this.field_c = param0.i(0, 5) - 1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "imb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        imb var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (imb) (param0);
          var4 = 0;
          if (var6.field_c != this.field_c) {
            System.out.println("int connected_component_idx has changed. before=" + var6.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (this.field_e != var6.field_e) {
            var4 = 1;
            System.out.println("int worldx has changed. before=" + var6.field_e + ", now=" + this.field_e);
          }
          if (var6.field_d != this.field_d) {
            var4 = 1;
            System.out.println("int worldy has changed. before=" + var6.field_d + ", now=" + this.field_d);
          }
          if (param1 >= -19) {
            var5 = (tv) null;
            this.b((byte) 67, (tv) null);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of Hardpoint has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("imb.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_d = (param3 * param6 + param0 * param5 >> 16) + param2;
        if (param4 == -665140432) {
          this.field_e = param1 + (-(param6 * param0) + param3 * param5 >> 16);
          return;
        }
        faa var9 = (faa) null;
        this.a((faa) null, true);
        this.field_e = param1 + (-(param6 * param0) + param3 * param5 >> 16);
    }

    static {
        field_b = "Accurate and long ranged. High energy consumption";
    }
}
