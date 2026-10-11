/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr implements ntb {
    static String field_b;
    int[] field_a;

    public final void a(tv param0, int param1) {
        tr var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (tr) (param0);
          var4 = 0;
          if (ikb.a(this.field_a, var3.field_a, false)) {
            var4 = 1;
            System.out.println("int[] values has changed. ");
          }
          if (var4 != 0) {
            System.out.println("This instance of SettingsInstance has changed");
          }
          if (param1 < -19) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("tr.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        tr var3 = null;
        if (param0 < 54) {
          return;
        }
        try {
          var3 = (tr) (param1);
          var3.field_a = dob.a(var3.field_a, (byte) -50, this.field_a);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        gwa.a(param4, -1, (double)param0, param2, (double)param3);
        if (param1) {
          field_b = (String) null;
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = 8;
          if (this.field_a == null) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = this.field_a.length;
          }
          pgb.a(stackIn_2_0, stackIn_3_1, -118, param0, this.field_a);
          if (param1 <= -109) {
            return;
          }
          tr.c(99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("tr.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = VoidHunters.field_G;
        if (param0 != -15400) {
          return;
        }
        try {
          for (var1_int = 0; ou.field_q > var1_int; var1_int++) {
            nrb.field_b[var1_int] = null;
          }
          ou.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tr.E(" + param0 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_a = wkb.a((byte) 37, this.field_a, param0, 8);
          if (param1) {
            this.field_a = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        if (param0 >= 112) {
          kga.a(107, this.field_a);
          return;
        }
        tv var3 = (tv) null;
        this.a((tv) null, 78);
        kga.a(107, this.field_a);
    }

    final static boolean a(int param0, int param1) {
        int var2 = 100 / ((-57 - param0) / 61);
        return hab.field_g[param1].field_r;
    }

    public static void b(int param0) {
        if (param0 != 17674) {
          return;
        }
        field_b = null;
    }

    final static void c(int param0) {
        String var2 = null;
        if (dsa.field_p != null) {
          var2 = dsa.field_p;
          String var1 = var2;
          kqb.a(isa.a(sja.field_d, new String[]{var2}, 125), param0 ^ 6923);
          dsa.field_p = null;
        }
        if (param0 == 6939) {
          return;
        }
        field_b = (String) null;
    }

    final void a(int param0, so param1) {
        try {
          this.field_a[param1.field_a] = param1.field_c;
          int var3_int = 127 / ((-39 - param0) / 54);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tr.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    tr() {
        kga.a(107, sp.field_p);
        this.field_a = ik.a(-21049);
    }

    public final boolean a(byte param0, tv param1) {
        tr var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (tr) (param1);
          var4 = -34 % ((22 - param0) / 59);
          stackIn_1_0 = wpb.a(var3.field_a, this.field_a, (byte) 28);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("tr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_b = "Disruptive behaviour";
    }
}
