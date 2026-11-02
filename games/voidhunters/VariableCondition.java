/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VariableCondition extends MissionCondition implements DiffableState {
    static boolean field_e;
    private int value;
    private int index;
    static String field_f;

    final String a(int param0) {
        if (param0 == -1) {
          return "Variable " + this.index + " at least " + this.value;
        }
        VariableCondition.a(104, -21, -70, -33, (byte) -17);
        return "Variable " + this.index + " at least " + this.value;
    }

    public final boolean a(byte param0, tv param1) {
        VariableCondition var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (VariableCondition) (param1);
          var4 = 7 % ((22 - param0) / 59);
          stackIn_6_0 = (super.a((byte) 116, param1)) || (var3.index != this.index) || (var3.value != this.value);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        int var1 = -104 / ((param0 + 54) / 51);
        field_f = null;
    }

    final boolean a(int param0, MissionState param1, World param2) {
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
            this.value = 113;
          }
          stackIn_5_0 = !(param1.b(7061, this.index) < this.value);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
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
        VariableCondition var5 = null;
        VariableCondition var6 = null;
        try {
          if (param0 <= 54) {
            this.a((byte) -47, -43);
          }
          super.b((byte) 82, param1);
          var5 = (VariableCondition) (param1);
          var6 = var5;
          var6.value = this.value;
          var6.index = this.index;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        pja.e(-110);
        int var1 = -25 / ((46 - param0) / 35);
    }

    final ucb[] a(World param0, int param1) {
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    VariableCondition() {
    }

    final void a(World param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            this.index = param3;
            if (0 > this.index) {
              this.index = 0;
            }
          } else {
            this.value = param3;
          }
          if (param1 == -2) {
            return;
          }
          VariableCondition.c(80);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -120);
        param0.a(-632, this.index, 32);
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.value, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    VariableCondition(int param0, int param1) {
        this.index = param0;
        this.value = param1;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.index = param0.i(0, 32);
          this.value = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        int var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_k) != 0) {
          ifa.field_g[10] = !vqa.field_g.field_h ? GetMachineGunAimarc.field_o : csa.field_b;
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
        ifa.field_g[10] = !vqa.field_g.field_h ? SetBlueprintSaveTime.field_o : gdb.field_d;
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
          return this.value;
        }
        return this.index;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        VariableCondition var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -64);
          var5 = (VariableCondition) (other);
          var4 = 0;
          if (var5.index != this.index) {
            System.out.println("int index has changed. before=" + var5.index + ", now=" + this.index);
            var4 = 1;
          }
          if (var5.value != this.value) {
            var4 = 1;
            System.out.println("int value has changed. before=" + var5.value + ", now=" + this.value);
          }
          if (obfuscationGuard > -19) {
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
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -54) {
          return;
        }
        if (SocketConnector.field_c == null) {
          return;
        }
        SocketConnector.field_c.b(-10258, new pd(param3, param2, param0, param1));
    }

    static {
        field_f = "You must play 1 more rated game before playing with the current options.";
    }
}
