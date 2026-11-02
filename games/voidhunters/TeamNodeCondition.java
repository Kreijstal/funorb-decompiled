/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeamNodeCondition extends MissionCondition implements DiffableState {
    private int teamId;
    static int field_e;
    static pr field_c;

    public final void b(byte param0, tv param1) {
        TeamNodeCondition var5 = null;
        TeamNodeCondition var6 = null;
        try {
          if (param0 <= 54) {
            this.a(-77);
          }
          super.b((byte) 57, param1);
          var5 = (TeamNodeCondition) (param1);
          var6 = var5;
          var6.teamId = this.teamId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "om.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        TeamNodeCondition var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (TeamNodeCondition) (param1);
          var4 = 20 % ((22 - param0) / 59);
          stackIn_5_0 = (super.a((byte) 90, param1)) || (var3.teamId != this.teamId);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("om.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(World param0, int param1, int param2, int param3) {
        try {
          this.teamId = (param3 + SettingsChange.field_b) % SettingsChange.field_b;
          if (param1 != -2) {
            field_e = 117;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "om.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -115);
          if (param1 >= -109) {
            tv var4 = (tv) null;
            this.a((byte) -98, (tv) null);
          }
          param0.a(-632, this.teamId, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "om.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
          this.teamId = 93;
        }
        return this.teamId;
    }

    final ucb[] a(World param0, int param1) {
        RuntimeException var3 = null;
        faa var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -20605) {
            return null;
          }
          var4 = (faa) null;
          this.b((faa) null, -57);
          stackIn_3_0 = null;
          return (ucb[]) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("om.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, MissionState param1, World param2) {
        int var5 = 0;
        ResourceNode[] var4 = null;
        RuntimeException var4_ref = null;
        ResourceNode var6 = null;
        int var7 = 0;
        ResourceNode[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          var8 = param2.getResNodes(1);
          var4 = var8;
          if (var4 == null) {
            return false;
          }
          for (var5 = param0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (var6 != null &&
              this.teamId == var6.team) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("om.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        return "Any node on team " + this.teamId;
    }

    final static int a(byte[] param0, int param1, int param2, byte[][] param3, boolean param4, byte[][] param5, int[] param6, int[] param7) {
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        var21 = VoidHunters.field_G;
        try {
          var8_int = param7[param2];
          var9 = var8_int + param6[param2];
          var10 = param7[param1];
          var11 = param6[param1] + var10;
          var12 = var8_int;
          if (param4) {
            var22 = (int[]) null;
            TeamNodeCondition.a((byte[]) null, -54, -70, (byte[][]) null, true, (byte[][]) null, (int[]) null, (int[]) null);
          }
          if (var10 > var8_int) {
            var12 = var10;
          }
          var13 = var9;
          if (var11 < var9) {
            var13 = var11;
          }
          var14 = 255 & param0[param2];
          if (var14 > (param0[param1] & 255)) {
            var14 = param0[param1] & 255;
          }
          var15 = param5[param2];
          var16 = param3[param1];
          var17 = var12 - var8_int;
          var18 = -var10 + var12;
          for (var19 = var12; var13 > var19; var19++) {
            incrementValue$0 = var18;
            var18++;
            incrementValue$1 = var17;
            var17++;
            var20 = var16[incrementValue$0] + var15[incrementValue$1];
            if (var14 > var20) {
              var14 = var20;
            }
          }
          stackIn_18_0 = -var14;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("om.M(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final int[] a(World param0, int param1, int[] param2) {
        ResourceNode[] var4 = null;
        int var5 = 0;
        ResourceNode var6 = null;
        int var7 = 0;
        tv var8 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = VoidHunters.field_G;
        try {
          var4 = param0.getResNodes(1);
          if (var4 == null) {
            stackIn_3_0 = (int[]) (param2);
            return stackIn_3_0;
          }
          var5 = 0;
          if (param1 < 16) {
            var8 = (tv) null;
            this.a((byte) -88, (tv) null);
          }
          while (var4.length > var5) {
            var6 = var4[var5];
            if (var6 != null &&
              this.teamId == var6.team) {
              param2 = SetAutozoomSpeedDivide.a(var5, true, param2, (byte) -14);
            }
            var5++;
          }
          stackIn_15_0 = (int[]) (param2);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("om.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    TeamNodeCondition() {
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        TeamNodeCondition var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (obfuscationGuard >= -19) {
            return;
          }
          super.reportDifferences(other, -98);
          var3 = (TeamNodeCondition) (other);
          var4 = 0;
          if (this.teamId != var3.teamId) {
            System.out.println("int team_id has changed. before=" + var3.teamId + ", now=" + this.teamId);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionNodeOnTeam has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("om.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          if (param1) {
            tv var4 = (tv) null;
            this.a((byte) 42, (tv) null);
          }
          this.teamId = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "om.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    TeamNodeCondition(int param0) {
        this.teamId = param0;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != -2684) {
          field_c = (pr) null;
        }
    }

    static {
    }
}
