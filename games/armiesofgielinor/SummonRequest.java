/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SummonRequest extends ActionRequest {
    static String field_z;
    static String field_x;
    private int tileY;
    static int field_B;
    private int tileX;
    static String field_C;
    private int unitType;
    static String field_y;
    static String field_w;
    static String field_D;

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            SummonRequest.a((byte) 111);
          }
          stackIn_3_0 = nk.a(false, param0, (byte) -95);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hw.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String formatSummonRejection(String[] messageParts, byte obfuscationGuard) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -50) {
            field_C = (String) null;
          }
          stackIn_3_0 = this.formatIllegalMove(119, messageParts, "summon");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hw.I(");
          if (messageParts == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 >= -74) {
          field_w = (String) null;
        }
        if (EffectPresentation.field_e != null) {
          EffectPresentation.field_e.b(param0, 20);
        }
    }

    public static void a(byte param0) {
        field_y = null;
        if (param0 >= -42) {
          CharSequence var2 = (CharSequence) null;
          SummonRequest.a((CharSequence) null, true);
        }
        field_z = null;
        field_D = null;
        field_x = null;
        field_w = null;
        field_C = null;
    }

    final static String a(int param0, Class param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 640) {
            SummonRequest.a(false, (byte) 44);
          }
          if (param1.isArray()) {
            stackIn_6_0 = SummonRequest.a(param0 ^ 0, param1.getComponentType()) + "[]";
            return stackIn_6_0;
          }
          stackIn_4_0 = param1.getName().substring(1 + param1.getName().lastIndexOf("."));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("hw.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RgbSprite var5 = null;
        int var6 = 0;
        RgbSprite var7 = null;
        RgbSprite var5Lifetime1;
        int var4Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = -1;
          if (null != gv.field_a &&
            param1 < gv.field_a.length) {
            if (null != gv.field_a[param1] &&
              gv.field_a[param1].length > param2) {
              if (param0 != 29) {
                SummonRequest.a(false);
              }
              for (var4 = 0; gv.field_a[param1][param2].length > var4; var4++) {
                var7 = gv.field_a[param1][param2][var4];
                var5 = var7;
                if (var7 != null &&
                  var7.canvasWidth >= 0 && (var3_int < 0 ||
                  !(var7.canvasWidth < var3_int))) {
                  var3_int = var7.canvasWidth;
                }
              }
              if (var3_int <= 0) {
                return;
              }
              for (var4Lifetime1 = 0; var4Lifetime1 < gv.field_a[param1][param2].length; var4Lifetime1++) {
                var5Lifetime1 = gv.field_a[param1][param2][var4Lifetime1];
                if (var5Lifetime1 != null &&
                  var3_int > var5Lifetime1.canvasWidth) {
                  var5Lifetime1.offsetX = -var5Lifetime1.canvasWidth + var3_int >> 1;
                  var5Lifetime1.canvasWidth = var3_int;
                }
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var3), "hw.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final PreparedAction prepareAction(int obfuscationGuard, Battlefield battlefield) {
        int godIndex = 0;
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        Object stackIn_20_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        SummonAction stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int requiredGod = 0;
        RuntimeException var3 = null;
        int godSelected = 0;
        int[] chosenGods = null;
        int chosenGod = 0;
        int var8 = 0;
        int summoningBonus;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.unlink(-114);
          if (this.unitType == 74 &&
            battlefield.kingBlackDragonSummoned) {
            this.unitType = 4;
          }
          if (this.unitType == 4 &&
            battlefield.mapTheme == 2) {
            this.unitType = 81;
          }
          requiredGod = bw.unitDefinitions[this.unitType][1];
          if (requiredGod != -1) {
            godSelected = 0;
            chosenGods = battlefield.chosenGods[this.actingPlayer];
            for (godIndex = 0; godIndex < chosenGods.length; godIndex++) {
              chosenGod = chosenGods[godIndex];
              if (~chosenGod != ~requiredGod) {
                continue;
              }
              godSelected = 1;
              break;
            }
            if (godSelected == 0) {
              discarded$0 = this.formatSummonRejection(new String[]{"God not selected: ", Integer.toString(requiredGod)}, (byte) -62);
              stackIn_20_0 = null;
              return (PreparedAction) (stackIn_20_0);
            }
          } else {
            requiredGod = 12;
          }
          if (0 == (battlefield.getSummoningGodMaskAt(this.tileX, -27300, this.tileY, this.actingPlayer) & 1 << requiredGod)) {
            discarded$1 = this.formatSummonRejection(new String[]{"Can't summon followers of god: ", Integer.toString(requiredGod), " at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY)}, (byte) -111);
            stackIn_24_0 = null;
            return (PreparedAction) (stackIn_24_0);
          }
          if (!battlefield.canSummonUnitAt(this.tileY, -26813, this.unitType, this.tileX, this.actingPlayer)) {
            discarded$2 = this.formatSummonRejection(new String[]{"Can't afford creature type: ", Integer.toString(this.unitType), " at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY)}, (byte) -87);
            stackIn_27_0 = null;
            return (PreparedAction) (stackIn_27_0);
          }
          if (obfuscationGuard < 31) {
            field_y = (String) null;
          }
          summoningBonus = battlefield.a(bw.unitDefinitions[this.unitType][1], this.tileY, this.tileX, 0, this.actingPlayer, bw.unitDefinitions[this.unitType][2]);
          stackIn_31_0 = new SummonAction(this.tileX, this.tileY, this.unitType, summoningBonus, this.actingPlayer);
          return (PreparedAction) ((Object) stackIn_31_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("hw.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
          field_B = -104;
        }
        return -co.field_f + bm.field_h;
    }

    final static void a(byte param0, int[] param1, int param2) {
        try {
          MoveEvent.tutorialStageItems[param2] = param1;
          rq.field_p[param2] = new TutorialController(param2);
          if (param0 <= 17) {
            field_B = -14;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "hw.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    SummonRequest(int actingPlayer, int tileX, int tileY, int unitType) {
        this.unitType = unitType;
        this.tileX = tileX;
        this.actingPlayer = actingPlayer;
        this.tileY = tileY;
    }

    static {
        field_z = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_x = "Plate";
        field_C = "Only show private chat from my friends and opponents";
        field_w = "This coat of arms will be unlocked at <%0>. After collecting <%1> more, you may use any of the parts from it in your own coat of arms.";
        field_y = "You cannot join this game - it is in progress";
        field_D = "Your captured buildings will produce a bonus amount of mana per turn.";
    }
}
