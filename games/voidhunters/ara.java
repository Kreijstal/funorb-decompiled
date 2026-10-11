/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ara extends ksa implements ntb {
    int field_f;
    int field_e;
    int field_d;
    static String field_g;
    int field_h;

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
          field_g = (String) null;
        }
    }

    final static void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 != 27671) {
              field_g = (String) null;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var4 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              qob.field_b = 1 + (int)(var3.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_d, 32);
          if (param1 >= -109) {
            this.field_e = 34;
          }
          param0.a(-632, this.field_e, 32);
          this.b(param0, false);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ara.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void a(tv param0, int param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ara var5 = null;
        try {
          var5 = (ara) (param0);
          var4 = 0;
          if (var5.field_d != this.field_d) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (var5.field_e != this.field_e) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          if (this.field_f != var5.field_f) {
            System.out.println("int dx has changed. before=" + var5.field_f + ", now=" + this.field_f);
            var4 = 1;
          }
          if (param1 > -19) {
            return;
          }
          if (this.field_h != var5.field_h) {
            var4 = 1;
            System.out.println("int dy has changed. before=" + var5.field_h + ", now=" + this.field_h);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MovingObject has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ara.F(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ara var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -111 / ((22 - param0) / 59);
          var4 = (ara) (param1);
          stackIn_5_0 = (var4.field_d != this.field_d) || (this.field_e != var4.field_e);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ara.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public void b(byte param0, tv param1) {
        ara var5 = null;
        ara var6 = null;
        try {
          var5 = (ara) (param1);
          var6 = var5;
          var6.field_d = this.field_d;
          if (param0 <= 54) {
            this.field_h = 125;
          }
          var6.field_f = this.field_f;
          var6.field_h = this.field_h;
          var6.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ara.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(faa param0, boolean param1) {
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_7_2 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1) {
            return;
          }
          stackIn_5_0 = (faa) (param0);
          stackIn_5_1 = 87;
          stackIn_7_2 = (this.field_f != 0) || (this.field_h != 0);
          if (!vq.a(stackIn_5_0, stackIn_5_1, stackIn_7_2)) {
            return;
          }
          param0.a(-632, this.field_f, 32);
          param0.a(-632, this.field_h, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ara.TB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    ara() {
    }

    private final void c(faa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32) {
            return;
          }
          if (!kv.a(false, param0)) {
            return;
          }
          this.field_f = param0.i(param1 - 32, 32);
          this.field_h = param0.i(0, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ara.QB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(faa param0, boolean param1) {
        try {
          this.field_d = param0.i(0, 32);
          if (param1) {
            field_g = (String) null;
          }
          this.field_e = param0.i(0, 32);
          this.c(param0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ara.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_g = "Sandbox";
    }
}
