/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IncrementVariableAction extends MissionAction implements DiffableState {
    private int valueAdded;
    private int index;

    public final boolean a(byte param0, tv param1) {
        IncrementVariableAction var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -126 / ((param0 - 22) / 59);
          var3 = (IncrementVariableAction) (param1);
          stackIn_6_0 = (super.a((byte) -48, param1)) || (this.index != var3.index) || (this.valueAdded != var3.valueAdded);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 == 9) {
          return 0 != (256 & param1) ? true : false;
        }
        IncrementVariableAction.a(14, -116, 46);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uoa.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ucb a(World param0, int param1) {
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
          IncrementVariableAction.a(125, 2, 96);
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

    final void a(int param0, int[] param1, GameSnapshot param2) {
        try {
          if (param0 != 1) {
            this.index = 84;
          }
          param2.missionState.a((byte) -45, this.valueAdded, this.index);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uoa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0) {
        if (param0 == -1325) {
          return "Increment custom variable " + this.index + " by " + this.valueAdded;
        }
        return (String) null;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.index = param0.i(0, 32);
          this.valueAdded = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uoa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        IncrementVariableAction var5 = null;
        IncrementVariableAction var6 = null;
        try {
          var5 = (IncrementVariableAction) (param1);
          var6 = var5;
          super.b((byte) 79, param1);
          if (param0 < 54) {
            this.index = 86;
          }
          var6.index = this.index;
          var6.valueAdded = this.valueAdded;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uoa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(World param0, boolean param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 != 0) {
            this.valueAdded = param3;
          } else {
            this.index = param3;
            if (this.index < 0) {
              this.index = 0;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        IncrementVariableAction var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -23);
          if (obfuscationGuard > -19) {
            return;
          }
          var5 = (IncrementVariableAction) (other);
          var4 = 0;
          if (var5.index != this.index) {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.index + ", now=" + this.index);
          }
          if (this.valueAdded != var5.valueAdded) {
            var4 = 1;
            System.out.println("int value_added has changed. before=" + var5.valueAdded + ", now=" + this.valueAdded);
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
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          return -14;
        }
        if (param0 == 0) {
          return this.index;
        }
        return this.valueAdded;
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -118);
          param0.a(-632, this.index, 32);
          if (param1 > -109) {
            tv var4 = (tv) null;
            this.a((byte) 32, (tv) null);
          }
          param0.a(-632, this.valueAdded, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uoa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 < 74) {
          return true;
        }
        return (33 & param1) != 0 ? true : false;
    }

    IncrementVariableAction() {
    }

    IncrementVariableAction(int param0, int param1) {
        this.valueAdded = param1;
        this.index = param0;
    }

    static {
    }
}
