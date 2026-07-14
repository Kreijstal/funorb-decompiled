/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static vh field_c;
    static gb field_a;
    static String field_b;
    static int field_e;
    static int field_d;
    static String field_f;

    final static void a(boolean param0, gb param1) {
        qf var2 = null;
        qf.a(param1.a("", "headers.packvorbis", 0));
        var2 = qf.a(param1, "jagex logo2.packvorbis", "");
        if (!param0) {
          field_a = null;
          jb discarded$4 = var2.c();
          return;
        } else {
          jb discarded$5 = var2.c();
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > param2) {
          var3 = param2;
          param2 = param0;
          param0 = var3;
          L0: while (true) {
            if (param0 == 0) {
              if (param1 != 44) {
                field_f = null;
                return param2;
              } else {
                return param2;
              }
            } else {
              var3 = param2 % param0;
              param2 = param0;
              param0 = var3;
              continue L0;
            }
          }
        } else {
          L1: while (true) {
            if (param0 == 0) {
              if (param1 != 44) {
                field_f = null;
                return param2;
              } else {
                return param2;
              }
            } else {
              var3 = param2 % param0;
              param2 = param0;
              param0 = var3;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, jb[] param1, int param2, boolean param3) {
        if (!param3) {
          field_d = 29;
          jh.a(uh.field_i, (byte) 51, param2, param1, param0);
          return;
        } else {
          jh.a(uh.field_i, (byte) 51, param2, param1, param0);
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = 124 / ((param0 - -61) / 61);
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=ffffff>Flamethrower</col><br>The flamethrower is highly effective against larger organic targets, but burns fuel fast. It is best used as a back-up weapon in tight situations.";
        field_f = "The left and right mouse buttons fire the marine's primary and secondary weapons, respectively.";
    }
}
