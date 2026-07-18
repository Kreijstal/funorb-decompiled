/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_c;
    static String[] field_d;
    static String[] field_a;
    static String field_f;
    static int[] field_h;
    static String[] field_g;
    static int[] field_e;
    static vh field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              jc.a(0, (java.awt.Component) (Object) param0);
              if (param1 == 2) {
                break L1;
              } else {
                var3 = null;
                kc.a((java.awt.Canvas) null, -76);
                break L1;
              }
            }
            hi.a((java.awt.Component) (Object) param0, param1 ^ -14764);
            if (null == oa.field_a) {
              break L0;
            } else {
              oa.field_a.a((byte) 104, (java.awt.Component) (Object) param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("kc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_b = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_d = new String[]{"Pot two balls in one shot.", "Get out of a snooker without fouling.", "Get out of a snooker and pot a ball.", "Pot a ball with a three-ball plant.", "Plant-pot five balls in a single game.", "Cover all six pockets with your balls.", "On break of an eight-ball game, miss all balls and hit all cushions.", "Pot all of your balls before your opponent pots any of theirs.", "Get a perfect break in nine-ball (pot all nine balls without missing a shot).", "Pot the 9 ball with the 1 ball (in nine-ball).", "Gain a Rating of 2000.", "Make three or more fouls in an eight-ball game, then get a perfect break.", "Pot all of your balls and the 8 ball in the same pocket and win the game.", "Pot at least one of your balls in each pocket and win the game.", "Win 10 Rated games consecutively.", "#Break an opponent's winning streak (of 10 games or more).", "Beat someone who has the Smell of Money and the Colour of Money Achievements (or a FunOrb Dev Mod).", "Pot the black after four or more cushion rebounds.", "Win one game on every table consecutively.", "Get a perfect break in nine-ball, with all balls potted in the correct order.", "Complete the time trial in under 3 minutes.", "Complete the time trial without fouling.", "Complete the time trial, potting a ball on every shot after the break.", "Complete the time trial in under 3 minutes without guides on.", "Complete the time trial without fouling without guides on.", "Complete the time trial, potting a ball on every shot after the break without guides on.", "During Hallowe'en, pot the glowing-eyed skull a Killer Game on the Aztec table."};
        field_h = new int[]{2, 20, 21, 49, 6, 5, 10, 11, 13};
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
