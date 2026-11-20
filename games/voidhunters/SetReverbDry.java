/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetReverbDry extends ConsoleCommand {
    static int field_o;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          var6_int = 493 + param3 + (8 + (2 + param5));
          kea.field_a.setBounds(3, -18, var6_int - 6, 3, SetToggledScoreboard.field_o.height - 6);
          var7 = -5 + kea.field_a.height;
          jba.field_b.setBounds(5, -73, param5 + (param3 + 487), var7 - param1, param1);
          bpa.field_c.setBounds(param3, -55, -WidgetNode.field_l.width + jba.field_b.width - param3, 0, param1);
          var7 = var7 - (2 + param1);
          WidgetNode.field_l.setBounds(param3 + bpa.field_c.width, 122, WidgetNode.field_l.width, 0, param1);
          GetUseLines.field_p.a(487 + (param3 + param5), 2, -1, -5 + var7, 5, 5, param5);
          if (null != PartitionZoneListFactory.field_b) {
            PartitionZoneListFactory.field_b.a(GetUseLines.field_p.x, GetUseLines.field_p.width, GetUseLines.field_p.height, 1, GetUseLines.field_p.y);
          }
          if (param2 <= 91) {
            return;
          }
          var8 = -var6_int - param3 + SetToggledScoreboard.field_o.width;
          var9 = var8 / 2;
          var10 = param3 + param0 + var9;
          var11 = 0;
          for (var12 = 0; 6 > var12; var12++) {
            if (var12 >= 5 ||
              ul.field_b[var12] != null) {
              var13 = var11 * (-4 + SetToggledScoreboard.field_o.height) / (1 + SetSniperCannonRandomness.field_o) + 3;
              var11++;
              var7Lifetime1 = 3 + (var11 * (2 + (SetToggledScoreboard.field_o.height - 6)) / (1 + SetSniperCannonRandomness.field_o) - 2) - var13;
              if (var12 < 5) {
                ul.field_b[var12].setBounds(var6_int, -100, var8, var13, var7Lifetime1);
                SetMissionVariablesHudX.field_o[var12].setBounds(param3, -110, -param3 + var9, 0, var7Lifetime1);
                SecondaryNodeDeque.field_c[var12].setBounds(var9, -27, param0, param4, -param4 + (var7Lifetime1 - param4));
                NebulaFieldFactory.field_c[var12].setBounds(var10, 127, -var10 + (-param3 + var8), param4, var7Lifetime1 - (param4 + param4));
              } else {
                SetBombletSprayAimarc.field_o.setBounds(var6_int, -120, var8, var13, var7Lifetime1);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var6), "jia.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          GetMissileLauncherProjectiles.field_o = arguments[0].floatValue(0);
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jia.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetReverbDry(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 == 0) {
          var2 = kib.field_d;
        }
        if (param0 == 1) {
          var2 = GetThrusterSmallForce.field_p;
        }
        if (param1 == 19) {
          if (param0 == 2) {
            var2 = lla.field_h;
          }
          return var2;
        }
        field_o = -2;
        if (param0 == 2) {
          var2 = lla.field_h;
        }
        return var2;
    }

    final static int a(int param0, int param1) {
        int var3 = VoidHunters.field_G;
        ija.field_b = null;
        gob.field_c = 0;
        eu.field_h = null;
        int var2 = SetDefaultFiringLeeway.field_p;
        SetDefaultFiringLeeway.field_p = GetLaserProjectiles.field_p;
        GetAutozoomAmountMultiply.field_o.errorCount = GetAutozoomAmountMultiply.field_o.errorCount + 1;
        if (param0 >= -60) {
          field_o = -4;
          GetLaserProjectiles.field_p = var2;
          if (param1 == 51) {
            GetAutozoomAmountMultiply.field_o.errorStatus = 2;
            if (2 > GetAutozoomAmountMultiply.field_o.errorCount) {
              if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (GetAutozoomAmountMultiply.field_o.errorCount < 2) {
              if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 50) {
              return 5;
            }
            if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 != 50) {
            GetAutozoomAmountMultiply.field_o.errorStatus = 1;
            if (2 > GetAutozoomAmountMultiply.field_o.errorCount) {
              if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (GetAutozoomAmountMultiply.field_o.errorCount < 2) {
              if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 50) {
              return 5;
            }
            if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
              return 1;
            }
            return -1;
          }
          GetAutozoomAmountMultiply.field_o.errorStatus = 5;
          if (2 > GetAutozoomAmountMultiply.field_o.errorCount) {
            if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (GetAutozoomAmountMultiply.field_o.errorCount < 2) {
            if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 == 50) {
            return 5;
          }
          if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
            return 1;
          }
          return -1;
        }
        GetLaserProjectiles.field_p = var2;
        if (param1 == 51) {
          GetAutozoomAmountMultiply.field_o.errorStatus = 2;
          if (2 <= GetAutozoomAmountMultiply.field_o.errorCount) {
            if (param1 == 51) {
              return 2;
            }
            if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
              return 1;
            }
            return -1;
          }
          if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
            return 1;
          }
          return -1;
        }
        if (param1 != 50) {
          GetAutozoomAmountMultiply.field_o.errorStatus = 1;
          if (2 <= GetAutozoomAmountMultiply.field_o.errorCount) {
            if (param1 == 51) {
              return 2;
            }
            if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
              return 1;
            }
            return -1;
          }
          if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
            return 1;
          }
          return -1;
        }
        GetAutozoomAmountMultiply.field_o.errorStatus = 5;
        if (2 <= GetAutozoomAmountMultiply.field_o.errorCount) {
          if (param1 == 51) {
            return 2;
          }
          if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
            return 1;
          }
          return -1;
        }
        if (GetAutozoomAmountMultiply.field_o.errorCount >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(GetAutozoomAmountMultiply.field_o.errorCount < 4)) {
          return 1;
        }
        return -1;
    }

    static {
    }
}
