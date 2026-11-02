/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static int field_d;
    static String ignorelistdupe;
    static String playerX2AreOut;
    static vh field_c;

    final static im a(int param0, long param1) {
        if (param0 != 0) {
          mg.a(-80);
          return (im) (ln.field_n.a(param1, false));
        }
        return (im) (ln.field_n.a(param1, false));
    }

    final static boolean a(int param0) {
        int var1 = -30 / ((-4 - param0) / 49);
        if (jd.field_c == null) {
          return false;
        }
        if (ta.field_a == tl.field_J) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        playerX2AreOut = null;
        field_c = null;
        ignorelistdupe = null;
        if (param0 >= -40) {
          mg.a(true);
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          return false;
        }
        if (NanoTickClock.b(-18)) {
          stackIn_7_0 = true;
        } else {
          if (0 >= UsernameSuggestionsPanel.field_V) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    static {
        ignorelistdupe = "<%0> is already on your ignore list.";
        playerX2AreOut = "<%0> and <%1> are out of lives!";
    }
}
