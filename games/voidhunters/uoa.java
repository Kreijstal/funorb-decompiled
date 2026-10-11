/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uoa extends rna implements ntb {
    private int field_b;
    private int field_a;

    public final boolean a(byte param0, tv param1) {
        uoa var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -126 / ((param0 - 22) / 59);
          var3 = (uoa) (param1);
          stackIn_6_0 = (super.a((byte) -48, param1)) || (this.field_a != var3.field_a) || (this.field_b != var3.field_b);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("uoa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 == 9) {
          return 0 != (256 & param1) ? true : false;
        }
        uoa.a(14, -116, 46);
        return 0 != (256 & param1) ? true : false;
    }

    final static void a(String param0, int param1, float param2) {
        dkb.field_b = param2;
        if (param1 != -1) {
          return;
        }
        try {
          mnb.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uoa.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ucb a(pe param0, int param1) {
        RuntimeException var3 = null;
        tv var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26964) {
            return null;
          }
          var4 = (tv) null;
          this.a((byte) -70, (tv) null);
          stackIn_3_0 = null;
          return (ucb) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uoa.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
          uoa.a(125, 2, 96);
          if (li.field_i) {
            mmb.field_d[param0].a(param4, param2, 0, 16777215 | param1 << 24, 1);
            return;
          }
          return;
        }
        if (!li.field_i) {
          return;
        }
        mmb.field_d[param0].a(param4, param2, 0, 16777215 | param1 << 24, 1);
    }

    final void a(int param0, int[] param1, rsb param2) {
        try {
          if (param0 != 1) {
            this.field_a = 84;
          }
          param2.field_e.a((byte) -45, this.field_b, this.field_a);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uoa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0) {
        if (param0 == -1325) {
          return "Increment custom variable " + this.field_a + " by " + this.field_b;
        }
        return (String) null;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_a = param0.i(0, 32);
          this.field_b = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uoa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        uoa var5 = null;
        uoa var6 = null;
        try {
          var5 = (uoa) (param1);
          var6 = var5;
          super.b((byte) 79, param1);
          if (param0 < 54) {
            this.field_a = 86;
          }
          var6.field_a = this.field_a;
          var6.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uoa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 != 0) {
            this.field_b = param3;
          } else {
            this.field_a = param3;
            if (this.field_a < 0) {
              this.field_a = 0;
            }
          }
          if (!param1) {
            return;
          }
          this.a(34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("uoa.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        uoa var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, -23);
          if (param1 > -19) {
            return;
          }
          var5 = (uoa) (param0);
          var4 = 0;
          if (var5.field_a != this.field_a) {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.field_a + ", now=" + this.field_a);
          }
          if (this.field_b != var5.field_b) {
            var4 = 1;
            System.out.println("int value_added has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionActionAddToCustomVariable has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("uoa.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          return -14;
        }
        if (param0 == 0) {
          return this.field_a;
        }
        return this.field_b;
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -118);
          param0.a(-632, this.field_a, 32);
          if (param1 > -109) {
            tv var4 = (tv) null;
            this.a((byte) 32, (tv) null);
          }
          param0.a(-632, this.field_b, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uoa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 < 74) {
          return true;
        }
        return (33 & param1) != 0 ? true : false;
    }

    uoa() {
    }

    uoa(int param0, int param1) {
        this.field_b = param1;
        this.field_a = param0;
    }

    static {
    }
}
