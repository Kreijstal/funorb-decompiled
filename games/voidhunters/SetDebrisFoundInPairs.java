/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetDebrisFoundInPairs extends ConsoleCommand {
    static String field_o;

    final static void a(String param0, String param1, int param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (SetPointDefenceLaserAimarc.field_o != null) {
            SetPointDefenceLaserAimarc.field_o.l((byte) -106);
          }
          SetAiFiringRangeUpshift.field_o = new vla(param1, param0, false, true, true);
          GetMissionVariablesHudX.field_o.b(SetAiFiringRangeUpshift.field_o, -124);
          if (param2 != 0) {
            SetDebrisFoundInPairs.a((String) null, (String) null, 35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("uhb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(18, 62, arguments[0].a(36));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("uhb.A(");
          if (arguments == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 32) {
            SetDebrisFoundInPairs.a(false, -65, (byte) -47, (wma) null, 29);
          }
          field_o = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "uhb.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1) {
            SetPhasedEnergyBeamRandomness.field_p = SetPhasedEnergyBeamRandomness.field_p - 1;
            if (SetPhasedEnergyBeamRandomness.field_p == 0) {
              GetLagStandardDeviationIn.field_o = null;
            }
          }
          if (param2) {
            SetPedrosRepairMode.field_o = SetPedrosRepairMode.field_o - 1;
            if (0 == SetPedrosRepairMode.field_o) {
              mpb.field_h = null;
            }
          }
          var3_int = 78 % ((param0 - 24) / 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "uhb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static asb a(int param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        asb stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 38) {
            SetDebrisFoundInPairs.e((byte) -38);
          }
          stackIn_4_0 = SetAutoAfkTimeout.a(param3, param4, -120, false, param1, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var5), "uhb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, byte param2, wma param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_37_0Lifetime1;
        int stackIn_37_1Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var20 = VoidHunters.field_G;
        try {
          var5_int = SetMutatorVotes.a((param4 - param1) * 3, -128);
          var6 = 3 * param1;
          GetBombletSprayAimarc.a(-19689);
          var7 = var5_int - 10;
          var8 = -120 % ((-38 - param2) / 49);
          if (0 < param3.field_z &&
            param3.field_E != null) {
            bl.d(false);
          }
          pca.field_j = 0;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var9 < param3.field_y)))) {
            var10 = param3.field_w[var9];
            var11 = param3.field_N[var9];
            var12 = param3.field_D[var9];
            stackOut_10_0 = param0;
            stackIn_46_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var20 == 0) {
              if (stackIn_11_0) {
                var13 = cl.field_b[var10];
                var14 = GetMachineGunAimspeed.field_o[var10];
                var15 = cl.field_b[var11] - var13;
                var16 = cl.field_b[var12] - var13;
                var17 = GetMachineGunAimspeed.field_o[var11] - var14;
                var18 = -var14 + GetMachineGunAimspeed.field_o[var12];
              }
              if (!stackIn_11_0 ||
                -(var16 * var17) + var18 * var15 < 0) {
                var13Lifetime1 = pja.field_n[var10];
                if (var13Lifetime1 != -2147483648) {
                  var14Lifetime1 = pja.field_n[var11];
                  if (var14Lifetime1 != -2147483648) {
                    var15 = pja.field_n[var12];
                    if (var15 != -2147483648) {
                      var16 = -var6 + (var14Lifetime1 + (var13Lifetime1 + var15));
                      stackIn_25_0 = -1 + bs.field_b.length;
                      if (var7 < 0) {
                        stackIn_26_1 = var16 << -var7;
                      } else {
                        stackIn_26_1 = var16 >> var7;
                      }
                      var17 = stackIn_25_0 - stackIn_26_1;
                      var18 = bs.field_b[var17];
                      while (true) {
                        if (var18 >> 4 != 0) {
                          var17--;
                          stackIn_37_0 = ~var17;
                          stackIn_37_1 = -1;
                          if (stackIn_37_0 > stackIn_37_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var18 = bs.field_b[var17];
                          continue;
                        }
                        stackIn_37_0Lifetime1 = var18;
                        stackIn_37_1Lifetime1 = var17 << 4;
                        var19 = stackIn_37_0Lifetime1 + stackIn_37_1Lifetime1;
                        SetMissionDebrisDefaultProbability.field_p[var19] = var9;
                        bs.field_b[var17] = 1 + var18;
                        if (0 < param3.field_z &&
                          param3.field_E != null) {
                          dupTemp$0 = param3.field_E[var9];
                          GetAngularVelocitySustain.field_q[dupTemp$0] = GetAngularVelocitySustain.field_q[dupTemp$0] + 1;
                        }
                        pca.field_j = pca.field_j + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_46_0 = param3.field_z;
          }
          if (stackIn_46_0 > 0 &&
            param3.field_E != null) {
            var9Lifetime1 = 0;
            var10Lifetime1 = 0;
            while (!(GetAngularVelocitySustain.field_q.length <= var10Lifetime1)) {
              var11Lifetime1 = GetAngularVelocitySustain.field_q[var10Lifetime1];
              GetAngularVelocitySustain.field_q[var10Lifetime1] = var9Lifetime1;
              var9Lifetime1 = var9Lifetime1 + var11Lifetime1;
              var10Lifetime1++;
              if (var20 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_60_0 = var5;
          stackIn_60_1 = new StringBuilder().append("uhb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param4).append(')').toString());
        }
    }

    SetDebrisFoundInPairs(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Grapples";
    }
}
