/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en {
    static String[] field_a;
    static cn[] field_b;
    static int field_c;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
    }

    abstract void a(int param0, sa param1);

    abstract cn b(byte param0);

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = DungeonAssault.field_K;
        try {
          ob.a(param1, param4, (byte) -102, param3, param2);
          if (param0 != -1) {
            field_b = (cn[]) null;
          }
          te.a(param1, param4 - 1, param2, kc.field_S[0]);
          te.a(param1, -4 + (param3 + param4), param2, kc.field_S[0]);
          for (var5_int = 0; var5_int < 5; var5_int++) {
            var6 = 160 - var5_int * 32;
            gf.d(param1, -2 + param4 - var5_int, param2, 0, var6);
            gf.d(param1, param4 + var5_int, param2, 0, var6);
            gf.d(param1, param3 + (param4 + (-5 - var5_int)), param2, 0, var6);
            gf.d(param1, param4 + (param3 - 3) + var5_int, param2, 0, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "en.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, int[] param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DungeonAssault.field_K;
        try {
          for (var2_int = 0; var2_int < 8; var2_int++) {
            if (param1[var2_int] != 0) {
              return true;
            }
          }
          if (param0 == -1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("en.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        Raider.field_a.field_h = 0;
        Raider.field_a.field_c = 0;
        if (param0 > -42) {
          field_a = (String[]) null;
        }
    }

    final static int a(String param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          var3_int = param0.indexOf(param2, '\0');
          var4 = var3_int;
          while (var3_int != -1) {
            var4 = var3_int;
            var3_int = param0.indexOf(param2, var4 + 1);
          }
          if (param1 == -8634) {
            stackIn_8_0 = var4;
            return stackIn_8_0;
          }
          stackIn_6_0 = -16;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("en.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = DungeonAssault.field_K;
          try {
            try {
              var3 = (String) (ee.a((byte) -21, param2, "getcookies"));
              var4 = ih.a(96, ';', var3);
              if (param1 < 53) {
                en.a((byte) -57, 121, -52, 125, -83);
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("en.I(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new String[]{"Welcome to Dungeon Assault!<br><br>The goal of this game is to win power and fame as a dragon by successfully raiding other players' dungeons while defending your own.<br><br>Use raiders to steal gold from the hoards of other dragons; construct devious traps and recruit powerful monsters to safeguard your own hoard.", "Ages ago, the realm of Dungaria was plagued by continuous wars between the native dragons, as they warred with each other in pursuit of power. Eventually, the gods of that realm intervened, binding all dragons with powerful magics, forbidding them from engaging directly in combat with each other. Even with these restrictions, the dragons still felt the urge to compete against others of their kind, and so became 'the Game': a system of ritualised combat executed entirely with minions, as the dragons themselves sleep at the centres of their domains. It is as a player of 'the Game' that you interact with the world of Dungeon Assault.", "Renown tracks your success in the Game. Your Renown will increase with each successful raid or dungeon defence, as well as slowly over time. Your Renown will decrease for each failed raid or dungeon defence. How much Renown you have, and how much you have lost since you started playing the Game, are used to determine the amount of Treasure you are able to steal from other dragons.", "Raiders are mortal creatures, bound in service to a dragon. They can be injured (making them unavailable for a short length of time) or killed (permanently lost). Raiders can be recruited by spending Treasure. Each raider has different levels in the following four skills:<br>-Attack, used in combat against opponents<br>-Defence, used in combat and to flee from opponents<br>-Dodge, used to avoid traps and flee from opponents<br>-Sneak, used to disarm traps and to gain the element of surprise in combat.<br><br>This means that some raiders will be good at dealing with certain room types, but poor at dealing with others. As your Renown increases, you will be able to select from a wider range of raiders. Recruit raiders by clicking on 'My Stable'. You can employ up to eight raiders at a time. Select a raider type from the panel on the left and click 'Recruit' to recruit it, or select an existing raider from the central section and click 'Dismiss' to remove it. When finished, click 'Confirm' to save any changes and exit.", "Rooms are placed in your dungeon to make attacking it more difficult. Rooms can be added to your dungeon by spending Treasure. There are three types of room: monster, trap and guardian. Monster rooms contain creatures that engage any raiders in combat. Trap rooms contain traps that, if triggered, attempt to incapacitate or kill a raider. Guardian rooms, if triggered, alert all creatures in the dungeon, making them harder to surprise and, therefore, more effective in combat. Rooms are rated in four areas: Attack, Defence, Snare and Detect.<br><br>To construct rooms in your dungeon, click 'My Dungeon'. Similarly to recruiting raiders, click a room type from the panel on the left, and click on your dungeon to place it. Replacing an existing room will refund half of the original room's cost. The entrances and the hoard room cannot be replaced. When finished, click 'Confirm' to save any changes and exit.", "All players are listed in the 'Dragons of Renown' table, which is updated every few minutes. Players are sorted by their current Renown. To raid another player's dungeon, click their entry on this table and select 'Raid'. A good target to choose would be one that is close to you in the table - players that are far above you will be too well defended for you to successfully attack, and the potential gain from players that are far below you is minimal. Additionally, if your target has much less Renown than you, he may sense the involvement of such a powerful will and be more likely to wake.", "You can select up to a maximum of four raiders (from your stable of up to eight) to assault a dungeon. You may choose to enter at any of the four corners. Your objective is then to reach the centre: the hoard room. Select one of your raiders by clicking on its portrait at the bottom-left of the screen, then move it by clicking on a room. All rooms that are currently accessible are highlighted with a glowing orange border.<br><br>The types of rooms your raider's will encounter are:", "Rooms cannot be placed on top of an entrance or the hoard room. Placing rooms costs Treasure, and more room types become available as your Renown increases. Rooms can be replaced or removed, but the arrangement of doors in a dungeon cannot be changed. To place a room, select it from the panel on the left and click a blank room in your dungeon. You need to click 'Save' to confirm any changes before leaving that menu."};
    }
}
