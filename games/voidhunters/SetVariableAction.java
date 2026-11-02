/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetVariableAction extends MissionAction implements DiffableState {
    static mma field_c;
    private int index;
    static int field_b;
    private int value;

    final static float a(byte param0, float param1) {
        int var2 = -128 % ((-87 - param0) / 36);
        return ((param1 * 6.0f - 15.0f) * param1 + 10.0f) * (param1 * param1 * param1);
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        SetVariableAction var5 = null;
        SetVariableAction var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (SetVariableAction) (param1);
          var6 = var5;
          super.b((byte) 70, param1);
          var6.index = this.index;
          var6.value = this.value;
          if (param0 > 54) {
            return;
          }
          this.value = 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("pob.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, int[] param1, GameSnapshot param2) {
        try {
          param2.missionState.b(2, this.value, this.index);
          if (param0 != 1) {
            this.value = -49;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pob.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0) {
        if (param0 == -1325) {
          return "Set custom variable " + this.index + " to " + this.value;
        }
        World var3 = (World) null;
        this.a((World) null, true, -7, 72);
        return "Set custom variable " + this.index + " to " + this.value;
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          field_c = (mma) null;
          if (0 != param0) {
            return this.value;
          }
          return this.index;
        }
        if (0 != param0) {
          return this.value;
        }
        return this.index;
    }

    final ucb a(World param0, int param1) {
        RuntimeException var3 = null;
        ucb stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26964) {
            return null;
          }
          stackIn_3_0 = (ucb) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pob.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int b(int param0) {
        int var1 = -61 / ((75 - param0) / 43);
        return SetDebrisCarryOverPercentage.field_p;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        SetVariableAction var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -89);
          var5 = (SetVariableAction) (other);
          var4 = 0;
          if (this.index != var5.index) {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.index + ", now=" + this.index);
          }
          if (this.value != var5.value) {
            var4 = 1;
            System.out.println("int value has changed. before=" + var5.value + ", now=" + this.value);
          }
          if (obfuscationGuard > -19) {
            field_c = (mma) null;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionActionSetCustomVariable has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("pob.F(");
          if (other == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(World param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return;
          }
          if (param2 != 0) {
            this.value = param3;
            return;
          }
          this.index = param3;
          if (this.index >= 0) {
            return;
          }
          this.index = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pob.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 22) {
          SetVariableAction.a((byte) 65);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.index = param0.i(0, 32);
          this.value = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pob.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -127);
          param0.a(-632, this.index, 32);
          if (param1 > -109) {
            this.value = 41;
          }
          param0.a(-632, this.value, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pob.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        SetVariableAction var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 127 % ((param0 - 22) / 59);
          var4 = (SetVariableAction) (param1);
          stackIn_6_0 = (super.a((byte) 93, param1)) || (this.index != var4.index) || (var4.value != this.value);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    SetVariableAction() {
    }

    SetVariableAction(int param0, int param1) {
        this.index = param0;
        this.value = param1;
    }

    static {
        field_c = new mma();
    }
}
