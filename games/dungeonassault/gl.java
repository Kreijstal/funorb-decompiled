/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static String field_Jb;
    static wh field_Ib;
    static r field_Gb;
    static String[] field_Kb;
    static String field_Hb;
    static boolean field_Lb;

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == 0) {
          param0 = tg.a('_', param0, 3, "");
          var3 = sh.a((byte) -124, param2);
          if ((param0.indexOf(param2) ^ -1) == 0) {
            if (param0.indexOf(var3) != -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    public static void c(byte param0) {
        field_Jb = null;
        field_Ib = null;
        field_Gb = null;
        if (param0 != -105) {
            return;
        }
        field_Hb = null;
        field_Kb = null;
    }

    private gl() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Continue";
        field_Lb = false;
        field_Hb = "Incapacitated";
        field_Kb = new String[]{"Glamour", "Monster <%attack> and <%defence> halved in the next room. (Single use)"};
        field_Gb = new r();
    }
}
