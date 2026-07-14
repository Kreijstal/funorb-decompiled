/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static bd field_f;
    static String field_d;
    static bd[] field_c;
    static String[] field_b;
    static String field_e;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 >= -43) {
          il.a(-15);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        var2 = -24 / ((param1 - -7) / 40);
        if (param0 < 65) {
          if (param0 >= 97) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (90 < param0) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new bd(540, 140);
        field_b = new String[]{"Starship Trooper", "Alien Bane", "Starship Warrior", "Starship Marine", "Starship Commando", "Eat This!", "Pyromaniac", "Giblet Maker", "Sniper", "Blaster", "Cool Killer", "Golden Reactor", "Golden Turret", "Golden Claw", "Golden Egg", "Golden Queen", "Golden Gun", "Postal", "Phoenix Nova", "Boldly Go", "Megacide", "Outpatient", "B&E", "Oology", "Monstracide", "Arsenal", "Trimonstracide", "Unimanus", "Ovaphobia", "Harsh Language", "Gordon's Alive!", "Starship Champion", "Starship Guard", "Golden Key", "Golden Shield", "Golden Guard", "Golden Wheel", "Golden Lights", "Golden Bomb", "Golden Parachute", "Golden Sunset", "Diamond Champion"};
        field_d = "Instructions";
        field_a = "<col=ffff00>Destination - Kerrus</col><br><br>20 days ago, we received what appeared to be a distress call originating from the Kerrus Research Base.<br><br>The military transport Hammerhead was sent to determine what had happened. Since its ETA on Kerrus, the Starship Hammerhead has failed to report on its mission, and we have been unable to re-establish contact. Discontent has become a serious problem among UFE personnel in recent years, and the possibility of insurrection has not been ruled out.<br><br>At the Senate's request, we are dispatching you to Kerrus. Infiltrate the Hammerhead and regain control over the ship and crew. Then ensure that the Hammerhead's mission on Kerrus is completed.<br><br>Good luck, marine.";
        field_e = "SELECT LEVEL SET";
    }
}
