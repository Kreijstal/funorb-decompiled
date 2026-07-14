/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_a;
    static String[] field_b;
    static StringBuilder field_e;
    static String field_d;
    static int field_f;
    static boolean field_c;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0 != -21727) {
            gh.a(-77);
        }
    }

    final static void a(int param0, ta param1, int param2, int param3, int param4, int param5, dh param6, dh param7, int param8, int param9, ta param10, ta param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        if (param8 != 12) {
          gh.a(71, (ta) null, 110, 68, 116, -46, (dh) null, (dh) null, 98, -11, (ta) null, (ta) null, -41, 115, -68, 100, 62, 64, -15, -127);
          oc.field_m = param7;
          lj.field_r = param6;
          lj.a(param16, param13, param12, 0, param4);
          ka.a(param0, -28, param5, param11);
          cd.a(param10, param1, param19, 7, param18, param2);
          qg.a(param3, param9, (byte) -119);
          fq.a((byte) 94, param15, param17, param14);
          return;
        } else {
          oc.field_m = param7;
          lj.field_r = param6;
          lj.a(param16, param13, param12, 0, param4);
          ka.a(param0, -28, param5, param11);
          cd.a(param10, param1, param19, 7, param18, param2);
          qg.a(param3, param9, (byte) -119);
          fq.a((byte) 94, param15, param17, param14);
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        hq.b(true, param1, 0);
        if (param0 < 119) {
            gh.a(35);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"<bab:heading1>Objective:<br>Keep the ball in play by bouncing it off of your paddle and destroy as many bricks as you can.<br><br><bab:heading1>Controls:<br><bab:heading2>Player 1<br><img=1><img=0> - Move the paddle left and right.<br><bab:vspace><img=2> - Launch a stationary ball or detonate charged balls.<br><bab:heading2>Player 2<br><img=4><img=3> - Move the paddle left and right.<br><img=5> - Launch a stationary ball or detonate charged balls.", "<bab:heading1>Power-ups:<br>Bricks with icons have power-ups associated with them. Destroy enough of each type and they will release that power-up for you to collect with your paddle.<br><br><bab:heading1>Types:<br><bab:smlvspace><img=32> - Confuse: reverse the paddle's controls.<bab:smlvspace><br><bab:smlvspace><img=33> - Strong: balls destroy bricks without bouncing.<bab:smlvspace><br><bab:smlvspace><img=34> - 1-UP: an extra life.<br><bab:smlvspace><img=35> - Blind: distorts your screen.<bab:smlvspace><br><bab:smlvspace><img=36> - Shrink: makes your paddle shorter.<bab:smlvspace><br><bab:smlvspace><img=37> - Accelerate: paddle increases the ball's velocity.<bab:smlvspace><br>", "<bab:heading1>Power-ups (continued):<br><bab:smlvspace><img=38> - Wipe out: cancels out any positive power-ups.<bab:smlvspace><br><bab:smlvspace><img=39> - Multiball: splits your ball into eight balls.<bab:smlvspace><br><bab:smlvspace><img=40> - Speed up: increases the speed of any ball in play.<bab:smlvspace><br><bab:smlvspace><img=41> - Aftertouch: flight control.<bab:smlvspace><br><bab:smlvspace><img=42> - Speed down: decreases the speed of any ball in play.<bab:smlvspace><br><bab:smlvspace><img=43> - Sticky: any balls that hit the paddle stick to it.<bab:smlvspace><br><bab:smlvspace><img=44> - Weak: your ball will be unable to destroy any bricks.<bab:smlvspace><br><bab:smlvspace><img=45> - Build: Adds a row of bricks to the top of the level.<bab:smlvspace><br><bab:smlvspace><img=46> - Grow: makes your paddle longer.<bab:smlvspace><br>", "<bab:heading1>Power-ups (continued):<br><bab:vspace><img=47> - Charge: instantly charges the ball.<bab:smlvspace><br><br><bab:heading1>Special bricks:<br><bab:smlvspace><img=1> - Invincible: these can never be destroyed.<bab:smlvspace><br><bab:smlvspace><img=48> - Bottom-heavy: can only be destroyed from above.<bab:smlvspace><br><bab:smlvspace><img=49> - Top-heavy: can only be destroyed from below.<bab:smlvspace><br><bab:smlvspace><img=50>,<img=51>,<img=52> - Counter: require the indicated number of hits to destroy.<bab:smlvspace><br><bab:smlvspace><img=54> - Switch: turns <img=55> into <img=56> and vice versa.<bab:smlvspace><br><bab:smlvspace><img=55> - Armoured: invincible until you switch them with a Switch block.<bab:smlvspace><br><bab:smlvspace><img=57> - Teleport: who knows where the ball will end up?<bab:smlvspace><br>", "<bab:heading1>Multiplayer:<br>Multiplayer games are a race to see who can destroy the most bricks in the least time.<bab:smlbr><br>A race track is drawn around the the edge of the play area, with players starting an equal distance apart. You gain ground on your opponents by destroying bricks faster than them - if you catch up with them, they have 10 seconds to get in front of you again. If they fail, you have knocked them out.<bab:smlbr><br>To win, knock out all of your opponents or, in games with a limited number of levels, reach the end of the levels first.<bab:smlbr><br>To make things a little more interesting, some of the power-ups only affect your opponents."};
        field_a = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_d = "<%0> is already on your friend list.";
        field_e = new StringBuilder(12);
        field_c = true;
    }
}
