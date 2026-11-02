/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetVariableLabelAction extends MissionAction implements DiffableState {
    private int index;
    private int label;
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
            return this.label;
          }
          return this.index;
        }
        if (param0 != 0) {
          return this.label;
        }
        return this.index;
    }

    public static void c(int param0) {
        field_a = null;
        int var1 = -42 / ((param0 - 27) / 47);
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        SetVariableLabelAction var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -87);
          var5 = (SetVariableLabelAction) (other);
          var4 = 0;
          if (this.index != var5.index) {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.index + ", now=" + this.index);
          }
          if (var5.label != this.label) {
            System.out.println("int label has changed. before=" + var5.label + ", now=" + this.label);
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
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
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String a(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == -1325) {
          var2 = Integer.toString(this.label);
          if (this.label >= 0 &&
            this.label < pu.field_c.length) {
            var2 = pu.field_c[this.label];
          }
          return "Set label of custom variable " + this.index + " to " + var2;
        }
        field_a = (String) null;
        var2Lifetime1 = Integer.toString(this.label);
        if (this.label >= 0 &&
          this.label < pu.field_c.length) {
          var2Lifetime1 = pu.field_c[this.label];
        }
        return "Set label of custom variable " + this.index + " to " + var2Lifetime1;
    }

    final void a(int param0, int[] param1, GameSnapshot param2) {
        RuntimeException var4 = null;
        MissionVariable var6 = null;
        MissionVariable var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            this.label = 117;
          }
          var6 = param2.missionState.c(-1, this.index);
          var7 = var6;
          if (var7 == null) {
            return;
          }
          var7.label = this.label;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -111);
          param0.a(-632, this.index, 32);
          param0.a(-632, this.label, 32);
          if (param1 >= -109) {
            SetVariableLabelAction.c(48);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(World param0, boolean param1, int param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        World var6 = null;
        try {
          if (param2 == 0) {
            this.index = param3;
            if (this.index < 0) {
              this.index = 0;
            }
          } else {
            this.label = param3;
            if (this.label < 0) {
              this.label = (this.label + pu.field_c.length) % pu.field_c.length;
            }
          }
          if (!param1) {
            return;
          }
          var6 = (World) null;
          this.a((World) null, -77);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.index = param0.i(0, 32);
          this.label = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cf.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        SetVariableLabelAction var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -11 % ((22 - param0) / 59);
          var3 = (SetVariableLabelAction) (param1);
          stackIn_6_0 = (super.a((byte) 96, param1)) || (this.index != var3.index) || (this.label != var3.label);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    SetVariableLabelAction() {
    }

    SetVariableLabelAction(int param0, int param1) {
        this.index = param0;
        this.label = param1;
    }

    final static void b(int param0) {
        GetDebrisMax.field_s = SetSpinningBladeAimarc.f((byte) 62);
        qn.field_h = new ida();
        GetPhasedEnergyBeamFireForce.e((byte) 117);
        if (param0 != 32) {
          SetVariableLabelAction.b(3);
        }
    }

    public final void b(byte param0, tv param1) {
        SetVariableLabelAction var5 = null;
        SetVariableLabelAction var6 = null;
        try {
          if (param0 <= 54) {
            field_a = (String) null;
          }
          var5 = (SetVariableLabelAction) (param1);
          var6 = var5;
          super.b((byte) 110, param1);
          var6.label = this.label;
          var6.index = this.index;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ucb a(World param0, int param1) {
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
          this.label = -111;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "You need to be in the main menu or sandbox mode to load ships";
    }
}
