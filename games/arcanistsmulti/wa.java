/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends kc {
    static String field_Db;
    String field_Cb;
    String field_Lb;
    kc field_Fb;
    kc field_Jb;
    int field_Bb;
    static boolean field_Nb;
    static String field_Hb;
    static boolean field_Kb;
    static kc field_Pb;
    String field_Gb;
    kc field_Mb;
    static String field_Eb;
    String field_Ib;
    static boolean field_Ob;

    public static void f(byte param0) {
        if (param0 >= -62) {
            Object var2 = null;
            int discarded$0 = wa.a(';', (CharSequence) null, (byte) -35);
        }
        field_Db = null;
        field_Eb = null;
        field_Pb = null;
        field_Hb = null;
    }

    wa() {
        super(0L, (kc) null);
    }

    final static int a(char param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 0;
        if (param2 == -16) {
          var4 = param1.length();
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4) {
              return var3;
            } else {
              if (param0 == param1.charAt(var5)) {
                var3++;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return -10;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "You need to play <%0> more rated games to unlock this option.";
        field_Eb = "Connection lost. <%0>";
        field_Hb = "Show game chat from my friends";
    }
}
