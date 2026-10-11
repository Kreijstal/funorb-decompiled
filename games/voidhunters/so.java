/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so implements ntb {
    static phb field_e;
    static int field_b;
    int field_a;
    int field_c;
    static String field_d;
    static int[] field_f;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 != 61) {
          field_b = 59;
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        so var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (so) (param0);
          if (param1 > -19) {
            var5 = (faa) null;
            this.a((faa) null, false);
          }
          var4 = 0;
          if (this.field_a != var6.field_a) {
            System.out.println("int id has changed. before=" + var6.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (this.field_c != var6.field_c) {
            System.out.println("int value has changed. before=" + var6.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SettingsChange has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("so.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_a = param0.i(0, 32);
          this.field_c = param0.i(0, 32);
          if (param1) {
            field_f = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "so.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    so() {
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_a, 32);
          param0.a(-632, this.field_c, 32);
          if (param1 >= -109) {
            faa var4 = (faa) null;
            this.b((faa) null, 25);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "so.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    so(int param0, int param1) {
        this.field_c = param1;
        this.field_a = param0;
    }

    public final boolean a(byte param0, tv param1) {
        so var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (so) (param1);
          var4 = -54 / ((22 - param0) / 59);
          stackIn_5_0 = (this.field_a != var3.field_a) || (var3.field_c != this.field_c);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("so.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        so var5 = null;
        so var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (so) (param1);
          var6 = var5;
          var6.field_a = this.field_a;
          var6.field_c = this.field_c;
          if (param0 > 54) {
            return;
          }
          this.field_c = -97;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("so.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_b = 3;
        field_d = "Create";
    }
}
