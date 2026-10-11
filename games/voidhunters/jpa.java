/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jpa extends rna implements ntb {
    private int field_b;
    static dja field_c;
    static boolean field_a;
    private int field_d;

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
          this.a(-98, -31);
          stackIn_3_0 = null;
          return (ucb) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jpa.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        pe var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            this.field_b = param3;
            if (this.field_b < 0) {
              this.field_b = 0;
            }
          } else {
            this.field_d = (param3 + 2) % 2;
          }
          if (!param1) {
            return;
          }
          var6 = (pe) null;
          this.a((pe) null, false, 39, -42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("jpa.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tv var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return;
          }
          if (param0 != 1) {
            var8 = (tv) null;
            this.a((byte) 94, (tv) null);
          }
          for (var4_int = 0; param1.length > var4_int; var4_int++) {
            var5 = 1;
            var6 = this.field_d;
            if (var6 == 0) {
              var5 = 1;
              param2.field_e.a((byte) -93, var5, this.field_b);
            } else {
              if (1 != var6) {
                param2.field_e.a((byte) -93, var5, this.field_b);
              } else {
                var5 = -1;
                param2.field_e.a((byte) -93, var5, this.field_b);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("jpa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_b = param0.i(0, 8);
          this.field_d = param0.i(0, 1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jpa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        jpa var4 = (jpa) (param1);
        jpa var3 = var4;
        super.b((byte) 90, param1);
        if (param0 < 54) {
          return;
        }
        try {
          var4.field_d = this.field_d;
          var4.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jpa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          jpa.b(127);
        }
    }

    final String a(int param0) {
        String var5 = null;
        String var7 = null;
        String var6 = null;
        String var10 = null;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int var3Lifetime1;
        if (param0 != -1325) {
          jpa.a(true);
          var5 = "Unknown mode";
          var3 = this.field_d;
          if (var3 != 0) {
            if (var3 == 1) {
              var7 = "Subtract 1 from";
              return var7 + " custom variable " + this.field_b;
            }
            return var5 + " custom variable " + this.field_b;
          }
          var6 = "Add 1 to";
          return var6 + " custom variable " + this.field_b;
        }
        String var8 = "Unknown mode";
        var3Lifetime1 = this.field_d;
        if (var3Lifetime1 != 0) {
          if (var3Lifetime1 == 1) {
            var10 = "Subtract 1 from";
            return var10 + " custom variable " + this.field_b;
          }
          return var8 + " custom variable " + this.field_b;
        }
        String var9 = "Add 1 to";
        return var9 + " custom variable " + this.field_b;
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -116);
          param0.a(-632, this.field_b, 8);
          if (param1 >= -109) {
            field_c = (dja) null;
          }
          param0.a(-632, this.field_d, 1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jpa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        var1 = wt.a(false);
        if (param0 != 7) {
          return true;
        }
        var3 = -pkb.field_o + var1;
        if (30000L < var3) {
          pkb.field_o = var1;
          nkb.field_q = 0;
          return true;
        }
        var5 = 3000;
        if (nkb.field_q >= 7) {
          var5 = 12000;
        } else {
          if (nkb.field_q >= 5) {
            var5 = 9000;
          } else {
            if (3 <= nkb.field_q) {
              var5 = 6000;
            }
          }
        }
        if (var3 <= (long)var5) {
          return false;
        }
        nkb.field_q = nkb.field_q + 1;
        pkb.field_o = var1;
        return true;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        jpa var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, -67);
          var6 = (jpa) (param0);
          var4 = 0;
          if (param1 > -19) {
            var5 = (faa) null;
            this.a((faa) null, false);
          }
          if (this.field_b != var6.field_b) {
            System.out.println("int index has changed. before=" + var6.field_b + ", now=" + this.field_b);
            var4 = 1;
          }
          if (var6.field_d != this.field_d) {
            var4 = 1;
            System.out.println("int mode has changed. before=" + var6.field_d + ", now=" + this.field_d);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionActionAddNodeInfo has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jpa.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        jpa var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (jpa) (param1);
          var4 = 67 % ((22 - param0) / 59);
          stackIn_6_0 = (super.a((byte) 92, param1)) || (this.field_b != var3.field_b) || (var3.field_d != this.field_d);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("jpa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    jpa() {
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          pe var4 = (pe) null;
          this.a((pe) null, 85);
          if (param0 != 0) {
            return this.field_d;
          }
          return this.field_b;
        }
        if (param0 != 0) {
          return this.field_d;
        }
        return this.field_b;
    }

    jpa(int param0, int param1) {
        this.field_d = param1;
        this.field_b = param0;
    }

    static {
        field_c = (dja) ((Object) new csb());
    }
}
