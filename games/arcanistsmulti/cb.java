/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static boolean field_a;
    static int field_f;
    static long field_e;
    static String field_d;
    static boolean field_b;
    static String field_c;

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 19) {
            cb.a((byte) 112);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(na param0, int param1) {
        na var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            param0.a(true);
            var3 = 19 % ((-78 - param1) / 48);
            var2 = (na) ((Object) vh.field_a.b(12623));
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param0, 2)) {
                    break L2;
                  } else {
                    var2 = (na) ((Object) vh.field_a.a(0));
                    continue L1;
                  }
                }
              }
              if (var2 != null) {
                da.a(var2, 20, param0);
                break L0;
              } else {
                vh.field_a.b(param0, -1);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("cb.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Kit up your character on the '<%0>' screen and look at the tutorial to learn how to play the game.  After learning the basics, enter the lobby and join a Rated game to earn wands. <col=FF0000>(Members only)</col> Any wands you earn can be spent on the '<%1>' screen to gain new spells with which to fight your opponents.";
        field_c = null;
    }
}
