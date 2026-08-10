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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = (tr) ((Object) param0);
              var4 = 0;
              if (ikb.a(this.field_a, var3.field_a, false)) {
                var4 = 1;
                System.out.println("int[] values has changed. ");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var4 != 0) {
                System.out.println("This instance of SettingsInstance has changed");
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 < -19) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("tr.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        tr var3 = null;
        if (param0 < 54) {
            return;
        }
        try {
            var3 = (tr) ((Object) param1);
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = 8;

              if (this.field_a == null) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = this.field_a.length;
                break L1;
              }
            }
            pgb.a(stackIn_3_0, stackIn_3_1, -118, param0, this.field_a);
            if (param1 <= -109) {
              break L0;
            } else {
              tr.c(99);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("tr.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
        tv var3;
        if (param0 < 112) {
          var3 = (tv) null;
          this.a((tv) null, 78);
          kga.a(107, this.field_a);
          return;
        } else {
          kga.a(107, this.field_a);
          return;
        }
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
        String var1;
        String var2;
        L0: {
          if (dsa.field_p == null) {
            break L0;
          } else {
            var2 = dsa.field_p;
            var1 = var2;
            kqb.a(isa.a(sja.field_d, new String[]{var2}, 125), param0 ^ 6923);
            dsa.field_p = null;
            break L0;
          }
        }
        if (param0 != 6939) {
          field_b = (String) null;
          return;
        } else {
          return;
        }
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (tr) ((Object) param1);
            var4 = -34 % ((22 - param0) / 59);
            stackIn_1_0 = wpb.a(var3.field_a, this.field_a, (byte) 28);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("tr.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = "Disruptive behaviour";
    }
}
