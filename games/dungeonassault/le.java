/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static String field_a;
    static cn field_d;
    static cn field_f;
    static String[] field_c;
    static gn[][] field_b;
    static pp field_g;
    static String field_e;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var5 = (CharSequence) (Object) param0;
        var3 = jm.a((byte) 59, var5);
        if (param2 < -22) {
          var6 = (CharSequence) (Object) param1;
          var4 = jm.a((byte) 59, var6);
          if (var3 != null) {
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          } else {
            if (var4 != null) {
              if (var3 != null) {
                if (var4 == null) {
                  return false;
                } else {
                  return var3.equals((Object) (Object) var4);
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 < 97) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> of your Renown will be lost if you fail to reach the hoard room in a raid.";
        field_e = "The heavy armour of the <%0> deflects the blow!";
        field_c = new String[]{null, "There are a number of different strategies a raider can employ against a monster, displayed in the bottom-right, below the room's statistics. For now, we'll use <%advance>.<br><br><%command>Click the shield icon - <%advance> - to begin combat.</col>"};
    }
}
