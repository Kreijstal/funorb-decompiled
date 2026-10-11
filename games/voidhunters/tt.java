/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends rna implements ntb {
    private int field_d;
    static String field_a;
    static dja field_c;
    private int field_b;

    public static void a(byte param0) {
        int var1 = -98 % ((param0 - 42) / 51);
        field_c = null;
        field_a = null;
    }

    final String a(int param0) {
        String var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = "Unknown mode";
        var3 = this.field_b;
        if (var3 == 0) {
          var2 = "Add body components to";
        } else {
          if (var3 == 1) {
            var2 = "Subtract body components from";
          } else {
            if (var3 == 2) {
              var2 = "Add 1 to";
            } else {
              if (3 == var3) {
                var2 = "Subtract 1 from";
              }
            }
          }
        }
        if (param0 != -1325) {
          this.field_b = -107;
        }
        return var2 + " custom variable " + this.field_d;
    }

    public final boolean a(byte param0, tv param1) {
        tt var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (tt) (param1);
          var4 = 78 / ((22 - param0) / 59);
          stackIn_6_0 = (super.a((byte) -64, param1)) || (this.field_d != var3.field_d) || (var3.field_b != this.field_b);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("tt.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          return 117;
        }
        if (param0 != 0) {
          return this.field_b;
        }
        return this.field_d;
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            field_a = (String) null;
          }
          super.b(param0, -124);
          param0.a(-632, this.field_d, 32);
          param0.a(-632, this.field_b, 2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tt.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4_int = 0;
        int var5 = 0;
        anb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return;
          }
          for (var4_int = 0; var4_int < param1.length; var4_int++) {
            var5 = param1[var4_int];
            var6 = param2.field_g.d((byte) -27, var5);
            if (var6 != null) {
              var7 = 1;
              var8 = this.field_b;
              if (var8 != 0) {
                if (var8 != 1) {
                  if (2 == var8) {
                    var7 = 1;
                  } else {
                    if (var8 == 3) {
                      var7 = -1;
                    }
                  }
                } else {
                  var7 = -var6.field_k.j(1);
                }
              } else {
                var7 = var6.field_k.j(param0 + 0);
              }
              param2.field_e.a((byte) -11, var7, this.field_d);
            }
          }
          if (param0 != 1) {
            field_c = (dja) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("tt.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        tt var5 = null;
        tt var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var5 = (tt) (param1);
          var6 = var5;
          super.b((byte) 55, param1);
          var6.field_b = this.field_b;
          var6.field_d = this.field_d;
          if (param0 <= 54) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("tt.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            tt.a((int[][]) null, -105);
          }
          if (param2 != 0) {
            this.field_b = (param3 + 4) % 4;
          } else {
            this.field_d = param3;
            if (0 > this.field_d) {
              this.field_d = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tt.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_d = param0.i(0, 32);
          this.field_b = param0.i(0, 2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tt.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int[][] param0, int param1) {
        try {
          rba.field_b = param0;
          if (param1 > -88) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tt.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          this.b((byte) 88, (tv) null);
          stackIn_3_0 = null;
          return (ucb) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tt.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    tt() {
    }

    tt(int param0, int param1) {
        this.field_b = param1;
        this.field_d = param0;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        tt var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, -90);
          if (param1 >= -19) {
            field_c = (dja) null;
          }
          var5 = (tt) (param0);
          var4 = 0;
          if (var5.field_d != this.field_d) {
            System.out.println("int index has changed. before=" + var5.field_d + ", now=" + this.field_d);
            var4 = 1;
          }
          if (this.field_b != var5.field_b) {
            System.out.println("int mode has changed. before=" + var5.field_b + ", now=" + this.field_b);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionActionAddBodyInfo has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tt.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Create your own free Jagex account";
        field_c = (dja) ((Object) new pu());
    }
}
