/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class odb implements ntb {
    int field_a;
    static llb field_b;
    int field_d;
    int field_c;

    public final void b(byte param0, tv param1) {
        odb var4 = (odb) (param1);
        odb var3 = var4;
        var4.field_a = this.field_a;
        var4.field_d = this.field_d;
        if (param0 < 54) {
          return;
        }
        try {
          var4.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "odb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.field_a = -41;
          }
          this.field_a = param0.i(0, 32);
          this.field_d = param0.i(0, 32);
          this.field_c = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "odb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        odb var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -19) {
            return;
          }
          var5 = (odb) (param0);
          var4 = 0;
          if (var5.field_a != this.field_a) {
            System.out.println("int target_id has changed. before=" + var5.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (this.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int target_x has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (var5.field_c != this.field_c) {
            System.out.println("int target_y has changed. before=" + var5.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of TargetLock has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("odb.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_a, 32);
          param0.a(-632, this.field_d, 32);
          param0.a(-632, this.field_c, 32);
          if (param1 >= -109) {
            this.field_c = -84;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "odb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        odb var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -108 / ((22 - param0) / 59);
          var4 = (odb) (param1);
          stackIn_6_0 = (this.field_a != var4.field_a) || (this.field_d != var4.field_d) || (var4.field_c != this.field_c);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("odb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
