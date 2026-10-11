/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cqb extends wm implements ntb {
    static boolean field_e;
    private int field_d;
    private int field_c;
    static String field_f;

    final String a(int param0) {
        if (param0 == -1) {
          return "Variable " + this.field_c + " at least " + this.field_d;
        }
        cqb.a(104, -21, -70, -33, (byte) -17);
        return "Variable " + this.field_c + " at least " + this.field_d;
    }

    public final boolean a(byte param0, tv param1) {
        cqb var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (cqb) (param1);
          var4 = 7 % ((22 - param0) / 59);
          stackIn_6_0 = (super.a((byte) 116, param1)) || (var3.field_c != this.field_c) || (var3.field_d != this.field_d);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("cqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        int var1 = -104 / ((param0 + 54) / 51);
        field_f = null;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        RuntimeException var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_d = 113;
          }
          stackIn_5_0 = !(param1.b(7061, this.field_c) < this.field_d);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("cqb.G(").append(param0).append(',');
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

    final static rn d(int param0) {
        int var1_int = 0;
        rn var2 = null;
        rn stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        if (param0 != 10) {
          return (rn) null;
        }
        try {
          var1_int = 0;
          while (true) {
            var2 = lnb.field_i.a((byte) -72, var1_int);
            if (var2.field_k) {
              stackIn_6_0 = var2;
              return stackIn_6_0;
            }
            var1_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    public final void b(byte param0, tv param1) {
        cqb var5 = null;
        cqb var6 = null;
        try {
          if (param0 <= 54) {
            this.a((byte) -47, -43);
          }
          super.b((byte) 82, param1);
          var5 = (cqb) (param1);
          var6 = var5;
          var6.field_d = this.field_d;
          var6.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        pja.e(-110);
        int var1 = -25 / ((46 - param0) / 35);
    }

    final ucb[] a(pe param0, int param1) {
        RuntimeException var3 = null;
        ucb[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -20605) {
            return null;
          }
          stackIn_3_0 = (ucb[]) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cqb.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    cqb() {
    }

    final void a(pe param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            this.field_c = param3;
            if (0 > this.field_c) {
              this.field_c = 0;
            }
          } else {
            this.field_d = param3;
          }
          if (param1 == -2) {
            return;
          }
          cqb.c(80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cqb.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -120);
        param0.a(-632, this.field_c, 32);
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cqb(int param0, int param1) {
        this.field_c = param0;
        this.field_d = param1;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_c = param0.i(0, 32);
          this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        int var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_k) != 0) {
          ifa.field_g[10] = !vqa.field_g.field_h ? fhb.field_o : csa.field_b;
          if (param0 > -76) {
            field_e = false;
            return;
          }
          return;
        }
        if (vqa.field_g.field_m.field_k == 0) {
          if ((vqa.field_g.field_B | 1 << vqa.field_g.field_L) != -1 + (1 << vqa.field_g.field_m.field_a)) {
            ifa.field_g[10] = !vqa.field_g.field_h ? ffb.field_d : eua.field_a;
            if (param0 > -76) {
              field_e = false;
              return;
            }
            return;
          }
          ifa.field_g[10] = vqa.field_g.field_h ? pva.field_e : gs.field_d;
          if (param0 <= -76) {
            return;
          }
          field_e = false;
          return;
        }
        ifa.field_g[10] = !vqa.field_g.field_h ? wpb.field_o : gdb.field_d;
        if (param0 <= -76) {
          return;
        }
        field_e = false;
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
          return -56;
        }
        if (param1 != 0) {
          return this.field_d;
        }
        return this.field_c;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        cqb var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, -64);
          var5 = (cqb) (param0);
          var4 = 0;
          if (var5.field_c != this.field_c) {
            System.out.println("int index has changed. before=" + var5.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (var5.field_d != this.field_d) {
            var4 = 1;
            System.out.println("int value has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (param1 > -19) {
            field_f = (String) null;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionConditionVariableAtLeast has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cqb.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -54) {
          return;
        }
        if (rb.field_c == null) {
          return;
        }
        rb.field_c.b(-10258, new pd(param3, param2, param0, param1));
    }

    static {
        field_f = "You must play 1 more rated game before playing with the current options.";
    }
}
