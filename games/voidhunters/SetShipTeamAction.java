/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetShipTeamAction extends MissionAction implements DiffableState, hd {
    static dfa field_b;
    static String field_a;
    private int targetBody;
    private int team;
    static boolean field_f;
    static int field_e;

    public final void b(byte param0, tv param1) {
        SetShipTeamAction var5 = null;
        SetShipTeamAction var6 = null;
        try {
          if (param0 < 54) {
            this.a(-15);
          }
          var5 = (SetShipTeamAction) (param1);
          var6 = var5;
          super.b((byte) 103, param1);
          var6.team = this.team;
          var6.targetBody = this.targetBody;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lrb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int var4 = 0;
        World var5 = null;
        SetShipTeamAction var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (obfuscationGuard > -19) {
            var5 = (World) null;
            this.a((World) null, 61);
          }
          super.reportDifferences(other, -97);
          var6 = (SetShipTeamAction) (other);
          var4 = 0;
          if (var6.targetBody != this.targetBody) {
            var4 = 1;
            System.out.println("int target_body has changed. before=" + var6.targetBody + ", now=" + this.targetBody);
          }
          if (this.team != var6.team) {
            System.out.println("int team has changed. before=" + var6.team + ", now=" + this.team);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionActionSetTeam has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lrb.F(");
          if (other == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(World param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = VoidHunters.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param2 == 0) {
            stackIn_6_0 = (param3 <= this.targetBody) ? -1 : 1;
            var5_int = stackIn_6_0;
            var6 = 50;
            var7 = param3 + var6 * var5_int;
            var8 = param3;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8 == var7))) {
              if (null == param0.d((byte) -27, var8) &&
                var8 != -1) {
                var8 = var8 + var5_int;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              decompiledFrameCompleted0 = false;
            }
            if (decompiledFrameCompleted0) {
              this.targetBody = var8;
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            this.team = (param3 + 3) % 3;
          }
          if (param1) {
            this.team = 56;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("lrb.K(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          if (param1) {
            this.a(-27);
          }
          this.targetBody = param0.i(0, 32);
          this.team = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lrb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        String var2 = "Set team of ship " + this.targetBody;
        if (param0 != -1325) {
          tv var3 = (tv) null;
          this.reportDifferences((tv) null, 8);
        }
        if (-1 == this.targetBody) {
          var2 = "Set team of whatever ship";
        }
        return var2 + " to " + this.team;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 52) {
          SetShipTeamAction.a((byte) -16);
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -119);
          if (param1 > -109) {
            field_b = (dfa) null;
          }
          param0.a(-632, this.targetBody, 32);
          param0.a(-632, this.team, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lrb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        SetShipTeamAction var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 38 / ((22 - param0) / 59);
          var3 = (SetShipTeamAction) (param1);
          stackIn_6_0 = (super.a((byte) -44, param1)) || (this.targetBody != var3.targetBody) || (this.team != var3.team);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("lrb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.targetBody >= 0) {
            param1 = SetAutozoomSpeedDivide.a(this.targetBody, true, param1, (byte) -14);
          }
          if (param0 > 99) {
            stackIn_6_0 = (int[]) (param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = (int[]) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lrb.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, GameSnapshot param2) {
        ShipBody var4 = null;
        Ship var5 = null;
        GameSnapshot var6 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = param2.world.d((byte) -27, param0);
          if (var4 != null &&
            var4 instanceof Ship) {
            var5 = (Ship) (var4);
            if (!param2.a(this.team, 0, var5.getTeam((byte) 110))) {
              if (-1 != fw.field_a &&
                SetShieldsDirectionalArcParticleSpeedDownshift.field_o != var5.getTeam((byte) 122)) {
                GetAngleset.b(false);
              } else {
                fw.field_a = param0;
                SetShieldsDirectionalArcParticleSpeedDownshift.field_o = var5.getTeam((byte) 90);
                return;
              }
            }
            var5.h(17704, this.team);
            if (var5.getOwner((byte) -117) >= 0 &&
              var5.getOwner((byte) -117) < param2.field_c.length) {
              param2.a(var5.getOwner((byte) -117), (byte) 59).selectedTeam = this.team;
            }
          }
          if (param1 != 32) {
            var6 = (GameSnapshot) null;
            this.a(90, -3, (GameSnapshot) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("lrb.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final ucb a(World param0, int param1) {
        ShipBody var3 = null;
        RuntimeException var3_ref = null;
        ucb stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.d((byte) -27, this.targetBody);
          if (param1 != 26964) {
            this.targetBody = -27;
          }
          if (var3 == null) {
            return null;
          }
          stackIn_5_0 = new ucb(var3.d(false), var3.g((byte) 117));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("lrb.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
          return -97;
        }
        if (0 == param0) {
          return this.targetBody;
        }
        return this.team;
    }

    SetShipTeamAction() {
    }

    final void a(int param0, int[] param1, GameSnapshot param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (this.targetBody != -1) {
            this.a(this.targetBody, 32, param2);
          } else {
            if (param1 != null &&
              param1.length > 0) {
              for (var4_int = 0; var4_int < param1.length; var4_int++) {
                this.a(param1[var4_int], 32, param2);
              }
            }
          }
          if (param0 != 1) {
            SetShipTeamAction.a((byte) 94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("lrb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    SetShipTeamAction(int param0, int param1) {
        this.targetBody = param0;
        this.team = param1;
    }

    static {
        field_a = "Suggested names: ";
        field_e = 0;
    }
}
