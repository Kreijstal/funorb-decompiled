/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lw extends IOException {
    static tf field_d;
    static String[] field_a;
    static ku field_e;
    static String field_h;
    static tf field_g;
    static String field_f;
    static int[] field_c;
    static int[] field_b;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        if (param2 <= param0) {
          if (param1 <= param0) {
            if (param2 >= param1) {
              qe.a(param2, param4, -2178, param0, param7, on.field_a, param1, param6, param5);
              var8 = 91 / ((-2 - param3) / 51);
              return;
            } else {
              qe.a(param1, param4, -2178, param0, param7, on.field_a, param2, param5, param6);
              var8 = 91 / ((-2 - param3) / 51);
              return;
            }
          } else {
            qe.a(param0, param6, -2178, param1, param7, on.field_a, param2, param5, param4);
            var8 = 91 / ((-2 - param3) / 51);
            return;
          }
        } else {
          if (param1 <= param2) {
            if (param1 <= param0) {
              qe.a(param0, param5, -2178, param2, param7, on.field_a, param1, param6, param4);
              var8 = 91 / ((-2 - param3) / 51);
              return;
            } else {
              qe.a(param1, param5, -2178, param2, param7, on.field_a, param0, param4, param6);
              var8 = 91 / ((-2 - param3) / 51);
              return;
            }
          } else {
            qe.a(param2, param6, -2178, param1, param7, on.field_a, param0, param4, param5);
            var8 = 91 / ((-2 - param3) / 51);
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_a = null;
        field_e = null;
        field_c = null;
        int var1 = -47 % ((-82 - param0) / 38);
        field_f = null;
        field_b = null;
        field_g = null;
    }

    lw(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Max out one player's stats.", "Get into the Pebble Playoffs.", "Get into the Cobalt Conference.", "Get into the Sandstone Series.", "Get into the Quartz Cup.", "Get into the Crystal Circuit.", "Get into the Diamond Division.", "Win the Diamond Division.", "Score 250 goals.", "Be on the winning team 50 times (Team<nbsp>games<nbsp>only).", "Own all of the kits.", "Own all of the pitches.", "Beat the player who last beat you.", "Win by at least 3 goals (Rated<nbsp>only).", "Score to win the match in the last 5 seconds (Rated<nbsp>only).", "Win at least one match on each pitch.", "Beat a developer or someone else with this Achievement.", "Score from a header.", "Win a match having never lost the ball to a tackle (Rated<nbsp>only).", "Win 5 - 0 (Rated<nbsp>only).", "In one match, play with a Tank, Ranger, Hotshot and Elite, score with all four AND win (Rated<nbsp>only).", "Win a match using every formation.", "Score a hat-trick with one of your players. (Rated<nbsp>only)", "Score a hat-trick with every player in your team. (Rated<nbsp>only)", "Win a match without your opponent's keeper ever touching the ball. (Rated<nbsp>only)", "Score in the first 10 seconds of a match. (Rated<nbsp>only)", "From being behind by 3 goals or more, go on to win the match. (Rated<nbsp>only)", "Win an 8-player match. (Team<nbsp>games<nbsp>only)", "Perform 10 or more passes in a row and score. (Rated<nbsp>only)", "While winning, dribble to all four corners of the pitch, without passing or being tackled. (Rated<nbsp>only)", "Save the game by scoring to draw in the last 5 seconds. (Team<nbsp>games<nbsp>only)", "Score a goal with one pass from your keeper to the goalscorer. (Rated<nbsp>only)", "Score 100 goals in Horror Costume between October 28th and November 11th. (Rated<nbsp>only)", "Win a tournament with 8 or more starting players", "Win a 16 player tournament", "Win 10 tournaments with at least 8 players in each tournament", "Win a tournament with 8 or more starting players, scoring a goal in each game and never conceeding a goal", "Have a posession average of at least 50% at the end of a game", "Have a posession average of at least 60% at the end of a game", "Have a posession average of at least 70% at the end of a game", "Have an overall posession average of at least 50% at the end of a tournament with at least 8 people", "Have an overall posession average of at least 60% at the end of a tournament with at least 8 people", "Have an overall posession average of at least 70% at the end of a tournament with at least 8 people", "Knock a moderator out of a tournament", "In a single game, average at least a 50% tackle success rate, performing at least 10 tackles", "In a single game, average at least a 75% tackle success rate, performing at least 10 tackles", "In a single game, average at least a 90% tackle success rate, performing at least 10 tackles", "At the end of a tournament with at least 8 people, average at least a 50% tackle success rate, performing at least 10 tackles", "At the end of a tournament with at least 8 people, average at least a 75% tackle success rate, performing at least 10 tackles", "At the end of a tournament with at least 8 people, average at least a 90% tackle success rate, performing at least 10 tackles", "Score the most goals in a tournament with at least 8 people (Min<nbsp>5<nbsp>goals)", "Pass the ball the most in a tournament with at least 8 people (Min<nbsp>10<nbsp>passes)", "Make the most successful tackles in a tournament with at least 8 people (Min<nbsp>10<nbsp>tackles)", "Win a game never sprinting (Rated<nbsp>only)", "Beat the current leader in the Diamond Division (Rated<nbsp>only)", "Win a game only using Tanks (Rated<nbsp>only)", "Win a game only using Rangers (Rated<nbsp>only)", "Win a game only using Hotshots (Rated<nbsp>only)", "Win a game using no Tanks or Tank Clones (Rated<nbsp>only)", "Win a game using no Rangers or Ranger Clones (Rated<nbsp>only)", "Win a game using no Hotshots or Hotshot Clones (Rated<nbsp>only)", "Defeat a team of Elites, using no Elites yourself (Rated<nbsp>only)", "Stay in defence for the whole of an 8 player game and never conceed a goal (8<nbsp>player<nbsp>team<nbsp>game<nbsp>only)", "Win a tournament with 8 or more starting players, winning each game by ONLY one goal", "In a single game, have the lowest average posession, but score the most goals", "At the end of a tournament with at least 8 people, have the lowest average posession, but score the most goals", "Knock 100 people out of tournaments with at least 8 people", "Score from a slide tackle", "Head the ball twice before it touches the floor", "Score a goal from outside of the larger box", "Score a goal from a huge distance", "In an 8 Player team game, score ALL your team's goals and win (8<nbsp>player<nbsp>team<nbsp>game<nbsp>only)", "Score from a header, a slide tackle and a kick ONLY in under 90 seconds"};
        field_e = new ku();
        field_h = "stats";
        field_g = new tf();
        field_f = "tackles";
        field_c = new int[5];
        field_b = new int[5];
        int var0 = 568;
        int var1 = 628;
        int var2 = 240;
        field_b[0] = 448;
        int var3 = 340;
        field_b[1] = var0;
        field_c[0] = 42;
        field_c[1] = var2;
        field_b[2] = -var0 + 896;
        field_b[3] = var1;
        field_c[2] = var2;
        field_b[4] = -var1 + 896;
        field_c[3] = var3;
        field_c[4] = var3;
    }
}
