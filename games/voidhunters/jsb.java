/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsb extends wm implements ntb {
    static int field_d;
    private int field_c;
    static String[] field_e;

    public final void a(tv param0, int param1) {
        jsb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          super.a(param0, -47);
          var3 = (jsb) (param0);
          var4 = 0;
          if (var3.field_c != this.field_c) {
            var4 = 1;
            System.out.println("int team_id has changed. before=" + var3.field_c + ", now=" + this.field_c);
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionShipJustSpawned has changed");
          }
          if (param1 >= -19) {
            field_d = -49;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jsb.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
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
          stackIn_7_1 = new StringBuilder().append("jsb.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] a(pe param0, int param1, int[] param2) {
        int var6 = 0;
        sg[] var4 = null;
        sg[] var5 = null;
        sg var7 = null;
        int var8 = 0;
        int[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var8 = VoidHunters.field_G;
        try {
          var4 = param0.d(1000);
          if (param1 <= 16) {
            this.a(-56);
          }
          var5 = var4;
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.q((byte) 114) == this.field_c &&
              !var7.l((byte) -10) &&
              var7.o((byte) -117) >= 0 &&
              var7.field_D) {
              param2 = qi.a(var7.c(false), true, param2, (byte) -14);
            }
          }
          stackIn_23_0 = (int[]) (param2);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("jsb.J(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final boolean a(int param0, lbb param1, pe param2) {
        int var6 = 0;
        RuntimeException var4 = null;
        sg[] var5 = null;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var9 = param2.d(param0 ^ 1000);
          var5 = var9;
          for (var6 = param0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.q((byte) 93) == this.field_c &&
              var7.field_D) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("jsb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 11) {
          jsb.b((byte) 113);
        }
        field_e = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        jsb var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -112 % ((param0 - 22) / 59);
          var4 = (jsb) (param1);
          stackIn_5_0 = (super.a((byte) -56, param1)) || (this.field_c != var4.field_c);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jsb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        jsb var6 = null;
        jsb var7 = null;
        try {
          var6 = (jsb) (param1);
          var7 = var6;
          if (param0 <= 54) {
            pe var4 = (pe) null;
            this.a((pe) null, -15);
          }
          super.b((byte) 81, param1);
          var7.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jsb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jsb() {
    }

    final String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        String var2 = "Any ship just spawned";
        return var2 + " onto team " + this.field_c;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_c = param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jsb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    jsb(int param0) {
        this.field_c = param0;
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
          pe var4 = (pe) null;
          this.a((pe) null, 9);
        }
        return this.field_c;
    }

    final void a(pe param0, int param1, int param2, int param3) {
        if (param1 != -2) {
          return;
        }
        try {
          this.field_c = (so.field_b + param3) % so.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jsb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -116);
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.field_c, 8);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jsb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = 1;
    }
}
