/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends rna implements ntb {
    private int field_b;
    private int field_c;
    static String field_a;

    final static void d(int param0) {
        if (efb.field_b != null) {
          efb.field_b.field_b = false;
        }
        mb.h(param0, param0 + 101);
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          field_a = (String) null;
          if (param0 != 0) {
            return this.field_c;
          }
          return this.field_b;
        }
        if (param0 != 0) {
          return this.field_c;
        }
        return this.field_b;
    }

    public static void c(int param0) {
        field_a = null;
        int var1 = -42 / ((param0 - 27) / 47);
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        cf var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, -87);
          var5 = (cf) (param0);
          var4 = 0;
          if (this.field_b != var5.field_b) {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (var5.field_c != this.field_c) {
            System.out.println("int label has changed. before=" + var5.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (param1 >= -19) {
            return;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionActionSetCustomVariableLabel has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cf.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == -1325) {
          var2 = Integer.toString(this.field_c);
          if (this.field_c >= 0 &&
            this.field_c < pu.field_c.length) {
            var2 = pu.field_c[this.field_c];
          }
          return "Set label of custom variable " + this.field_b + " to " + var2;
        }
        field_a = (String) null;
        var2Lifetime1 = Integer.toString(this.field_c);
        if (this.field_c >= 0 &&
          this.field_c < pu.field_c.length) {
          var2Lifetime1 = pu.field_c[this.field_c];
        }
        return "Set label of custom variable " + this.field_b + " to " + var2Lifetime1;
    }

    final void a(int param0, int[] param1, rsb param2) {
        RuntimeException var4 = null;
        et var6 = null;
        et var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            this.field_c = 117;
          }
          var6 = param2.field_e.c(-1, this.field_b);
          var7 = var6;
          if (var7 == null) {
            return;
          }
          var7.field_b = this.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("cf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -111);
          param0.a(-632, this.field_b, 32);
          param0.a(-632, this.field_c, 32);
          if (param1 >= -109) {
            cf.c(48);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        pe var6 = null;
        try {
          if (param2 == 0) {
            this.field_b = param3;
            if (this.field_b < 0) {
              this.field_b = 0;
            }
          } else {
            this.field_c = param3;
            if (this.field_c < 0) {
              this.field_c = (this.field_c + pu.field_c.length) % pu.field_c.length;
            }
          }
          if (!param1) {
            return;
          }
          var6 = (pe) null;
          this.a((pe) null, -77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("cf.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_b = param0.i(0, 32);
          this.field_c = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cf.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        cf var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -11 % ((22 - param0) / 59);
          var3 = (cf) (param1);
          stackIn_6_0 = (super.a((byte) 96, param1)) || (this.field_b != var3.field_b) || (this.field_c != var3.field_c);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("cf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    cf() {
    }

    cf(int param0, int param1) {
        this.field_b = param0;
        this.field_c = param1;
    }

    final static void b(int param0) {
        msa.field_s = brb.f((byte) 62);
        qn.field_h = new ida();
        lva.e((byte) 117);
        if (param0 != 32) {
          cf.b(3);
        }
    }

    public final void b(byte param0, tv param1) {
        cf var5 = null;
        cf var6 = null;
        try {
          if (param0 <= 54) {
            field_a = (String) null;
          }
          var5 = (cf) (param1);
          var6 = var5;
          super.b((byte) 110, param1);
          var6.field_c = this.field_c;
          var6.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ucb a(pe param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26964) {
            return null;
          }
          this.field_c = -111;
          stackIn_3_0 = null;
          return (ucb) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cf.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "You need to be in the main menu or sandbox mode to load ships";
    }
}
