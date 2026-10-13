/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ListMissionsConsoleCommand extends ConsoleCommand {
    static int[] field_F;
    static SocialListPanel field_E;

    public static void g(int param0) {
        field_F = null;
        field_E = null;
        if (param0 != 12600) {
          field_E = (SocialListPanel) null;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = 493 + (param2 + (8 - (-2 - param1)));
          SocialListPanel.field_Qb.setBounds(CombatEvent.field_I.height - 6, param5 ^ -20499, -6 + var6_int, 3, 3);
          var7 = SocialListPanel.field_Qb.height - 5;
          if (param5 != 1) {
            ListMissionsConsoleCommand.g(78);
          }
          we.field_f.setBounds(param4, -20500, 2 + (485 + param2 + param1), -param4 + var7, 5);
          UpkeepEvent.field_z.setBounds(param4, -20500, -DebouncedValidator.field_b.width + (we.field_f.width - param2), 0, param2);
          var7 = var7 - (2 + param4);
          DebouncedValidator.field_b.setBounds(param4, -20500, DebouncedValidator.field_b.width, 0, param2 + UpkeepEvent.field_z.width);
          vq.field_a.setLayout(5, false, 2 + param2 + (485 + param1), 2, param1, 5, -5 + var7);
          if (null != BestScoreStrategy.field_i) {
            BestScoreStrategy.field_i.setBounds(vq.field_a.x, vq.field_a.width, vq.field_a.y, param5 ^ 8193, vq.field_a.height);
          }
          var8 = -var6_int + (-param2 + CombatEvent.field_I.width);
          var9 = var8 / 2;
          var10 = param0 + var9 + param2;
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (var12 >= 5 ||
              null != gt.field_b[var12]) {
              var13 = 3 + var11 * (2 + (-6 + CombatEvent.field_I.height)) / (1 + se.field_d);
              var11++;
              var7Lifetime1 = 3 + (var11 * (2 + CombatEvent.field_I.height - 6) / (se.field_d + 1) - 2 - var13);
              if (5 <= var12) {
                UnitLossCondition.field_f.setBounds(var7Lifetime1, param5 ^ -20499, var8, var13, var6_int);
              } else {
                gt.field_b[var12].setBounds(var7Lifetime1, param5 ^ -20499, var8, var13, var6_int);
                jj.field_i[var12].setBounds(var7Lifetime1, -20500, -param2 + var9, 0, param2);
                we.field_g[var12].setBounds(-param3 + (var7Lifetime1 - param3), -20500, param0, param3, var9);
                ResourceProtocolClient.field_j[var12].setBounds(-param3 + (-param3 + var7Lifetime1), param5 - 20501, -var10 + (-param2 + var8), param3, var10);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6), "mw.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    ListMissionsConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException failure = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -24872) {
            ListMissionsConsoleCommand.e((byte) 60);
          }
          result = new ConsoleValue(RadialSummonMenu.listCampaignMissions((byte) 123, arguments[0].asInt(obfuscationGuard ^ -24870)));
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("mw.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -63) {
            field_F = (int[]) null;
          }
          var1_int = MoveAttackRequest.field_K[0];
          for (var2 = 1; MoveAttackRequest.field_K.length > var2; var2++) {
            var3 = MoveAttackRequest.field_K[var2];
            vm.a(ab.field_c, var2 << 4, ab.field_c, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "mw.A(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_F = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
          field_F[var0] = ki.a(var0, -111);
        }
    }
}
