/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipCondition extends MissionCondition implements DiffableState, hd {
    static String[] field_f;
    private int teamId;
    static int field_e;
    private int shipId;

    public static void b(int param0) {
        if (param0 != -10570) {
          return;
        }
        field_f = null;
    }

    final int a(byte param0, int param1) {
        if (param0 > -102) {
          return 17;
        }
        if (param1 != 0) {
          return this.teamId;
        }
        return this.shipId;
    }

    final boolean a(int param0, MissionState param1, World param2) {
        int var6 = 0;
        Ship var4 = null;
        RuntimeException var4_ref = null;
        Ship[] var5 = null;
        Ship var7 = null;
        int var8 = 0;
        Ship[] var9 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          if (param0 != ~this.shipId) {
            var4 = param2.getShips(param0 ^ 1000)[this.shipId];
            if (var4 != null &&
              var4.getTeam((byte) 86) == this.teamId &&
              !var4.l((byte) -10) &&
              -1 != var4.getOwner((byte) -117)) {
              return true;
            }
            return false;
          }
          var9 = param2.getShips(param0 + 1000);
          var5 = var9;
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.getTeam((byte) 120) == this.teamId &&
              !var7.l((byte) -10) &&
              var7.getOwner((byte) -117) >= 0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("ih.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final ucb[] a(World param0, int param1) {
        Ship var3 = null;
        RuntimeException var3_ref = null;
        Ship var4 = null;
        ucb[] stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.shipId != -1) {
            var4 = param0.getShips(1000)[this.shipId];
            var3 = var4;
            if (var3 != null) {
              stackIn_4_0 = new ucb[]{new ucb(var4.d(false), var4.g((byte) -58))};
              return stackIn_4_0;
            }
          }
          if (param1 == -20605) {
            return null;
          }
          field_e = 68;
          stackIn_8_0 = null;
          return (ucb[]) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ih.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.shipId = param0.i(0, 32);
          this.teamId = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ih.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(World param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ShipBody var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = VoidHunters.field_G;
        try {
          if (param1 != -2) {
            this.a(57, (int[]) null);
          }
          if (param2 == 0) {
            stackIn_8_0 = (this.shipId >= param3) ? -1 : 1;
            var5_int = stackIn_8_0;
            var6 = 50;
            var7 = var5_int * var6 + param3;
            var8 = param3;
            while (true) {
              if (var7 == var8) {
                return;
              }
              var9 = param0.d((byte) -27, var8);
              if ((var9 == null ||
                !(var9 instanceof Ship)) && -1 != var8) {
                var8 = var8 + var5_int;
                continue;
              }
              break;
            }
            this.shipId = var8;
            return;
          }
          this.teamId = (SettingsChange.field_b + param3) % SettingsChange.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ih.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ShipCondition var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -3 / ((22 - param0) / 59);
          var4 = (ShipCondition) (param1);
          stackIn_6_0 = (super.a((byte) 89, param1)) || (this.shipId != var4.shipId) || (var4.teamId != this.teamId);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ih.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          super.b(param0, -122);
          param0.a(-632, this.shipId, 32);
          param0.a(-632, this.teamId, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ih.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int[] a(World param0, int param1, int[] param2) {
        int var6 = 0;
        Ship[] var5 = null;
        Ship var7 = null;
        int var8 = 0;
        Ship[] var9 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          if (param1 < 16) {
            field_f = (String[]) null;
          }
          if (this.shipId != -1) {
            stackIn_5_0 = SetAutozoomSpeedDivide.a(this.shipId, true, param2, (byte) -14);
            return stackIn_5_0;
          }
          var9 = param0.getShips(1000);
          var5 = var9;
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.getTeam((byte) 121) == this.teamId &&
              !var7.l((byte) -10) &&
              var7.getOwner((byte) -117) >= 0) {
              param2 = SetAutozoomSpeedDivide.a(var7.getId(false), true, param2, (byte) -14);
            }
          }
          stackIn_23_0 = (int[]) (param2);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ih.J(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int var4 = 0;
        ShipCondition var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.reportDifferences(other, -86);
          var5 = (ShipCondition) (other);
          if (obfuscationGuard >= -19) {
            this.b((faa) null, -126);
          }
          var4 = 0;
          if (this.shipId != var5.shipId) {
            System.out.println("int ship_id has changed. before=" + var5.shipId + ", now=" + this.shipId);
            var4 = 1;
          }
          if (this.teamId != var5.teamId) {
            var4 = 1;
            System.out.println("int team_id has changed. before=" + var5.teamId + ", now=" + this.teamId);
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionShipOnTeam has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ih.F(");
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 99) {
            stackIn_2_0 = (int[]) null;
            return stackIn_2_0;
          }
          if (this.shipId >= 0) {
            param1 = SetAutozoomSpeedDivide.a(this.shipId, true, param1, (byte) -14);
          }
          stackIn_7_0 = (int[]) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ih.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ShipCondition() {
    }

    final String a(int param0) {
        String var2 = "Ship " + this.shipId;
        if (this.shipId == param0) {
          var2 = "Any ship";
        }
        return var2 + " in team " + this.teamId;
    }

    ShipCondition(int param0, int param1) {
        this.teamId = param1;
        this.shipId = param0;
    }

    public final void b(byte param0, tv param1) {
        ShipCondition var4 = (ShipCondition) (param1);
        ShipCondition var3 = var4;
        if (param0 <= 54) {
          return;
        }
        try {
          super.b((byte) 110, param1);
          var4.teamId = this.teamId;
          var4.shipId = this.shipId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ih.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
