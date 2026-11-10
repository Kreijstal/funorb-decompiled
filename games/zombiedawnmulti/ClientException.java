/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static boolean field_b;
    String field_k;
    static UiComponent field_h;
    static Sprite field_e;
    Throwable field_f;
    static String field_l;
    static int field_c;
    static String field_g;
    static String field_j;
    static int field_d;
    static int[] field_a;
    static int field_i;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 != 26677) {
          return;
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_j = null;
        field_e = null;
        field_l = null;
    }

    final static AttackEvent a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        AttackEvent var6 = null;
        if (param3 > 86) {
          var6 = (AttackEvent) (ic.field_c.removeLast(62));
          if (var6 == null) {
            var6 = new AttackEvent();
          }
          var6.a(param4, param5, param1, param2, (byte) 14, param0);
          return var6;
        }
        return (AttackEvent) null;
    }

    ClientException(Throwable param0, String param1) {
        this.field_f = param0;
        this.field_k = param1;
    }

    static {
        field_z = "fn.A(";
        field_e = new Sprite(640, 480);
        field_l = "Your game";
        field_g = "Please try changing the following settings:  ";
        field_c = 0;
        field_j = "Open new ways to victory.";
        field_a = new int[43];
    }
}
